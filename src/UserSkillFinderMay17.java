import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UserSkillFinderMay17 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, ArrayList> hashMap = new HashMap<>();

        while (true) {
            ArrayList<String> list = new ArrayList<>();
            System.out.println("Enter name");
            String name = sc.nextLine();
            if (name.equals("-1")) {
                break;
            }

            while (true) {
                System.out.println("Enter skills");
                String skills = sc.nextLine();
                if (skills.equals("-1")) {
                    break;
                }
                list.add(skills);
            }
            hashMap.put(name, list);
        }
        for (Map.Entry<String, ArrayList> map : hashMap.entrySet()) {
            //System.out.println(map.getKey()+ "-" +map.getValue());
            for (int i = 0; i < map.getValue().size(); i++) {
                if (map.getValue().get(i).equals("ds")) {
                    System.out.println(map.getKey());
                    break;
                }
            }

        }
    }
}
