package Mario;

public class BigMario extends MarioDecorator{

	public BigMario(Mario mario) {
		super(mario);
	}

	@Override
	public int getRun() {
		return mario.getRun()+2;
	}

	@Override
	public int getJump() {
		return mario.getJump()+1;
	}

	@Override
	public double getHeight() {
		return mario.getHeight()+.5;
	}
	
}
