package movies;

import java.io.IOException;

/**
 *
 * @author jzab
 */
public class Main {

  public static void main( String[] args ) throws IOException {
    Customer customer = new Customer( "John" );

    Movie movie = new RegularMovie("Star Wars");
    Movie movie2 = new RegularMovie("Star Wars 2");
    Movie movie3 = new NewReleaseMovie("Star Wars 7");
    Movie movie4 = new ChildrenMovie("Extrano mundo de Jack");
    Movie movie5 = new ChildrenMovie("Frozen");
    
    Rental rental = new Rental( movie, 4 );
    Rental rental2 = new Rental( movie2, 3 );
    Rental rental3 = new Rental( movie3, 5 );
    Rental rental4 = new Rental( movie4, 2 );
    Rental rental5 = new Rental( movie5, 1 );
    
    customer.addRental( rental );
    customer.addRental( rental2 );
    customer.addRental( rental3 );
    customer.addRental( rental4 );
    customer.addRental( rental5 );
    
    String statement = customer.statement();
    System.out.println( statement );

  }

}
