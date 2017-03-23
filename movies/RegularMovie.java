package movies;
public class RegularMovie extends Movie {

	public RegularMovie(String title) {
		super(title);
		this.price = 2;
		this.multiplier = 1.5;
		this.possibleFrequentPoints = 1;
	}
	
	public double getPrice(int days){
		
        if( days > 2 ) {
          return ((days - 2) * this.multiplier) + this.price;
        }
        
        return this.price;
	}
	
	public int getFrequentPoints(int days){
		return this.possibleFrequentPoints;
	}

}
