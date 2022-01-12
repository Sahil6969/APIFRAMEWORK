package org.testing.TestCases;

import java.io.IOException;
import java.util.Properties;

import org.testing.Resources.LoadFileJSON;
import org.testing.ResponseValidation.ResponseValidation;
import org.testing.TestSteps.HTTPmethod;
import org.testing.Utilities.LoadPropertiesFile;
import org.testing.Utilities.RandomData;
import org.testing.Utilities.jsonParsing;
import org.testing.Utilities.jsonVariable;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC1 {
	
	static String responseidValue;

public void testcase1()throws IOException


{
	String bodydata=LoadFileJSON.JsonLoading("../NewFramework/src/test/java/org/testing/Payloads/bodydata.json");
	String randomID=RandomData.random();
	
	bodydata=jsonVariable.jsonVariableReplacement(bodydata, "id", randomID.toString());
 	Properties pr =LoadPropertiesFile.propertiesfile("../NewFramework/src/test/java/URI.properties");

 	HTTPmethod http = new HTTPmethod(pr);
 	
 	Response res= http.postMethod(bodydata, "QA_STUDENT_URI");
     
 	responseidValue=jsonParsing .jsonParse(res.asString(),"id");
 	
 	
 	ResponseValidation.statusCodeValidation(201, res);
 	
}


}
