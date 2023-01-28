package readPropertyData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class readPropertyData {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("./data/config.properties");// provide the path of property file
		Properties prop = new Properties();// to reda the data
		prop.load(fis);// use to read the file
		String data = prop.getProperty("Username");
		System.out.println(data);
		

	}

}