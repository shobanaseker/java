import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a integer");
        int num = sc.nextInt();
        asciiInt(num);

        System.out.println("Enter an character");
        char var = sc.next().charAt(0);
        asciiChar(var);

    }

    public static void asciiInt(int ascii) {
        char value = (char) ascii;
        System.out.println(value);
    }

    public static void asciiChar(char ascii) {
        int value = ascii;
        System.out.println(value);
    }
}
