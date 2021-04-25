import java.util.Scanner;

public class AdditionInFunctions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        Additionoftwo(a, b);
    }


    public static void Additionoftwo(int a, int b) {
        int res = a + b;
        System.out.println("Add two numbers" + " " + res);

    }
}
