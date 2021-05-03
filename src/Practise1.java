import java.util.Scanner;

public class Practise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = "google";
        String b = "ogl";


        for (int i = 0; i < a.length(); i++) {
            String temp = "";
            for (int j = i; j < a.length(); j++) {
                temp = temp + a.charAt(j);
                // System.out.println(temp);
                if (b.equals(temp)) {
                    System.out.println("True");
                    break;
                }
            }

        }


    }


}




