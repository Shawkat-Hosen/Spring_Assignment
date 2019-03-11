package DependencyInject;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class AnnotationTester {
public static void main(String[] a) {
	AnnotationConfigApplicationContext ap=new AnnotationConfigApplicationContext(ConfigurationClass2.class);			
	CoachTask coach=ap.getBean("swimCoach", CoachTask.class);
	System.out.println(coach.sentMessage());
	coach.createInitiate();

	ap.close();
}
}
