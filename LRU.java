import java.util.*;

class LRUCache<K, V> {
    private final int capacity;
    private final Map<K, V> cache;
    private final Deque<K> order;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.cache = new HashMap<>();
        this.order = new LinkedList<>();
    }

    public V get(K key) {
        if (!cache.containsKey(key)) return null;
        // Move accessed key to front (most recent)
        order.remove(key);
        order.addFirst(key);
        return cache.get(key);
    }

    public void put(K key, V value) {
        if (cache.containsKey(key)) {
            order.remove(key);
        } else if (cache.size() == capacity) {
            // Remove least recently used
            K lru = order.removeLast();
            cache.remove(lru);
        }
        order.addFirst(key);
        cache.put(key, value);
    }

    public void printCache() {
        System.out.println("Cache state: " + order);
    }

    public static void main(String[] args) {
        LRUCache<Integer, String> lru = new LRUCache<>(3);
        lru.put(1, "A");
        lru.put(2, "B");
        lru.put(3, "C");
        lru.printCache(); // [3, 2, 1]

        lru.get(1);       // Access 1 → moves to front
        lru.printCache(); // [1, 3, 2]

        lru.put(4, "D");  // Evicts least recent (2)
        lru.printCache(); // [4, 1, 3]
    }
}
