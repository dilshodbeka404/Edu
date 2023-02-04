package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Dilshodbek Akhmedov, Sat 5:49 PM. 1/7/23
 */
public class Solution535 {
    public class Codec {
        Map<String, String> cache;
        int count;

        public Codec() {
            cache = new HashMap<>();
            count = 0;
        }

        // Encodes a URL to a shortened URL.
        public String encode(String longUrl) {
            String key = count + "";
            cache.put(key, longUrl);
            count++;
            return key;
        }

        // Decodes a shortened URL to its original URL.
        public String decode(String shortUrl) {
            return cache.get(shortUrl);
        }
    }

}
