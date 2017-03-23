package testdriven;

public class ListTest {

	public void testAddItem(){
		List list = new MyList();
		list.addItem("Item");
		
		Assert.assertEquals(1, list.size());
	}
	
	
	public void testIndexInvalid(){
		//poner lo necesario para hacer un assert con 
		List list = new MyList();
		list.addItem("Item");
		list.addItem("Item2");
		
		Assert.assertEquals(1, list.size());
		
		
		
	}

}
