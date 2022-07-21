package org;
import java.io.FileReader;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class testlogger {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Logger LOGGER = LogManager.getLogger();
		LOGGER.info("adding info logs");
		//LOGGER.catching(Exception);
		
		
		try
		{
			int z=10/0;
			FileReader fr=new FileReader("y.txt");
		}
		catch (Exception e) {
		    LOGGER.debug(e.getStackTrace());
		    LOGGER.error(e.getMessage());
		}
		
	
		
		
		
	}

}
