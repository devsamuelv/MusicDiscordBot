package util;

import java.io.FileReader;

import org.json.simple.*;
import org.json.simple.parser.JSONParser;

public class Json {
    public String readToken(final String path) {

        String token = null;

        try {
            JSONParser parser = new JSONParser();

            Object obj = parser.parse(new FileReader(path));
    
            JSONObject JObj = (JSONObject) obj;

            token = (String) JObj.get("token");

        } catch (Exception e) {
            e.printStackTrace();
        }

        return token;
        
    }
}