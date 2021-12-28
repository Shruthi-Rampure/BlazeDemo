package com.blazeAutomation.UI;


import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadPropertyFile {
	   private static final String CONFIG_FILE_NAME = "conf.properties";
	    private Properties configProperties;



	    public ReadPropertyFile() {
	    	readProperty();
	    }

	    private void readProperty() {
	        configProperties = new Properties();
	        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
	        InputStream inputStream = classLoader.getResourceAsStream(CONFIG_FILE_NAME);
	        try {
	            configProperties.load(inputStream);
	        } catch (final IOException e) {
	        }
	    }

	    public String getBrowser() {
	        return getProperty("browser");
	    }

	    public String getURL() {
	        return getProperty("url");
	    }
	    public String getProperty(String propertyName) {
	        return configProperties.getProperty(propertyName);
	    }
}
