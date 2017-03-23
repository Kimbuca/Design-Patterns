package Mario;

public class Main {

	
	private static void print(String name, Mario mario){
		
		System.out.println("\n" +name);
		System.out.println("Run : " +mario.getRun() +" mts");
		System.out.println("Jump : " +mario.getJump() +" mts");
		System.out.println("Height : " +mario.getHeight() +" mts");
		//typeof
		
		if(mario instanceof FireMario)
			((FireMario)mario).launchFire();
		
		if(mario instanceof CapeMario)
			((CapeMario)mario).fly();
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		Mario bmario = new BasicMario();
		
		Mario player_mario = new FireMario(bmario);
		print("Fire Mario", player_mario);
		
		player_mario = new CapeMario(bmario);
		print("Cape Mario", player_mario);
		
		player_mario = new BigMario(bmario);
		print("Big Mario", player_mario);
		
		
	}
}
