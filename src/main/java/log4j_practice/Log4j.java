package log4j_practice;

import java.io.IOException;

import org.apache.log4j.Appender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;

public class Log4j {
	static Logger logger=Logger.getLogger(Log4j.class);
	
	static Layout layout=new SimpleLayout();
	
	public static void main(String[] args) throws IOException {
		
		Appender appender=new FileAppender(layout,"C:/Users/Windows 8.1/Desktop/log/abc.log");
		logger.addAppender(appender);
		int a=9;
		if(a==94) {
			logger.debug("hi");
		}else {
			logger.info("not working");
		}
	}

}
