package movies;
/**
 *
 * @author jzab
 */
class Rental {

  private Movie movie;
  private int daysRented;

  public Rental(Movie movie, int daysRented ) {
    this.movie = movie;
    this.daysRented = daysRented;
  }
  
  public String getMovieTitle() {
	    return this.movie.getTitle();
  }

  public int getDaysRented() {
    return this.daysRented;
  }
  
  public double getPrice(){
	  return this.movie.getPrice(this.daysRented);
  }
  
  public int getFrequentPoints(){
	  return this.movie.getFrequentPoints(this.daysRented);
  }
  
}
