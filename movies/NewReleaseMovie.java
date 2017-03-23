package movies;

public class NewReleaseMovie extends Movie {

	public NewReleaseMovie(String title) {
		super(title);
		this.price = 3;
		this.possibleFrequentPoints = 1;
	}
	
	public double getPrice(int days){
		
		return days * this.price;
	}
	
	public int getFrequentPoints(int days){
		
		if( days > 1  ) {
			return this.possibleFrequentPoints + 1;
		}
		
		return this.possibleFrequentPoints;
	}

}
