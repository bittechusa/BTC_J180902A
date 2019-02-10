import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.junit.Before;
import org.junit.BeforeClass;

public class BaseClass
{
	Properties p;
	@BeforeClass
	public void configureFile() throws IOException {
		p=Share.readPropertyFile(new File("config.properties"));
	}
	@Before
	public void openBrowser() throws FileNotFoundException
	{
		String b=p.getProperty("browser");
		String r=p.getProperty("runMode");
		if(b.equals("chrome")) {
			if(r.equals("local"))
			{
				System.out.println("write code for opening browser");
			}
			else if(r.equals("remote"))
			{
				System.out.println("write code for remotely open browser");
			}
		}
		if(b.equals("firefox")) {
			if(r.equals("local"))
			{
				System.out.println("write code for opening browser");
			}
			else if(r.equals("remote"))
			{
				System.out.println("write code for remotely open browser");
			}
		}
	}

}
