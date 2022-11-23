package gmc.learning.FileDemo.utils;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class FileUtilsTest {
	
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

}
