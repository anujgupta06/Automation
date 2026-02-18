package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Read_Properties_File {
	
	public static Properties prop;
	
	public static Properties readProperty() throws IOException {
	
		String filepath=prop.getProperty("user.dir")+"\\src\\main\\java\\Config\\config.properties";
		FileInputStream fis=new FileInputStream(filepath);
		
		prop.load(fis);
		return prop;
	
	}
}
