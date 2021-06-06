import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MayAssignment21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Yogesh", 915678);
        hashMap.put("Nrupul", 512345);
        hashMap.put("Prateek", 213456);
        hashMap.put("Aman", 120987);
        hashMap.put("Madhukar", 769871);

        System.out.println("Enter user");
        String a = sc.nextLine();
        boolean flag = false;
        for (Map.Entry<String, Integer> map : hashMap.entrySet()) {
            if (map.getKey().equals(a)) {
                System.out.println(map.getValue());
                flag = true;
                break;
            }
        }
        if (flag == false) {
            System.out.println("No User Found");
        }
    }
}
