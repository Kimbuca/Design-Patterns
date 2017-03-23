package Mario;

public abstract class MarioDecorator implements Mario{
	
	
	protected Mario mario;

	
	public MarioDecorator(Mario mario) {
		this.mario = mario;
	}

	@Override
	public int getRun() {
		return mario.getRun();
	}

	@Override
	public int getJump() {
		return mario.getJump();
	}

	@Override
	public double getHeight() {
		return mario.getHeight();
	}
	
	

}
