public class SubstringPalindrome {
    public static void main(String[] args) {
        String str = "Masai";
        for (int i = 0; i < str.length(); i++) {
            String temp = "";
            for (int j = i; j < str.length(); j++) {
                temp = temp + str.charAt(j);
                String subrev = "";
                if (temp.length() > 1) {
                    for (int k = temp.length() - 1; k >= 0; k--) {
                        subrev = subrev + temp.charAt(k);
                    }
                }
                if (subrev.equals(temp)) {
                    System.out.println("palindrome");
                    break;
                }


            }
        }
    }
}
