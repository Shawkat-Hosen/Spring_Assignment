package DependencyInject;

import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component

public class FileReaderCoach implements CoachTask {
	
	@Autowired
	private FortuneServiceInterface fortuneServiceInterface;
	public FileReaderCoach(@Qualifier("fileRandomValue") FortuneServiceInterface fortuneServiceInterface) {
		this.fortuneServiceInterface = fortuneServiceInterface;
	}

	@Override
	public String sentMessage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String wishLuck() {
		
		return fortuneServiceInterface.rdValue();
	}

	@Override
	public String randomShow() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createInitiate() {
		// TODO Auto-generated method stub

	}
	@PreDestroy
	@Override
	public void createDestruction() {
		System.out.println("OK");

	}

}
