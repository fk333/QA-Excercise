package org;

import java.util.logging.Level;
import java.util.logging.*;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;


public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//public static Logger LOGGER = LogManager.getLogger();

		
		
		LogException le=new LogException();
		Logger log=Logger.getLogger("");
		
		try {
		le.divByZero();
		}catch(Exception e) {
			log.log(Level.WARNING,"can not divid by zero");
		}
		try {
		le.arrayBound();
		}catch(Exception e)
		{
			log.log(Level.INFO,"Array index out of bounds");
		}
		
		try {
			le.fileNotFound();
			}catch(Exception e)
			{
				log.log(Level.INFO,"File not found");
			}
	}

}
