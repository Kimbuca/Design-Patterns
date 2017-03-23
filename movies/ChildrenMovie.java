package movies;

public class ChildrenMovie extends Movie {
	
	public ChildrenMovie(String title) {
		super(title);
		this.price = 1.5;
		this.multiplier = 1.5;
		this.possibleFrequentPoints = 1;
	}
	
	public double getPrice(int days){
		
        if( days > 3 ) {
          return ((days - 3) * this.multiplier) + this.price;
        }
        
        return this.price;
        
	}
	
	public int getFrequentPoints(int days){
		return this.possibleFrequentPoints;
	}
	
}
