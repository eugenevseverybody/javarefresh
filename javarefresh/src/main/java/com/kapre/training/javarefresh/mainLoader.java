/**
 *  DATE			AUTHOR			VERSION			DESCRIPTION		
 * 21/09/2022		EB				1.0.0			Call fileSystemFolder method from another class
 * 
 * */

package com.kapre.training.javarefresh;

import com.kapre.training.javarefresh.directoryManipulations.fileDirectoryChecks;

public class mainLoader {

	public static void main(String[] args) {
		
		fileDirectoryChecks fileCheck = new fileDirectoryChecks();
		fileCheck.fileSystemFolder();
	}
}