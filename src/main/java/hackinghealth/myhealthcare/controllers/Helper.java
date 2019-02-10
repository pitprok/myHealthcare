package hackinghealth.myhealthcare.controllers;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.*;

/**
 *
 * @author admin
 */
public class Helper {

    /**
     * @param args the command line arguments
     */
    public static Map<String, String> allergyJsonData(String jsonString) {
        String result = null;
        Map<String, String> results = new HashMap<>();
        result = retrieveItem(jsonString);
        if (!(result == null)) {
            results.put("item", result);
        }
        result= retrieveManifestation(jsonString);
        if (!(result == null)) {
            results.put("manifestation", result);
        }
        result=retrieveCriticality(jsonString);
        
        if (!(result == null)) {
            results.put("criticality", result);
        }
        return results;
    }

    public static String retrieveItem(String jsonString) {
        String result = null;

        try {

            JSONObject obj = new JSONObject(jsonString);
            JSONObject obj2 = obj.getJSONObject("code");
            JSONArray array = obj2.getJSONArray("coding");
            for (int i = 0; i < array.length(); i++) {
                result = array.getJSONObject(i).getString("display");
                if (!(result == null)) {
                    break;
                }

            }
            return result;
        } catch (JSONException ex) {
            Logger.getLogger(Helper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }

    public static String retrieveManifestation(String jsonString) {
        String result = null;

        try {

            JSONObject obj = new JSONObject(jsonString);
            JSONArray array = obj.getJSONArray("reaction");
//             System.out.println(result);
            System.out.println(array);
            JSONArray array2=retrieveJSONArray(array, "manifestation");
            System.out.println(array2);
            JSONArray array3=retrieveJSONArray(array2,"coding");
            result=retrieveJSONPart(array3,"display");
//            JSONArray array2=new JSONArray(result);
//            result = retrieveJSONPart(array2, "coding");
//            System.out.println(result);
//            JSONArray array3 = new JSONArray(result);
//            result = retrieveJSONPart(array3, "display");
//            System.out.println(result);


        } catch (JSONException ex) {
            Logger.getLogger(Helper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
    
    private static JSONArray retrieveJSONArray(JSONArray array, String requiredJson) {
        JSONArray result = null;
        for (int i = 0; i < array.length(); i++) {
            result = array.getJSONObject(i).getJSONArray(requiredJson);
            if (!(result == null)) {
                break;
            }
        }
        return result;
    }

    private static String retrieveJSONPart(JSONArray array, String requiredJson) {
        String result = null;
        for (int i = 0; i < array.length(); i++) {
            System.out.println(array);
            JSONObject obj = array.getJSONObject(i);
            System.out.println(obj);
            result=obj.getString(requiredJson);
            if (!(result == null)) {
                break;
            }
        }
        return result;
    }
    
    public static String retrieveCriticality(String jsonString) {
        String result = null;

        try {

            JSONObject obj = new JSONObject(jsonString);
             result =obj.getString("criticality");
            return result;
        } catch (JSONException ex) {
            Logger.getLogger(Helper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
}
