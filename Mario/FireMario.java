package Mario;

public class FireMario extends MarioDecorator{

	public FireMario(Mario mario) {
		super(mario);
		// TODO Auto-generated constructor stub
	}
	
	public void launchFire(){
		System.out.println("PEW PEW FIRE !!!");
	}

}
