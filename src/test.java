public class test {
    public static void main(String[] args) {
        String a = "abcd";
        for (int i = 0; i < a.length(); i++) {
            char v = a.charAt(i);
            int b = (122 - v) + 97;
            char s = (char) b;
            System.out.print(s + " ");

        }

    }
}