public class StringAssignment {
    public static void main(String[] args) {
        //Vowels();
        //CountWords();
        //Palindrome();
        //ArraySum();
        //OddEven();
        NumberToWords();

    }

    public static void Vowels() {
        String a = "Masai";
        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        System.out.println(count);

    }

    public static void CountWords() {
        String b = "Hello everyone how are you";
        int count = 1;
        for (int i = 0; i < b.length(); i++) {
            if (b.charAt(i) == ' ') {
                count++;
            }

        }
        System.out.println(count);

    }

    public static void Palindrome() {
        String c = "abba";
        String rev = "";
        for (int i = c.length() - 1; i >= 0; i--) {
            rev += c.charAt(i);
        }
        if (c.equals(rev)) {
            System.out.println("The given string is palindrome");
        } else {
            System.out.println("The given String is not a Palindrome");

        }

    }

    public static void ArraySum() {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);

    }

    public static void OddEven() {
        int[] arr = {1, 4, 2, 3, 5, 6};
        int count = 0, count1 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                count++;
            } else {
                count1++;
            }

        }
        System.out.println("Odd Range:" + arr[count]);
        System.out.println("Even Range:" + arr[count1]);
    }

    public static void NumberToWords() {
        String a = String.valueOf(3987);
        for (int i = 0; i < a.length(); i++) {
            switch (i) {
                case 0:
                    if (a.charAt(i) == '3') {
                        System.out.print("Three" + " ");
                        break;
                    }
                case 1:
                    if (a.charAt(i) == '9') {
                        System.out.print("Nine" + " ");
                        break;
                    }
                case 2:
                    if (a.charAt(i) == '8') {
                        System.out.print("Eight" + " ");
                        break;
                    }
                case 3:
                    if (a.charAt(i) == '7') {
                        System.out.print("Seven");
                        break;
                    }
            }
        }
    }
}



