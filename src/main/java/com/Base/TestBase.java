package com.Base;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class TestBase {
	static  Properties p;
	public  static void readData() throws IOException {
		
	
		 FileReader reader=new FileReader("/Users/shobharya/Documents/Testing Automation/DPIA/resources/config.properties");  
	      
		   p =new Properties();  
		    p.load(reader);  
		      
		    //System.out.println(p.getProperty("username"));  
		   // System.out.println(p.getProperty("password"));  
	}
	 
	
	
	 

}
