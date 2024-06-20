package Collection;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Huy", 3);
        map.put("Long", 3);
        map.put("Đạt", 4);
        map.put("Hà", 5);
        map.put("Huy", 2);

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            String key = pair.getKey();
            Integer value = pair.getValue();
            System.out.printf("👉 %s %d%n", key, value);
        }

    }
}
