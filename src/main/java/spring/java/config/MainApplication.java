package spring.java.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.java.domain.BlogPost;
import spring.java.domain.DataSource;
import spring.java.service.BlogPostService;
import spring.java.service.EmailService;
import spring.java.service.ServiceManager;

public class MainApplication {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(MainApplication.class);

	public static void main(String[] args) {
		/*
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(JavaConfig.class);
		
//		BlogPostService blogPostService = applicationContext.getBean(BlogPostService.class);
		
		BlogPostService blogPostService = (BlogPostService) applicationContext.getBean("blogPostService");
		
		BlogPost blogPost = new BlogPost();
		blogPost.setId(1L);
		blogPost.setTitle("Java Spring MVC Java Config");
		
		blogPostService.savePost(blogPost);
		
		DataSource dataSource = applicationContext.getBean(DataSource.class);
		
		LOGGER.debug("datasource url: " + dataSource.getUrl());
		LOGGER.debug("datasource username: " + dataSource.getUsername());
		LOGGER.debug("datasource password: " + dataSource.getPassword());
		
		EmailService emailService = applicationContext.getBean(EmailService.class); 
		
		emailService.sendEmail();
		
		ServiceManager serviceManager = applicationContext.getBean(ServiceManager.class);
		serviceManager.sendBlogPost(blogPost);
		
		((ConfigurableApplicationContext) applicationContext).close();
		
		*/
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("application-context.xml");
		DataSource dataSource = appContext.getBean(DataSource.class);
		LOGGER.debug("datasource url: " + dataSource.getUrl());
		LOGGER.debug("datasource username: " + dataSource.getUsername());
		
		

	}

}
