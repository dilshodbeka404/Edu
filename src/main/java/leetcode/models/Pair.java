package leetcode.models;

/**
 * @author Dilshodbek Akhmedov, Sesh 16:19. 13/12/22
 */
public class Pair<K, V> {
    private K key;
    private V val;

    public Pair() {
    }

    public Pair(K key, V val) {
        this.key = key;
        this.val = val;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getVal() {
        return val;
    }

    public void setVal(V val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "key=" + key +
                ", val=" + val +
                '}';
    }
}
