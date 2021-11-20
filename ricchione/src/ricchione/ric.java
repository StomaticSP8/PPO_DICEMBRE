package ricchione;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Vector;

import org.json.JSONException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ric {

	public static void main(String[] args) throws ParseException {
		
			try {

			        //StringBuilder buffer = new StringBuilder();

			        String nomecitta = "Los Angeles";
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
			        
			        Vector<JSONValue> e=new Vector();
			        JSONParser parser = new JSONParser();
			        JSONObject obj = (JSONObject) parser.parse(line);
			       
			       // obj.get("pressure");
			        
			        System.out.println(obj.get("main"));
			        JSONObject gesu=(JSONObject) obj.get("main");
			         
			       
			        obj.get("pressure");
			       
			        
			        System.out.println(obj);
			        
			        
			        //Object main_press =obj.get("main");
			       // System.out.println(main_press);
			       
			       /* int i=0;
			        do {
			        Object main_press = obj.get("main");
			        //obj.get("pressure");
			        System.out.println(main_press);
			        
			        i++;
			        }while(i<8);*/

			        
			        
			        
			        
			        
			        
			        
			        
			        
			       /* Object obj = (JSONObject) JSONValue.parse(line);
			        JSONArray array = (JSONArray)obj;

			        
			        System.out.println(array.get(1));
			        System.out.println();

			        JSONObject obj2 = (JSONObject)array.get(1);
			        System.out.println("Field \"1\"");
			        System.out.println(obj2.get("1"));    */
			      

			        
			       
			       
			}catch(IOException e) {
		        System.err.println(e.getMessage());
		        e.printStackTrace();
		        System.exit(100);
		    }
				
			
			}

}
