package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class utilites 
{
	static FileInputStream FI;
	public static void ReadPropertyFile()
	{
		
		String config_file = "F:\\selenium\\NewWorkspace\\OrangeHTM\\property.configurtaion";
		File file = new File(config_file);
		
		try {
			FI = new FileInputStream(config_file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Properties prop = new Properties();
		try {
			prop.load(FI);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			String URL = prop.getProperty("URL");
		}
		
		
		
	}

}
