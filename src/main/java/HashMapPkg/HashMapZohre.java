package HashMapPkg;

import java.util.ArrayList;
import java.util.List;

public class HashMapZohre<K, V> {


    private List<Entry<K, V>> list;

    public HashMapZohre() {
        list = new ArrayList<>();
    }

    public V put(K key, V value) {
        for (Entry<K, V> entry : list) {
            if (entry.getKey().equals(key)) {
                entry.setValue(value);
                return value;
            }
        }
        list.add(new Entry<>(key, value));
        return value;
    }

    public boolean containsKey(K key) {
        for (Entry<K, V> entry : list) {
            if (entry.getKey().equals(key))
                return true;
        }
        return false;
    }

    public boolean isEmpty() {
        return list.size() == 0;
    }

    public List<V> getAllValue() {
        List<V> values = new ArrayList<>();
        for (Entry<K, V> entry : list) {
            values.add(entry.getValue());
        }
        return values;
    }

    public V replace(K key, V newValue) {
        //  V curValue = null;
        if (containsKey(key))
            return put(key, newValue);
        return null;
    }

    public V replace(K key, V oldValue, V newValue) {
        for (Entry<K, V> entry : list) {
            if (entry.getKey().equals(key) && entry.getValue().equals(oldValue))
                return put(key, newValue);
        }
        return null;
    }

    public V get(K key) {
        for (Entry<K, V> entry : list) {
            if (entry.getKey().equals(key))
                return entry.getValue();
        }
        throw new IllegalArgumentException("Key not found");
    }

    public void remove(K key) {
        int i = 0;
        for (Entry<K, V> entry : list) {
            if (entry.getKey().equals(key)) {
                list.remove(i);
                return;
            }
            i++;
        }
    }

    @Override
    public String toString() {
        return "HashMapZohre = " + list;
    }
}
