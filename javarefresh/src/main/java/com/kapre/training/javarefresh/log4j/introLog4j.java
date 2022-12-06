/**
 *  DATE			AUTHOR			VERSION			DESCRIPTION		
 * 21/09/2022		EB				1.0.0			Introduction to log4j
 * 
 * */

package com.kapre.training.javarefresh.log4j;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class introLog4j {

	private static final Logger log = LogManager.getLogger(introLog4j.class);

	public static void main(String[] args) {
		// basic log4j configurator
		BasicConfigurator.configure();
		log.debug("we are in logger debug mode");
		log.info("we are in logger info mode");
		log.warn("we are in logger warn mode");
		log.error("we are in logger error mode");
		log.fatal("we are in logger fatal mode");
	}
}
