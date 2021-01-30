package com.demo.logging;

//import org.apache.logging.log4j.message.LoggerNameAwareMessage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggingDemo {
	
	static Logger log = LogManager.getLogger(LoggingDemo.class);
	
	public static void main(String[] args) {
		log.debug("This is a debug log");
		log.error("This is an error log");
		log.fatal("This is a fatal log");
		log.info("This is an info log");
		log.warn("This is a warning log");
		log.trace("This is a trace log");
	}
	
}
