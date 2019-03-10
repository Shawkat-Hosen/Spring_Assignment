package DependencyInject;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApplicationForScope {
public static void main(String[] a) {
	ClassPathXmlApplicationContext ap=new ClassPathXmlApplicationContext("DependencyInject/ConfigureFile2.xml");
	
	

	// for single tone
	
	CoachTask i3=ap.getBean("wishText", CoachTask.class);
	CoachTask i4=ap.getBean("wishText", CoachTask.class);
	System.out.println(i3);
	System.out.println(i4);
	
	System.out.println(" ");
	
	//for prototype
	CoachTask i=ap.getBean("wishText2", CoachTask.class);
	CoachTask i2=ap.getBean("wishText2", CoachTask.class);
	System.out.println(i);
	System.out.println(i2);
	
	System.out.println(" ");

	ap.close();
}
}
