package DependencyInject;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationTester {
public static void main(String[] a) {
	ClassPathXmlApplicationContext ap=new ClassPathXmlApplicationContext("DependencyInject/ComponantScan.xml");		
	CoachTask i=ap.getBean("notifyPlayer", CoachTask.class);
	System.out.println(i.wishLuck());
	ap.close();
}
}
