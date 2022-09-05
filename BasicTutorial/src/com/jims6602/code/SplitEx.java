package com.jims6602.code;

import com.jims6602.rdd.commons.Utils;

public class SplitEx {

	public static void main(String[] args) {
		final String LINES = "\"John\",\"Smith\",\"San Diego\",\"United States\"";

		System.out.println("Getting the fourth comma delimiter element : "+LINES.split(Utils.COMMA_DELIMITER)[3]); 
		
		System.out.println("Checking if the fourth comma delimiter element is United States : "
		                         +LINES.split(Utils.COMMA_DELIMITER)[3].equals("\"United States\""));
		
		/*CONSOLE
		 * 
		 * Getting the fourth comma delimiter element : "United States"
         * Checking if the fourth comma delimiter element is United States : true
         * 
		 */
	}

}
