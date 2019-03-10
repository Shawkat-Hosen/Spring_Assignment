package Assignment1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApplication {
public static void main(String[] a) {
	ClassPathXmlApplicationContext ap=new ClassPathXmlApplicationContext("Assignment1/ConfigureFile.xml");
	CoachChoose i=ap.getBean("show", CoachChoose.class);
	ClassStatic i2=ap.getBean("show2", ClassStatic.class);
	i2.m1();
	ap.close();
	System.out.println(i.show()); 
	ap.close();
}
}
