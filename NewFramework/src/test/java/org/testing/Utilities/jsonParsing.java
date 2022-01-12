package org.testing.Utilities;
import org.json.JSONArray;
import org.json.JSONObject;

import io.restassured.response.Response;
 

public class jsonParsing 
{ 
	
	public static String jsonParse(String response, String keyName)
	
	//{
		//if(response.startsWith("{"))
		{
		JSONObject ob= new JSONObject(response);
		return ob.getString(keyName);		
	//}
		//return keyName;
	
	}
	
	public static void jsonParseAllKeys(String response, String keyName) {
		//fetching all the ids from object under array
		JSONArray js = new JSONArray(response);
		int L=js.length();
		for(int i=0;i<L;i++)
		{
			
			JSONObject ob= js.getJSONObject(i);
			System.out.println(ob.get(keyName));
			
		}
		
		
	}
	public static String jsonParseUsingjsonPath(Response res,String jsonPath)
	{
		return res.jsonPath().get(jsonPath);	
				}
}
