import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Hashset1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<Character, Integer> hashmap = new LinkedHashMap<>();
        String str = "Masai school";
        int count;
        for (int i = 0; i < str.length(); i++) {
            count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count += 1;
                }
            }
            hashmap.put(str.charAt(i), count);
        }
        System.out.println(hashmap);

    }
}
