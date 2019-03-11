package DependencyInject;

public class SadFortune implements FortuneServiceInterface {

	@Override
	public String wishLuck() {	
		return " You are running out of time";
	}

	

}
