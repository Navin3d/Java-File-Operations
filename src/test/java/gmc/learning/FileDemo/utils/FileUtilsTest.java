package gmc.learning.FileDemo.utils;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import gmc.learning.FileDemo.config.Variables;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
@RunWith(SpringRunner.class)
public class FileUtilsTest {
	
	@Autowired
	private Variables var;
	
	@Test
	public void shouldLogFileNames() {
		FileUtils fileUtils = new FileUtils();
		fileUtils.readFileNames();
	}
	
	@Test
	public void shouldLogFileContents() {
		FileUtils fileUtils = new FileUtils();
		fileUtils.readFileContent();
	}

	
	@Test
	public void shouldDisplayProperties() {
		log.error("start");
		log.error("{}", var.getTables().values());
		log.error("emd");
	}
	
}
