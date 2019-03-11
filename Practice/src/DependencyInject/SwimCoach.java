package DependencyInject;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements CoachTask {
	private FortuneServiceInterface fortuneServiceInterface;
	
	@Value("${f.name}")
	private String name;
	@Value("${f.email}")
	private String email;
	
	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public SwimCoach(FortuneServiceInterface tfortuneServiceInterface) {
		fortuneServiceInterface = tfortuneServiceInterface;
	}

	@Override
	public String sentMessage() {
		
		return fortuneServiceInterface.wishLuck();
	}

	@Override
	public void createInitiate() {
		System.out.println("Coach message is to attend at field within next 15 minutes");
	}


}
