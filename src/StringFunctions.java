public class StringFunctions {
    public static void main(String[] args) {
        String one = "Hello how are you";
        char[] arr = one.toCharArray();
        for (int i = 0; i < arr.length; i += 2) {
            if (i == 'i') {
                i = 'o';
            }
        }
    }

    public static void conCat(String ONE, String TWO) {
        System.out.println(ONE + " " + TWO);
    }

    public static boolean isEqual(String a, String b) {
        if (a.length() == b.length()) {
            for (int i = 0; i < b.length(); i++) {
                if (a != b) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static void compareTo(String c, String d) {
        if (c.length() == d.length()) {
            for (int i = 0; i < d.length(); i++) {
                if (c.charAt(0) != d.charAt(0)) {
                    System.out.println(c.charAt(0) - d.charAt(0));
                }
            }
        }

    }

    public static boolean isEmpty(String e) {
        if (e.length() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void replaceString(String f) {
        String str = "";
        for (int i = 0; i < f.length(); i++) {
            if (f.charAt(i) == 'a') {
                str += 'l';
            } else {
                str += f.charAt(i);
            }

        }
        System.out.println(str);
    }

    public static void trimString(String str) {
        int strInx = 0;
        int endInx = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                strInx = i;
                break;
            }

        }

        for (int i = str.length() - 1; i > 0; i--) {
            if (str.charAt(i) != ' ') {
                endInx = i + 1;
                break;
            }

        }
        System.out.println(str.substring(strInx, endInx));


    }


}









