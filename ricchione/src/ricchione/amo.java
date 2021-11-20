package ricchione;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

import org.json.JSONArray;
import org.json.JSONException;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class amo {

	public static void main(String[] args) throws ParseException, JSONException {
		
		
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
			        
			        
			        
			        JSONObject obj=(JSONObject) JSONValue.parse(line);
			        JSONObject we=(JSONObject) obj.get("main");
			        Object elleh=we.get("pressure");
			       
			   System.out.println("la pressione è "+elleh);
			   
			        

			     

			        //Cast del campo main a String
			       /* String value = main_press.toString();

			        /*Indice del carattere iniziale:
			                   |
			                   v 
			        "pressure":0000*/
			        //int index = (value.indexOf("pressure") + 10);

			        /*Indice del carattere finale:
			                      |
			                      v 
			        "pressure":0000*/
			        /*int index_end = (value.indexOf("feels") - 2);
			        String pressure = new String();
			        //Leggo da indice iniziale ad indice finale
			        pressure = value.substring(index, index_end);
			        System.out.println(pressure);
			        
			      //Adesso scrivo sul file
			        FileWriter fd = new FileWriter("pressure.txt");
			        for(int i=0;i<10;i++) {
			        	
			        	fd.append(pressure +" , ");
			        }/*
			        //fd.write("Pressione: " + pressure);
			        //chiudo file
			        fd.close();*/
			        
				}
				catch(IOException e) {
			        System.err.println(e.getMessage());
			        e.printStackTrace();
			        System.exit(100);
			    }
			        
			   
				
				
				
				
				
				
				
				}

				
				

	

}
