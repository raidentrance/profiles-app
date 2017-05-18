/**
 * 
 */
package com.raidentrance.util;

import java.util.Properties;

/**
 * @author maagapi
 *
 */
public class TestConfigurationLoader {
	public static void main(String[] args) {
		Properties properties = ConfigurationLoader.getProperties("environment.properties");
		System.out.println(properties);
	}
}
