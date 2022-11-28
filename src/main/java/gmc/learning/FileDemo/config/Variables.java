package gmc.learning.FileDemo.config;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@ConfigurationProperties(prefix="var")
public class Variables {
	
	private Map<String, String> tables = new HashMap<>();

}
