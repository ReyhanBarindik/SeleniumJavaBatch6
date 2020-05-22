package com.syntax.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

// open this class and fix wherever you have issue
public class ConfigsReader {
	public static Properties prop;

	/**
	 * This method will read properties file
	 * 
	 * @param filePath
	 */

	public static void readProperties(String filePath) {
		try {
			FileInputStream fis = new FileInputStream(filePath);
		    prop = new Properties();
			prop.load(fis);
			fis.close();
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
    /**
     * This method will return value of sepecified key
     * @param String key
     * @return String value 
     */
	public static String getProperty (String key) {     //--> you will rechieve key
		
		
		return prop.getProperty(key);
	}
}
