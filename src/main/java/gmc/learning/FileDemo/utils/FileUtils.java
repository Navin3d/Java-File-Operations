package gmc.learning.FileDemo.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.springframework.beans.factory.annotation.Value;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FileUtils {
	
	@Value("${config.sql.path}")
	private String sqlPath;

	public void readFileNames() {
		log.error("The file path is: {}.", sqlPath);
		File directory = new File("/Users/navindurai/Programming/Java/Spring_Projects/File-Spring-Boot/File-Spring-Boot/src/main/resources/sqls");
		File[] files = directory.listFiles();
		for(File file : files) {
			log.warn(file.getName().split("_")[0]);
		}
	}
	
	public void readFileContent() {
		log.error("The file path is: {}.", sqlPath);
		File directory = new File("/Users/navindurai/Programming/Java/Spring_Projects/File-Spring-Boot/File-Spring-Boot/src/main/resources/sqls");
		File[] files = directory.listFiles();
		for(File file : files) {
			try {
				InputStream inStream = new FileInputStream(file);
				InputStreamReader isReaser = new InputStreamReader(inStream);
				BufferedReader bufferedReader = new BufferedReader(isReaser);
				log.warn(bufferedReader.readLine());
			} catch(Exception e) {
				log.error(e.getMessage());
			}
		}
	}

}
