package service;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class TestPropertiesForTake {

	public static void main(String[] args) throws IOException {

		Properties prop = new Properties();
		
		InputStream is = new FileInputStream("informations\\userInfo.properties");
		
		prop.load( is );
		
		for (Object obj : prop.entrySet()) {
			System.out.println(obj.toString());
		}
		
	}

}
