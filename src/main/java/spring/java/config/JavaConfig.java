package spring.java.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

import spring.config.ServiceConfig;
import spring.java.service.BlogPostService;
import spring.java.service.impl.BlogPostServiceImpl;
import spring.java.service.impl.MediumBlogPostServiceImpl;
import spring.java.service.impl.WordPressBlogPostServiceImpl;

@ComponentScan(basePackages= {"spring.java"})
@Import(value= {ServiceConfig.class})
public class JavaConfig {

//	@Autowired
//	private ServiceConfig serviceConfig;
	
	@Bean
	public BlogPostService blogPostService() {
		return new BlogPostServiceImpl();
	}
	
	@Bean(name="WordPressBlogPostService")
	public BlogPostService wordPressBlogPostService() {
		return new WordPressBlogPostServiceImpl();
	}
	
	@Bean(name="MediumBlogPostService")
	public BlogPostService mediumBlogPostService() {
		return new MediumBlogPostServiceImpl();
	}
		
}
