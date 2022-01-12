package org.testing.Utilities;

import java.util.regex.Pattern;

public class jsonVariable {
	public static String jsonVariableReplacement(String bodydata,String keyName, String keyValue)
	{
		return bodydata.replaceAll(Pattern.quote("{{"+keyName+"}}"), keyValue);
		//{{id}} replace value keyValue
		
		
		
	}
}
