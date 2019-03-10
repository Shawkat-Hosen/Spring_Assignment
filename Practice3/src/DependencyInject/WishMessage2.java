package DependencyInject;

public class WishMessage2 implements CoachTask {

	@Override
	public void createInitiate() {
		System.out.println("Hello guys, you have started your task");
	}

	@Override
	public void createDestruction() {
		System.out.println("Good bye guys, you are out of the system");
	}
	

}
