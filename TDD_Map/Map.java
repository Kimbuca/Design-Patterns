package TDD_Map;
import java.util.Collection;
import java.util.NoSuchElementException;

public interface Map<K, V> {
	
	public void clear();							// Remove all the elements from the map.
	public boolean containsKey(K key);				// Returns true if contains the given key
	public boolean containsValue(V value);			// Returns true if contains value
	public V get(K key);							// Return the Value associated with this key
	public V getOrDefault(K key, V defaultValue);	// Return the value if exists or the default
	public boolean isEmpty();						// Return true if Empty.
	public void put(K key, V value);				// Put value on map.
	public V remove( K key );						// Remove element
	public void replace( K key, V value ) throws NoSuchElementException;	//Replace element
	public int size();								// Returns the size
	public Collection<V> values();					// Return all the stored values

}
