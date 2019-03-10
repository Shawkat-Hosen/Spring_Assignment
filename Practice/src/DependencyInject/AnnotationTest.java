package DependencyInject;

import java.util.Random;

import org.springframework.stereotype.Component;
@Component("notifyPlayer")
public class AnnotationTest implements WishInterface{
	@Override
	public String wishLuck() {	
		return "Good luck boys ,Have a great a day ahead ";
	}

	
	@Override
	public String randomShow() {	
		String [] ranList= {"A + category","A  category"," A- category","B category"};
	    Random rand = new Random();
	    int randomElement =rand. nextInt(ranList. length); 
	    return ranList[randomElement];
	}
	
	@Override
	public void createInitiate() {
		
	}

	@Override
	public void createDestruction() {
		
	}


	@Override
	public String sentMessage() {
		// TODO Auto-generated method stub
		return null;
	}

}
