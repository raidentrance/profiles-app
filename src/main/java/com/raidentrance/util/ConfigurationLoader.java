/**
 * 
 */
package com.raidentrance.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author raidentrance
 *
 */
public class ConfigurationLoader {
	private static Properties propProducer;

	private static final Logger log = Logger.getLogger(ConfigurationLoader.class.getName());

	public static Properties getProperties(String name) {
		log.info("Loading configuration");
		ClassLoader loader = Thread.currentThread().getContextClassLoader();
		if (propProducer == null) {
			Properties properties = new Properties();
			try (InputStream resourceStream = loader.getResourceAsStream(name)) {
				properties.load(resourceStream);
			} catch (IOException e) {
				log.log(Level.SEVERE, e.getMessage());
			}
			propProducer = properties;
		}
		return propProducer;
	}
}
