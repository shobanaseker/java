import java.util.HashMap;
import java.util.Map;

public class UserAgeFilterMay17 {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Nrupel", 32);
        hashMap.put("Prateek", 30);
        hashMap.put("Aman", 26);
        hashMap.put("Albert", 28);
        hashMap.put("Yogesh", 44);

        for (Map.Entry<String, Integer> map : hashMap.entrySet()) {
            if (map.getValue() > 30) {
                System.out.println(map.getKey());
            }
        }


    }
}
