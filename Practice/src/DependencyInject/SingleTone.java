package DependencyInject;

public class SingleTone implements CoachTask {

	@Override
	public void createInitiate() {
		System.out.println("Hello (SingleTone) guys, you have started your task");
	}

	@Override
	public void createDestruction() {
		System.out.println("Good bye (SingleTone) guys, you are out of the system");
	}

	@Override
	public String sentMessage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String wishLuck() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String randomShow() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

}
