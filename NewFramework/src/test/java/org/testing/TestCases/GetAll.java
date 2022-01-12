package org.testing.TestCases;

import java.io.IOException;
import java.util.Properties;

import org.testing.TestSteps.HTTPmethod;
import org.testing.Utilities.LoadPropertiesFile;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class GetAll {

	public void testcase6()throws IOException{
		Properties pr =LoadPropertiesFile.propertiesfile("../NewFramework/src/test/java/URI.properties");

	 	HTTPmethod http = new HTTPmethod(pr);
	 	 Response res =http.getAllRecords("QA_STUDENT_URI");
	 	 System.out.println("status code is "+res.statusCode() );
	 	 System.out.println("response code is " +res.asString());
	 	 
	 	
		
	}
	

}
