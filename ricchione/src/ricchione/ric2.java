package ricchione;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.ParseException;

public class ric2 {
	private JSONArray ja = null;
	private JSONObject jo = null;
	
	public ric2() {
		this.jo = new JSONObject();
		this.ja = new JSONArray();
	}

	public JSONArray getArray() {
		return ja;
	}

	public void setArray(JSONArray ja) {
		this.ja = ja;
	}

	public JSONObject getObject() {
		return jo;
	}

	public void setObject(JSONObject jo) {
		this.jo = jo;
	}
	
	/**
	 * Inserisco un JSONObject nel mio JSONArray.
	 * @param jo JSONOnject
	 */
	public void insertObject(JSONObject jo) {
		this.ja.add(jo);
	}
	public void chiamataAPI( boolean isObject) {
		try { String nomecitta = "Los Angeles";
        String units = "metric";
        String Apikey = "aa0854721ceebf98625f7753971cd283";

        String url_String = "https://api.openweathermap.org/data/2.5/weather?q=" + nomecitta + "&appid=" + Apikey + "&units=" + units;

        URL myURL = new URL(url_String); //Crea URL 

        URLConnection openWeather = myURL.openConnection();
	    BufferedReader in = new BufferedReader(new InputStreamReader(openWeather.getInputStream()));

        String line;
        /*while((line = in.readLine()) != null) {
            buffer.append(line);
        }*/

        line = in.readLine();
        in.close();
			
			
			//System.out.println("Dati scaricati: "+data);
			if(isObject) {
				this.jo = (JSONObject) JSONValue.parseWithException(line);	 //parse JSON Object
				System.out.println("JSONObject scaricato: "+ this.jo);
			} else {
				this.ja = (JSONArray) JSONValue.parseWithException(line);	//parse JSON Array
				System.out.println("JSONArray scaricato: "+ this.ja);
				System.out.println("IL JSONArray scaricato ha "+ this.ja.size()+" elementi:");
			
				/* Esempio di array scaricato:
				 * 
				 * [{"id":"90b...",
				 * 		"type":"Full Time",
				 * 		"url":"https://jobs.github.com/...",
				 * 		"created_at":"Tue Nov 10 23:16:58 UTC 2020",
				 * 		"company":"Gemini",
				 * 		"company_url":"http://www.gemini.com",
				 * 		"location":"San Francisco, CA",
				 * 		"title":"Principal Product Security Engineer",
				 * 		"description":"\u003cp\u003e\u003cstrong\u003eHelp Us...",
				 * 		"how_to_apply":"\u003cp\u003ePlease apply via this link: ",
				 * 		"company_logo":null},
				 * {...}
				 * ]
				 */
				for(int i=0;i<this.ja.size();i++) {
					JSONObject jo = (JSONObject) this.ja.get(i);
					System.out.println(i+") "+jo.get("title"));
				}
			}
				
		} catch (IOException | ParseException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

}
