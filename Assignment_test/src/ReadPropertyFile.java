import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class ReadPropertyFile {

	public static void main(String[] args) throws IOException {
		Properties prop = new Properties();
		FileInputStream input = new FileInputStream(new File(System.getProperty("user.dir")+"\\src\\Assign\\config.properties"));
        prop.load(input);
        System.err.println("url : " + prop.getProperty("url"));
        System.err.println("browser : " + prop.getProperty("browser"));
        System.err.println("driverlocation : " + prop.getProperty("driverlocation"));
	}

}
