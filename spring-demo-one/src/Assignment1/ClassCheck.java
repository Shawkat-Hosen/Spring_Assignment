package Assignment1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClassCheck {
public static void main(String[] a) {
	ClassPathXmlApplicationContext ap=new ClassPathXmlApplicationContext("Assignment1/ConfigureFile.xml");
	ClassStatic i=ap.getBean("show2", ClassStatic.class);
	i.m1();
	ap.close();
}
}
