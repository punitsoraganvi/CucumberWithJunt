package genericlib;

import java.io.FileInputStream;
import java.util.Properties;



public class PropertyFile {
	public String getPropertyData(String key) throws Exception {
		Properties p = new Properties();
		FileInputStream fis = new FileInputStream(PropertyData.propertyFilePath);
		p.load(fis);
		return p.getProperty(key);
	}
}
