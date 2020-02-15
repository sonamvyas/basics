package com.crm.snm.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class TestBase
{
	public static WebDriver driver;
	public static Properties prop;
	
	
	public TestBase()
	
{
		try
		{
			prop = new Properties();
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+ "/src/main/java/com/crm"
					+ "/qa/config/config.properties");
			try {
				prop.load(ip);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		}
	
	

}
