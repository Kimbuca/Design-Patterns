package TDD_Map;

import org.junit.Assert;
import org.junit.Test;

public class MapTest {
	
	@Test
	public void testPutItem(){
		Map<String, Integer> map = new someMap<String, Integer>();
		map.put("Sagnelly", 24);
		map.put("Wilson", 60);
		map.put("Guevara", 33);
		
		Assert.assertEquals(3, map.size());
	}
	
	@Test
	public void testClearItems(){
		Map<String, Integer> map = new someMap<String, Integer>();
		map.put("Sagnelly", 24);
		map.put("Wilson", 60);
		map.put("Guevara", 33);
		
		map.clear();
		
		Assert.assertEquals(0, map.size());
		
	}
	
	
	@Test
	public void testContainsKey(){
		Map<String, Integer> map = new someMap<String, Integer>();
		map.put("Sagnelly", 24);
		map.put("Wilson", 60);
		
		Assert.assertTrue(map.containsKey("Sagnelly"));
		Assert.assertFalse(map.containsKey("Pilgrim"));
		
	}
	
	@Test
	public void testContainsValue(){
		Map<String, Object> map = new someMap<String, Object>();
		map.put("Sagnelly", 24);
		map.put("Katya", "166cm");
		
		Assert.assertTrue(map.containsValue(24));
		Assert.assertTrue(map.containsValue("166cm"));
		
		Assert.assertFalse(map.containsValue(80));
		
		
	}
	
	@Test
	public void testGet(){
		Map<Object, Object> map = new someMap<Object, Object>();
		map.put("Sagnelly", 24);
		
		//im testing both get and getOrDefault
		Assert.assertEquals(24, map.get("Sagnelly"));
		Assert.assertEquals(80, map.get("nothin' here!"));
		
	}
	
	@Test
	public void testRemove(){
		Map<Object, Object> map = new someMap<Object, Object>();
		map.put("Sagnelly", 24);
		
		
		Assert.assertEquals(24, map.remove("Sagnelly"));
		Assert.assertEquals(0, map.size());
		
	}
	
	
	@Test
	public void testReplace(){
		Map<Object, Object> map = new someMap<Object, Object>();
		
		map.put("Sagnelly", 24);
		map.replace("Sagnelly", 80);
		
		Assert.assertEquals(80, map.get("Sagnelly"));
		
	}
	
	//in my computer this does not work, but It sures throws the expection
	@Test(expected = java.util.NoSuchElementException.class) 
	public void testFailReplace(){
		Map<Object, Object> map = new someMap<Object, Object>();
		map.put("Sagnelly", 24);
		
		map.replace("Sagnelle", 40);
		
	}
	

	public void testValues(){
		Map<Object, Object> map = new someMap<Object, Object>();
		
		map.put("Sagnelly", 24);
		map.put("Wilson", 60);
		map.put("Guevara", 33);
		map.put("Abby", 33);
		map.put("Patel", 70);
		map.put("Smith", 10);
		
	
		for(Object i:map.values())
			System.out.println(i);
		
	}
	
	public static void main(String[] args){
		MapTest mt = new MapTest();
		
		mt.testPutItem();
		mt.testClearItems();
		mt.testContainsKey();
		mt.testContainsValue();
		mt.testRemove();
		mt.testReplace();
		mt.testFailReplace();
		//mt.testValues();
		
	}

}
