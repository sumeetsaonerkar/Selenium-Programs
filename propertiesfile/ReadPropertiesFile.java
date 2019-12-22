package propertiesfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {

	public static void main(String[] args) throws IOException {

		Properties prop = new Properties();
		
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\sumeet.saonerkar\\workspace\\PageObjectModel\\locators.properties");

		prop.load(fis);
		System.out.println(prop.getProperty("submitbuttonXpath"));
		
	}

}
