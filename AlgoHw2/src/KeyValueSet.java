/**
 * This is code to implement a key value pair with generics.
 * 
 * The assigned question was this:
 * 
 * Implement the following ADT:

public class KeyValueSet<K,V>
KeyValueSet()			 // create a new KeyValueSet
void add(K key, V value)		 // add key-value
int size()				 // # of key-value pairs in the set
boolean containsKey(K key)	 // set contains key?
boolean containsValue(V value) // set contains value?
	
	*Notes: for this implementation you can keep things simple and use fixed-size arrays to store your 
key-value pairs. Duplicate key-value pairs are OK.

 * @author tcmoody
 *
 * @param <K>
 * @param <V>
 */
public class KeyValueSet<K, V> {
	
	class KeyValuePair{
		K key;
		V value;
		
		public KeyValuePair(K key2, V value2) {
			key = key2;
			value = value2;
		}
	}
	
	private KeyValuePair[] keyValueList;
	private final int length=100;
	private int counter=0;
	
	KeyValueSet(){
		keyValueList = (KeyValueSet<K, V>.KeyValuePair[]) new Object[length];
	}
	
	void add(K key, V value){
		KeyValuePair pair = new KeyValuePair(key, value);
		if(counter<100){
			keyValueList[counter] = pair;
			counter++;
		}
	}
	
	int size(){
		return counter;
	}
	
	boolean containsKey(K key){
		for(int i=0; i<counter; i++){
			if(keyValueList[i].key == key){
				return true;
			}
		}
		return false;
	}
	
	boolean containsValue(V value){
		for(int i=0; i<counter; i++){
			if(keyValueList[i].value==value){
				return true;
			}
		}
		return false;
	}
}