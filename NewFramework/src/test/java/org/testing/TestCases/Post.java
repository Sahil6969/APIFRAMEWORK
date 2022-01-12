package org.testing.TestCases;

import java.io.IOException;
import java.util.Properties;

import org.testing.Resources.LoadFileJSON;
import org.testing.TestSteps.HTTPmethod;
import org.testing.Utilities.LoadPropertiesFile;
import org.testing.Utilities.RandomData;
import org.testing.Utilities.jsonParsing;
import org.testing.Utilities.jsonVariable;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Post {

	static String responseidValue;
	@Test
	public void testcase7()throws IOException
	{
		Properties pr =LoadPropertiesFile.propertiesfile("../NewFramework/src/test/java/URI.properties");
		String bodydata=LoadFileJSON.JsonLoading("../NewFramework/src/test/java/org/testing/Payloads/newbodydata.json");
		bodydata=jsonVariable.jsonVariableReplacement(bodydata, "id", RandomData.random());
	 	HTTPmethod http =new HTTPmethod(pr);
	 	Response res=http.postMethod(bodydata,"QA_STUDENT_URI");
	 	System.out.println("status code is " +res.getStatusCode());
	 	System.out.println("response is " +res.asString());
	 	responseidValue=jsonParsing .jsonParse(res.asString(),"id");
	}

}