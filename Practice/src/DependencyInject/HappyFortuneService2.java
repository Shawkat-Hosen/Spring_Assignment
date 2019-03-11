package DependencyInject;
public class HappyFortuneService2 implements CoachTask{

public String name ,email ,university;
	
public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public String getUniversity() {
		return university;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setUniversity(String university) {
		this.university = university;
	}

private FortuneServiceInterface wishinterface; 

public HappyFortuneService2(FortuneServiceInterface wish) {	
	System.out.println("Its the Constructor values ");
	wishinterface = wish;
}

public HappyFortuneService2() {
	System.out.println("Its the Setter showing Used method ");
}
public void setWishinterface(FortuneServiceInterface wishinterface) {
	System.out.println("Its the Setter Value inside setter ");
	this.wishinterface = wishinterface;
}

@Override
public String sentMessage() {
	
	return "Gets up early and loose some weight";
}

@Override
public String wishLuck() {
	return wishinterface.wishLuck();
}

@Override
public String randomShow() {
	
	return  wishinterface.randomShow();
}
@Override
public void createInitiate() {
	// TODO Auto-generated method stub
	
}
@Override
public void createDestruction() {
	// TODO Auto-generated method stub
	
}





}
