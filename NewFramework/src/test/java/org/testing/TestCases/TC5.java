package org.testing.TestCases;

import java.io.IOException;

import org.testing.Utilities.LoadXmlData;

public class TC5 {
	public static void main(String[] args) throws IOException
	{
	
		String response = LoadXmlData.readXml("../NewFramework/src/test/java/org/testing/Payloads/xmlData.xml");
	     System.out.println(response);
	}
	

}
