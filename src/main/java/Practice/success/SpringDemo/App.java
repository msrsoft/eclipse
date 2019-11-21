package Practice.success.SpringDemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		// ClassPathXmlApplicationContext container = new
		// ClassPathXmlApplicationContext("classpath:Spring-config.xml");
		// ResourceBundleMessageSource source = container.getBean("messageSource",
		// ResourceBundleMessageSource.class);
		AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext();

		container.refresh();
		container.register(ResourceBundleMessageSourceFactory.class);
ResourceBundleMessageSourceFactory bean = container.getBean(ResourceBundleMessageSourceFactory.class);

		System.out.println(bean);
		container.close();
	}
}
