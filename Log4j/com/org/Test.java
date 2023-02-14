package com.org;

import java.io.File;

import org.apache.log4j.Logger;

public class Test {

	static Logger logger1=Logger.getLogger("enet.encrypt.debug.logger");
	static Logger logger2=Logger.getLogger("enet.encrypt.status.logger");
	static Logger logger3=Logger.getLogger("enet.encrypt.health.logger");
//	Logger logger4=Logger.getLogger("enet.encrypt.debug.logger");
	
	
	public static void main(String[] args) {
	
		System.out.println(new File("C:\\Users\\vishal.mestri\\Desktop\\log4j.properties").toURI().toString());
	//	System.out.println(new File("C:\\Users\\vishal.mestri\\Desktop\\log4j.properties").toURI().toURL().toString());
		logger1.info("enet.encrypt.debug.logger - printed");
		logger2.info("enet.encrypt.status.logger - printed");
		logger1.info("enet.encrypt.health.logger - printed");
	}
}
