package com.tutorialsNinja.qa.Utilities;


import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {

	public static Properties prop;
	public static FileInputStream ip;

	public static Properties initializeConfigPropertiesFile() throws Exception {
		prop = new Properties();
		ip = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\java\\com\\tutorialsNinja_Step_Definition_Files\\config.properties");
			
		prop.load(ip);

		return prop;
	}

}
