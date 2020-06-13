import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Config {
	public static void main(String[] args) {
		Properties prop = new Properties();
		try {
			FileInputStream ip = new FileInputStream(
					"E://Automation//JavaPractise//src//com//qa//config//config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String Url = prop.getProperty("url");
		System.out.println(Url);
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("password"));

	}
}
