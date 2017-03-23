package Mario;

public class CapeMario extends MarioDecorator {

	public CapeMario(Mario mario) {
		super(mario);
	}

	@Override
	public int getJump() {
		return (mario.getJump()+1);
	}
	
	public void fly(){
		System.out.println("Flying.... ");
	}

}
