package com.utiliy;

import java.io.FileInputStream;
import java.util.Properties;

public class Propertiesutils {
	
	public static Properties prop=null;
	public static FileInputStream fis=null;
	
	public static String readProperty(String key) throws Exception{
		
		prop= new Properties();
		fis=new FileInputStream(System.getProperty("user.dir")+"/src/main/resources/config.properties"); 
		prop.load(fis);
		return prop.getProperty(key);
	}

}
 	