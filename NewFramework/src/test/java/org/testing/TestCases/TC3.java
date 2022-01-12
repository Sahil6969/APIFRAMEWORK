package org.testing.TestCases;

import java.io.IOException;
import java.util.Properties;

import org.testing.TestSteps.HTTPmethod;
import org.testing.Utilities.LoadPropertiesFile;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC3 {

	public void testcase3() throws IOException
	{
		Properties pr =LoadPropertiesFile.propertiesfile("../NewFramework/src/test/java/URI.properties");

	 	HTTPmethod http = new HTTPmethod(pr);	
	 	Response res=http.getAllRecords("QA_STUDENT_URI");
	 	System.out.println("Status code is ");
	 	System.out.println(res.statusCode());
	 	System.out.println("response is ");
	 	System.out.println(res.asString());
	 	
		
		}
		
		
	}


