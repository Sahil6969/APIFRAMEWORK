package org.testing.Utilities;

import java.util.Random;

public class RandomData {
	public static String random() {
		Random r =new Random();
		Integer i= r.nextInt();
		return i.toString();
		
		
	}

}
