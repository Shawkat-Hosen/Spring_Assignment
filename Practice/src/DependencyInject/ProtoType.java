package DependencyInject;

public class ProtoType implements CoachTask {

	@Override
	public void createInitiate() {
		System.out.println("Hello guys, you have (Prototype) started your task promptly");
	}

	@Override
	public void createDestruction() {
		System.out.println("Good bye guys, you are  (Prototype)  out of the system");
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
