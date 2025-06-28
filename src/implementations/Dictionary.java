package implementations;

import java.util.ArrayList;

import utilities.DictionaryADT;

public class Dictionary<K,V> implements DictionaryADT<K,V>
{
	// constant
	private static final int DEFAULT_SIZE = 10;
	
	// index indicates pairing, e.g. keys[1] is stored at values[1]
	private ArrayList<K> keys;
	private ArrayList<V> values;

	@Override
	public boolean containsKey(K key) {
		return false;
	}

	@Override
	public V insert(K key, V value) {
		return null;
	}

	@Override
	public V remove(K key) {
		return null;
	}

	@Override
	public V update(K key, V value) {
		return null;
	}

	@Override
	public V get(K key) {
		return null;
	}
}
