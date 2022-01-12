package org.testing.TestCases;

import java.io.IOException;
import java.util.Properties;

import org.testing.Resources.LoadFileJSON;
import org.testing.TestSteps.HTTPmethod;
import org.testing.Utilities.LoadPropertiesFile;
import org.testing.Utilities.jsonVariable;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC4 {

	public void testcase4()throws IOException	
	
	{
		Properties pr =LoadPropertiesFile.propertiesfile("../NewFramework/src/test/java/URI.properties");
		String bodydata=LoadFileJSON.JsonLoading("../NewFramework/src/test/java/org/testing/Payloads/bodyDataforUpdate.json");
		
		
		bodydata=jsonVariable.jsonVariableReplacement(bodydata, "id", TC1.responseidValue);
	 	HTTPmethod http =new HTTPmethod(pr);
	 	Response res = http.updateRecord (bodydata, "QA_STUDENT_URI",TC1.responseidValue);
         System.out.println("status code is " +res.statusCode());	
         System.out.println("data after put call" );
         System.out.println(res.asString());
 	}
	

}
