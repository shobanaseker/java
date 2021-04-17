import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        conditonstatement(a, b);

    }

    public static void conditonstatement(int a, int b) {
        if (a > b)
            System.out.println("Yes");
        else
            System.out.println("No");

    }
}
