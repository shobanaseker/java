import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        function(num);


    }

    public static void function(int num) {
        for (int i = 1; i <= num; i++) {
            System.out.println("hello!");
        }
    }
}

