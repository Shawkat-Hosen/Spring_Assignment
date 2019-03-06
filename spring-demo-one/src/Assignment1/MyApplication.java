package Assignment1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApplication {
public static void main(String[] a) {
	ClassPathXmlApplicationContext ap=new ClassPathXmlApplicationContext("Assignment1/ConfigureFile.xml");
	CoachChoose i=ap.getBean("show", CoachChoose.class);
	System.out.println(i.show()); 
	ap.close();
}
}
