package com.vtiger.genericUtilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileUtility {
	
	public String readProprtyFile(String key) throws IOException {
		
		FileInputStream fis=new FileInputStream(IConstantUtility.propertypath);
		Properties p=new Properties();
		p.load(fis);
		return p.getProperty(key);
		
	}

}
