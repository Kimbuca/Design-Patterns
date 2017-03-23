package Mario;

public class BasicMario implements Mario {
	
	
	@Override
	public int getRun() {
		return 2;
	}

	@Override
	public int getJump() {
		return 1;
	}

	@Override
	public double getHeight() {
		return 1.55;
	}

}
