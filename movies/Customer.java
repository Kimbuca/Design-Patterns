package movies;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Vector;

class Customer {

  private String _name;
  private Vector _rentals = new Vector();

  public Customer( String name ) {
    _name = name;
  }

  public void addRental( Rental arg ) {
    _rentals.addElement( arg );
  }

  public String getName() {
    return _name;
  }
  
  private double calculateRentalAmount(){
	  double totalAmount = 0;
	  Enumeration rentals = _rentals.elements();
	  
	  while( rentals.hasMoreElements() ) {
		  Rental each = (Rental) rentals.nextElement();
		  totalAmount = totalAmount + each.getPrice();
	  }
	  
	  return totalAmount;
  }
  
  private int calculateFrequentPoints(){
	  int totalPoints = 0;
	  Enumeration rentals = _rentals.elements();
	  
	  while( rentals.hasMoreElements() ) {
		  Rental each = (Rental) rentals.nextElement();
		  totalPoints = totalPoints + each.getFrequentPoints();
	  }
	  return totalPoints;
  }
  
  public String statement() throws IOException{
	  String result = "Rental Record for " + this.getName() + "\n";
	  
	  Enumeration rentals = _rentals.elements();
	  
	  while( rentals.hasMoreElements() ) {
		  Rental each = (Rental) rentals.nextElement();
		  result += "\t" + each.getMovieTitle() + "\t"
	              + String.valueOf( each.getPrice() ) + "\n";
	  }
	  
	  result += "Amount owed is " + String.valueOf(this.calculateRentalAmount()) + "\n";
	  result += "You earned " + String.valueOf( this.calculateFrequentPoints() )
	              + " frequent renter points";
	  HtmlStatement hs = new HtmlStatement(result, "test");
	  
	  return result;
  }
}
