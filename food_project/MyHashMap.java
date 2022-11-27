package food_project;

import java.util.*;

public class MyHashMap<K, V> implements Map<K, V>{
    private static class Pair<K, V> implements Map.Entry<K, V> {
        private final K key;
        private V value;

        public Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        public V setValue(V newValue) {
            V old = value;
            value = newValue;
            return old;
        }

        @Override
        public boolean equals(Object o) {
            if (!(o instanceof Pair))
                return false;

            Pair pair = (Pair) o;
            return key.equals(pair.key) && value.equals(pair.value);
        }

        @Override
        public String toString() {
            return key + "=" + value;
        }

        @Override
        public int hashCode() {
            return Objects.hashCode(key) ^ Objects.hashCode(value);
        }
    }

    private ArrayList<LinkedList<Pair<K, V>>> table;
    private int size;

    public MyHashMap() {
        table = new ArrayList<>();

        for (int i=0; i<20; i++) {
            table.add(new LinkedList<>());
        }

        size = 0;
    }

    public MyHashMap(Map<? extends K, ? extends V> map) {
        this();
        putAll(map);
    }

    private LinkedList<Pair<K, V>> getList(K key) {
        int index = Math.abs(key.hashCode() % table.size());
        return table.get(index);
    }

    public V put(K key, V value) {
        LinkedList<Pair<K, V>> list = getList(key);

        V old = null;

        if (containsKey(key)) {
            for (Pair pair: list) {
                if (pair.getKey().equals(key)) {
                    old = (V) pair.getValue();
                    pair.setValue(value);
                }
            }
        } else {
            list.add(new Pair<>(key, value));
            size++;
        }

        return old;
    }

    public V remove(Object obj) {
        K key = (K) obj;
        V removedValue = null;

        if (containsKey(key)) {
            LinkedList<Pair<K, V>> list = getList(key);
            V value = get(key);

            int index = list.indexOf(new Pair<>(key, value));

            removedValue = list.get(index).getValue();
            list.remove(index);

            size--;
        }

        return removedValue;
    }

    public V get(Object key) {
        LinkedList<Pair<K, V>> list = getList((K) key);
        for (Pair pair: list) {
            if (pair.getKey().equals(key))
                return (V) pair.getValue();
        }

        return null;
    }

    public boolean containsKey(Object key) {
        LinkedList<Pair<K, V>> list = getList((K) key);
        for (Pair pair: list)
            if (pair.getKey().equals(key))
                return true;

        return false;
    }

    public boolean containsValue(Object value) {
        for (LinkedList<Pair<K, V>> list: table)
            for (Pair pair: list)
                if (pair.getValue().equals(value))
                    return true;

        return false;
    }

    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = new HashSet<>();

        for (LinkedList<Pair<K, V>> list: table) {
            set.addAll(list);

            // Which is the same as:
            /*
                for (Pair pair: list) {
                    set.add(pair);
                }
             */
        }
        return set;
    }

    public Set<K> keySet() {
        Set<K> set = new HashSet<>();
        for (LinkedList<Pair<K, V>> list: table) {
            for (Pair pair: list) {
                set.add((K) pair.getKey());
            }
        }
        return set;
    }

    public Collection<V> values() {
        Collection<V> values = new ArrayList<>();
        for (LinkedList<Pair<K, V>> list: table)
            for (Pair pair: list)
                values.add((V) pair.getValue());

        return values;
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry<?, ?> entry: map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            put((K)key, (V)value);
        }
    }

    @Override
    public void clear() {
        for (LinkedList<Pair<K, V>> list: table)
            list.clear();

        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof MyHashMap))
            return false;

        MyHashMap other = (MyHashMap) o;

        if(size() != other.size())
            return false;

        if (this.entrySet().equals(other.entrySet()))
            return false;

        return true;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("{");
        int count = 0;

        for (LinkedList<Pair<K, V>> list: table) {
            for (Pair pair : list) {
                count++;
                str.append(pair);

                if (count < size())
                    str.append(", ");
            }
        }

        str.append("}");

        return str.toString();
    }
}
