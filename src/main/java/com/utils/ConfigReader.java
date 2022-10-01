package com.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	private Properties prop;

	public Properties init_prop() {
		prop = new Properties();
		try {
			prop.load(new FileInputStream("src/test/resources/config.properties"));
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return prop;
	}

}
