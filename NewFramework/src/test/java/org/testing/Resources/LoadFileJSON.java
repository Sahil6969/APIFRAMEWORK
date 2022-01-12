package org.testing.Resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.json.JSONObject;
import org.json.JSONTokener;

public class LoadFileJSON {
	public static String JsonLoading(String Path)throws IOException
		{
		       File f = new File(Path);
		       FileInputStream fi = new FileInputStream(f);
		       JSONTokener js =new JSONTokener(fi);
		       JSONObject body=new JSONObject(js);
		       return body.toString();
		}
		
		
	}
	

