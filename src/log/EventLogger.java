package log;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class EventLogger {
	FileHandler filehandler;
	LogManager logmanager;
	Logger logger;
	
	public EventLogger(String fileName) {
		try {
			logmanager = LogManager.getLogManager();	//global한 logmanager를 하나 할당받음
			logger = logmanager.getLogger(Logger.GLOBAL_LOGGER_NAME);	//
			filehandler = new FileHandler(fileName);	//지정한 파일로 로그를 기록
			filehandler.setFormatter(new SimpleFormatter());	//user가 읽을 수 있도록
			logger.addHandler(filehandler);	//Logger가 사용할 수 있는 새로운 형태의 handler 추가
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void log(String logMessage) {
		logger.info(logMessage);
	}
}
