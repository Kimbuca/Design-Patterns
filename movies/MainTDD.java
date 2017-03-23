package movies;
import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MainTDD {
	
	private Movie childrenMovie;
	private Movie newMovie;
	private Movie regularMovie;
	
	@Before
	  public void setup(){
	    childrenMovie = new ChildrenMovie("Frozen");
	    newMovie = new ChildrenMovie("Logan");
	    regularMovie = new ChildrenMovie("Pulp Fiction");
	  }
	
	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
