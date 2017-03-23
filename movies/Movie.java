package movies;

public class Movie {
  
	protected String _title;
	protected double price;
	protected double multiplier;
	protected int possibleFrequentPoints;

	public Movie( String title) {
		_title = title;
	}

	public String getTitle() {
		return _title;
	}
	
	public double getPrice(int days){
		return 1;
	}
	
	public int getFrequentPoints(int days){
		return 1;
	}
}
