package DependencyInject;

import org.springframework.stereotype.Component;
@Component("notifyPlayer")
public class AnnotationTest implements FortuneServiceInterface{
	@Override
	public String wishLuck() {	
		return "Lets spent some quality time at the field ";
	}
	
	@Override
	public String randomShow() {	
		return null;
	}


	

	


}
