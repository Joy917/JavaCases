package algorithms.normal;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @Author Joy
 * @Date 2021/9/11
 * @Desc 手写LRU缓存
 */
public class LRUCache<K, V> extends LinkedHashMap<K, V> {
    private final int CHACHE_SIZE;

    public LRUCache(int chacheSize) {
        // true 表示按照最近访问排序，放头部
        super((int) Math.ceil(chacheSize / 0.75) + 1, 0.75f, true);
        this.CHACHE_SIZE = chacheSize;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        // 若大于缓存指定个数，删除最老的元素
        return size() > CHACHE_SIZE;
    }
}
