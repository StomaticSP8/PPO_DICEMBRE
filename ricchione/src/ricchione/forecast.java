package ricchione;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Vector;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class forecast {

	public static void main(String[] args) throws JSONException, ParseException {
		try {

	        //StringBuilder buffer = new StringBuilder();

	        String nomecitta = "Los Angeles";
	        String units = "metric";
	        String Apikey = "aa0854721ceebf98625f7753971cd283";

	        String url_String = "https://api.openweathermap.org/data/2.5/forecast?q=" + nomecitta + "&appid=" + Apikey+ "&units=" + units;

	        URL myURL = new URL(url_String); //Crea URL 

	        URLConnection openWeather = myURL.openConnection();
		    BufferedReader in = new BufferedReader(new InputStreamReader(openWeather.getInputStream()));

	        String line;
	        /*while((line = in.readLine()) != null) {
	            buffer.append(line);
	        }*/

	        line = in.readLine();
	        in.close();
	       
	        JSONObject obj = new JSONObject(line);
	        Object love= obj.get("list");
	        String giggiono=love.toString();
	        Vector<String> pippo=new Vector<String>();
	        //Object ar= love.get("pressure");
	        //stocazzo.add(ar);
	        int i=0;
	        for(int j=0;j<8;j++) {
	        int index = (giggiono.indexOf("pressure") +10+i);

	        /*Indice del carattere finale:
	                      |
	                      v 
	        "pressure":0000*/
	        int index_end = (giggiono.indexOf("sea_level") -2+i);

	        String pressure = new String();
	       // while(pressure.equals(null)) {
	        //Leggo da indice iniziale ad indice finale
	        pressure = giggiono.substring(index, index_end);
	        pippo.add(pressure);
	       pippo.set(j, pressure);
	       i=i+384;
	       
	        
	    	   System.out.println(pressure);
	       }
	      
	        //System.out.println(pippo.elementAt(1));
	        

	       
	   //System.out.println("la pressione è "+obj);
          // do {
            
	        /*Indice del carattere iniziale:
	                   |
	                   v 
	        "pressure":0000*/
	        //int index = (value.indexOf("pressure") +10);

	        /*Indice del carattere finale:
	                      |
	                      v 
	        "pressure":0000*/
	        /*int index_end = (value.indexOf("sea_level") -2);

	        String pressure = new String();
	       // while(pressure.equals(null)) {
	        //Leggo da indice iniziale ad indice finale
	        pressure = value.substring(index, index_end);
	        System.out.println(pressure);
            
	        //Adesso scrivo sul file
	        FileWriter fd = new FileWriter("pressuresett.txt");
	        fd.write("Pressione: " + pressure);
	        //chiudo file
	        fd.close();//*/
	        
	        

	        
	    }

	    catch(IOException e) {
	        System.err.println(e.getMessage());
	        e.printStackTrace();
	        System.exit(100);
	    }

	    
	    
	}

	

}
