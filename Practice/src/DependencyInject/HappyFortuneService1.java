package DependencyInject;

import java.util.Random;

public class HappyFortuneService1 implements FortuneServiceInterface{
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
	
	



}