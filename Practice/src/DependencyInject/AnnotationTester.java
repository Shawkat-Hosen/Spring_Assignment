package DependencyInject;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationTester {
public static void main(String[] a) {
	ClassPathXmlApplicationContext ap=new ClassPathXmlApplicationContext("DependencyInject/ComponantScan.xml");			
	CoachTask coach=ap.getBean("fileReaderCoach", CoachTask.class);
    System.out.println(coach.wishLuck());

	ap.close();
}
}
