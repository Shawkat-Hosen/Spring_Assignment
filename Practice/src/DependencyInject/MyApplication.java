package DependencyInject;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApplication {
public static void main(String[] a) {
	ClassPathXmlApplicationContext ap=new ClassPathXmlApplicationContext("DependencyInject/ConfigureFile.xml");
	
	CoachTask i=ap.getBean("messageToPlayerToLoosWeight", CoachTask.class);
	HappyFortuneService2 i2=ap.getBean("messageToPlayerToLoosWeight", HappyFortuneService2.class);
	System.out.println(" ");
	System.out.println(i2.getName());
	System.out.println(i2.getEmail());
	System.out.println(i2.getUniversity());
	System.out.println(" ");
	System.out.println(i.randomShow());	
	System.out.println(i.sentMessage());
	System.out.println(i.wishLuck());
	
	
	ap.close();
}
}
