public class Pattern {
    public static void main(String[] args) {
        //Star();
        //Reverse();
        //SentenceReverse();
        Palindrome();
    }

    public static void Star() {
        int r = 5;
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();

        }
    }

    public static void Reverse() {
        StringBuffer s = new StringBuffer("This is my book");
        s = s.reverse();
        System.out.println(s);
    }

    public static void SentenceReverse() {
        String s[] = "This is my book".split(" ");
        String ans = " ";
        for (int i = s.length - 1; i >= 0; i--) {
            ans += s[i] + " ";
        }
        System.out.println(ans);
    }

    public static void Palindrome() {
        String s = "1213";
        String s1 = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            s1 += s.charAt(i);
        }
        if (s.equals(s1)) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }
    }

    public static void Num() {
        int num = 121;
        int num1 = 0;
        while (num != 0) {

        }
    }
}
