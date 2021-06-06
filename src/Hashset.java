import java.util.HashSet;
import java.util.LinkedHashSet;

public class Hashset {
    public static void main(String[] args) {
        HashSet<String> hashset = new LinkedHashSet<>();
        String[] s = {"M", "a", "s", "a", "i", " ", "S", "c", "h", "o", "o", "l"};
        for (String i : s) {
            hashset.add(i);
        }
        System.out.println(hashset);
    }

}

