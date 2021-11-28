public class CoronaVirus {
    public static void main(String[] args) {
        String a = "coronavirus";
        String b = "dangerouscovid";
        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            String temp = "";
            for (int j = i; j < a.length(); j++) {
                temp = temp + a.charAt(j);
                char ch = a.charAt(j);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    count++;
                }

                System.out.println(count);

            }
        }
        for (int i = 0; i < b.length(); i++) {
            String empty = "";
            for (int j = i; j < b.length(); j++) {
                empty = empty + b.charAt(j);
                System.out.println(empty);
            }
        }
    }
}
