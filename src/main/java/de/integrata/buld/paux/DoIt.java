package de.integrata.buld.paux;

import java.util.Arrays;

public class DoIt {

	
	
	
	static int add(int left, int right) {
		
		Arrays.asList(left, right).stream().anyMatch(x -> x > 0);

		
		return left + right;
	}
	
	
}
