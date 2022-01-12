package org.testing.TestSteps;
import static io.restassured.RestAssured.given;

import java.util.Properties;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class HTTPmethod {
	
	Properties pr;
	public HTTPmethod(Properties pr) {
		this.pr=pr;
	}
	
	public Response postMethod(String bodydata,String urikey)
	{
		Response res =
		given()
        .contentType(ContentType.JSON)
        .body(bodydata)
        .when()
        .post(pr.getProperty(urikey));
        System.out.println("Status code is "+res.statusCode());        
		return res;
	}
	
	public Response getMethod(String uriKey, String id )
	{
		
		String uri =pr.getProperty(uriKey)+"/"+id;
		Response res=
		given().contentType(ContentType.JSON)
		.when().get(uri);
		
		return res;
	}
	
	
	
	public Response getAllRecords(String uriKey )
	{
		String uri= pr.getProperty(uriKey);
		
	
		Response res=
		given().contentType(ContentType.JSON)
		.when()
		.get(uri);
		
		return res;
		
	}
	
	public Response updateRecord(String bodyData,String uriKey,String idvalue) 
	{
		String uri =pr.getProperty(uriKey)+ "/" +idvalue;
		Response res = 
				given()
				.contentType(ContentType.JSON)
				.body(bodyData)
			    .when()
                .put(uri);
		return res;
	}
	public Response delete(String uriKey, String id )
	{
		
		String uri =pr.getProperty(uriKey)+"/"+id;
		Response res=
		given().contentType(ContentType.JSON)
		.when().delete(uri);
		
		return res;
	}
	

	
}




