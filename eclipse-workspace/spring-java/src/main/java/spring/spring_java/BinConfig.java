package spring.spring_java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class BinConfig {
	@Bean
	public  BinConfig binConfig(){
	      return new  BinConfig();
	   }
}
