package TDD_Map;

import java.util.Arrays;
import java.util.Collection;
import java.util.NoSuchElementException;

public class someMap<K, V> implements Map<K, V>{
	
	private int size;
	private Object[] arr = new Object[103];
	
	
	// My methods 
	private int hash(Object key){
		return Math.abs(key.hashCode()%this.arr.length);
	}
	
	
	//The interface methods
	@Override
	public void clear() {
		this.arr = new Object[103];
		this.size = 0;
		
	}

	@Override
	public boolean containsKey(Object key) {
		if(arr[hash(key)]!=null)
			return true;
		return false;
	}

	@Override
	public boolean containsValue(Object value) {
		for(Object obj : this.arr)
			if(obj != null && obj.equals(value))	
				return true;
		return false;
	}

	@Override
	public Object get(Object key) {
		return getOrDefault(key, "nothin' here!");
	}

	@Override
	public Object getOrDefault(Object key, Object defaultValue){
		Object Item = this.arr[hash(key)];
		if(Item == null)
			return defaultValue;
		return Item;
	}
	

	@Override
	public boolean isEmpty() {
		if(this.size != 0)
			return true;
		return false;
	}

	@Override
	public void put(Object key, Object value) {
		this.arr[hash(key)] = value;
		this.size++;
		
	}

	@Override
	public Object remove(Object key) {
		if(this.containsKey(key)){
			Object Item = this.arr[hash(key)];
			this.arr[hash(key)] = null;
			this.size--;
			return Item;
		}
			
		return null;
	}

	@Override
	public void replace(Object key, Object value) throws NoSuchElementException {
		if(!this.containsKey(key))
			throw new NoSuchElementException();
		this.arr[hash(key)] = value; // Im not reusing put bc of the size increment on it
	}

	@Override
	public int size() {
		return this.size;
	}

	@Override
	public Collection values() {	
		return Arrays.asList(arr);
	}

}
