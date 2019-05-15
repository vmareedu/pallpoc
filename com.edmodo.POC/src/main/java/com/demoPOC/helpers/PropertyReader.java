package com.demoPOC.helpers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyReader {
	String path = getFilePath();

	public String readApplicationFile(final String key) {
		String value = "";
		try {
			final Properties prop = new Properties();
			final File f = new File("./Configuration/Config.properties");

			if (f.exists()) {
				prop.load(new FileInputStream(f));
				value = prop.getProperty(key);
			}
		} catch (final Exception e) {
			System.out
					.println("Failed to read from application.properties file.");
		}
		return value;
	}

	public String getFilePath() {
		String filepath = "";
		final File file = new File("");
		final String absolutePathOfFirstFile = file.getAbsolutePath();
		filepath = absolutePathOfFirstFile.replaceAll("\\\\+", "/");

		return filepath;
	}

	

	public String readTestData(final String key) {
		String value = "";
		try {
			final Properties prop = new Properties();
			final File f = new File("./Configuration/Config.properties");
			if (f.exists()) {
				prop.load(new FileInputStream(f));
				value = prop.getProperty(key);
			}
		} catch (final Exception e) {
			System.out
					.println("Failed to read from application.properties file.");
		}
		return value;
	}
	
	public String readOutputTestData(final String key) {
		String value = "";
		try {
			final Properties prop = new Properties();
			final File f = new File("./Configuration/Output.properties");
			if (f.exists()) {
				prop.load(new FileInputStream(f));
				value = prop.getProperty(key);
			}
		} catch (final Exception e) {
			System.out
					.println("Failed to read from application.properties file.");
		}
		return value;
	}

	public void updatePropertyTestData(final String key, final String value) {
		final Properties props = new Properties();
		final String propsFileName ="./Configuration/Output.properties";
		try {
			// first load old property file:
			final FileInputStream configStream = new FileInputStream(
					propsFileName);
			props.load(configStream);
			configStream.close();

			// modifies new property
			props.setProperty(key, value);

			// save modified property file
			final FileOutputStream output = new FileOutputStream(propsFileName);
			props.store(output, "");
			output.close();

		} catch (final IOException ex) {
			System.out.println(ex);
		}
	}
	
}