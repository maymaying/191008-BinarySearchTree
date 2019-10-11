import java.util.Map;
import java.util.TreeMap;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, String> map = new TreeMap<>();
        System.out.println(map.get("小明"));
        System.out.println(map.getOrDefault("明", "查无此人"));
        String oldValue = map.put("明", "12345678");
        System.out.println(oldValue);
        oldValue = map.put("明", "9999999");
        System.out.println(oldValue);

        map.put("丁", "1212121");
        map.put("莹", "2222222");
        map.put("影", "333333");

        System.out.println(map.keySet());
        for (String key : map.keySet()) {
            System.out.println(key);
        }
        System.out.println(map.values());
        for (String value : map.values()) {
            System.out.println(value);
        }
        System.out.println(map.entrySet());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        System.out.println(map.containsKey("名"));
        System.out.println(map.containsKey("明"));
        System.out.println(map.containsValue("2222222"));
    }
}
