package DependencyInject;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class ValueResultTest {
public static void main(String[] a) {
	AnnotationConfigApplicationContext ap=new AnnotationConfigApplicationContext(ConfigurationClassForProperties.class);			
	SwimCoach coach=ap.getBean("swimCoach", SwimCoach.class);
	System.out.println(coach.sentMessage());
	coach.createInitiate();
	System.out.println(coach.getName());
	System.out.println(coach.getEmail());
	ap.close();
}
}
