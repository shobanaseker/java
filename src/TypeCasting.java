public class TypeCasting {
    public static void main(String[] args) {
        String a = "masai";
        for (int i = 0; i < a.length(); i++) {
            String count = "";
            for (int j = i; j < a.length(); j++) {
                count = count + a.charAt(j);
                System.out.println(count);
            }
        }
    }
}

