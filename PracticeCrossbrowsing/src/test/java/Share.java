import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Share {

	public static Properties readPropertyFile(File url) throws IOException
	{
		FileInputStream f=new FileInputStream(url);
		 Properties p=new Properties();
		p.load(f);
		return p;
	}
}
