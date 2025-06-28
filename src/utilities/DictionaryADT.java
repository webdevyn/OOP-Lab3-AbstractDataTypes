package utilities;

/**
* DictionaryADT.java
*
* @author Devyn Weir
* @version major.minor revision number starting at 1.0
* 
* Class Definition: This interface represents the public contract for the
* implementation of Dictionary for the DictionaryADT Lab. The Dictionary will map keys to values
* using (key, value) pairs.
*
* Keys must be unique (no duplicate keys).
* Values must only be associated with one key.
*
* @param <K> the type of keys maintained by this dictionary
* @param <V> the type of mapped values
*/

public interface DictionaryADT<K,V> {
    //Operations

    /**
     * Returns {@code true} if the Dictionary contains a mapping for a specified key {@code k}.
     * It will check for a matching key in the Dictionary using {@code Objects.equals(key, k)}.
     * The variable {@code k} represents each key in the Dictionary map being compared against {@code key}.
     *
     * @param key A key to check for existence in Dictionary.
     *
     * @return {@code true} if there is a matching key in Dictionary.
     *
     * @throws ClassCastException if the key type is not supported for this map.
     * @throws NullPointerException if the key is null and the map does not accept null key values.
     */
    boolean containsKey(K key);

    /**
     * Inserts a key-value pair into the Dictionary. If Dictionary previously contained a map for
     * the key-value pair, the old map value for the matching key will be replaced with the newly
     * inserted value.
     * The check to see if key already exists in the Dictionary {@code d} is done by using
     * {@link #containsKey(K key) d.containsKey(key)} and checking if this returns {@code true}.
     *
     * @param key A key that a value will be associated with
     * @param value A value that will be associated with the specified key
     *
     * @return the old value associated with the key, or {@code null} if this is a new
     * key-value pair insertion.
     *
     * @throws NullPointerException if the key to be inserted is {@code null}, unless
     * the Dictionary map accepts {@code null} key values.
     */
    V insert(K key, V value);

    /**
     * Removes the key-value pair from the Dictionary map if it exists. If {@code Objects.equals(key, k)}
     * finds a matching key, that mapping will be removed.
     *
     * This will return the value associated with the removed {@code key}. the value {@code null}
     * will return either if the Dictionary map did not contain that key or the dictionary permits
     * {@code null} values and a {@code null} value is associated with the removed key.
     *
     * Once the method returns, no mapping will exist for the removed {@code key}.
     *
     * @param key A key that is a part of a key-value pair that will be removed from the Dictionary map.
     *
     * @return the value associated with the removed {@code key}, could be {@code null}.
     *
     * @throws ClassCastException if the key type is unsupported for this Dictionary map.
     * @throws NullPointerException if the key is null and the Dictionary map does nt support
     * {@code null} keys.
     */
    V remove(K key);

    /**
     * Updates the {@code value} associated with the provided {@code key}.
     *
     * The provided {@code key} is checked for existence in the Dictionary map using
     * {@link #containsKey(K key) d.containsKey(key)}, if {@code key} exists the current {@code value} is
     * replaced by the newly provided {@code value}.
     *
     * If the key does not exist, an exception is thrown.
     *
     * If the {@code key} or {@code value} is {@code null} and {@code null} is not permitted, an
     * exception is thrown.
     *
     * @param key A key whose value will be updated.
     * @param value A value to replace a value associated with a key in the Dictionary map.
     *
     * @return the previous value associated with the {@code key}.
     *
     * @throws java.util.NoSuchElementException if the Dictionary map does not contain the specified key.
     * @throws NullPointerException if the {@code key} or {@code value} is {@code null} and null keys and
     * values are not allowed.
     */
    V update(K key, V value);

    /**
     * Gets the {@code value} from the Dictionary associated with the provided {@code key}.
     *
     * The {@code value} is returned if the {@code key} exists. The method will return {@code null} if
     * the key is not found or the key is {@code null} and is allowed to be {@code null}.
     *
     * Exception will be thrown if provided {@code key} type is not allowed or provided {@code key} is
     * {@code null} and is not allowed to be {@code null}.
     *
     * @param key The {@code key} whose associated {@code value} will be returned.
     *
     * @return the {@code value} associated with the provided {@code key}, or {code null} if {@code key}
     * does not exist or exists and is allowed to be {@code null}.
     *
     * @throws NullPointerException if the key is {@code null}, and the Dictionary map does not allow
     * {@code null} keys.
     * @throws ClassCastException if the provided {@code key} type is not supported by the Dictionary.
     */
    V get(K key);
}
