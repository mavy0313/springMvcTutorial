package spring.java.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import spring.java.service.BlogPostService;
import spring.java.service.impl.BlogPostServiceImpl;

@ComponentScan(basePackages= {"spring.java"})
public class JavaConfig {

	@Bean
	public BlogPostService blogPostService() {
		return new BlogPostServiceImpl();
	}
}
