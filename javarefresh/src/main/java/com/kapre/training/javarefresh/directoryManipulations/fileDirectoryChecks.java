/**
 *  DATE			AUTHOR			VERSION			DESCRIPTION		
 * 21/09/2022		EB				1.0.0			Methods that checks file system folders
 * 
 * */

package com.kapre.training.javarefresh.directoryManipulations;

import java.io.File;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class fileDirectoryChecks {

	public void fileSystemFolder() {
		
		final Logger log = LogManager.getLogger(fileDirectoryChecks.class);
		File mainDirectory = new File("C:\\Java\\File System\\");

		if (!mainDirectory.exists()) {
			BasicConfigurator.configure();
			log.error(mainDirectory + " doesn't exist!");
			log.info("Creating main directory " + mainDirectory);
			mainDirectory.mkdir();

		} else {
			log.info(mainDirectory + " exist!");
		}
	}

}
