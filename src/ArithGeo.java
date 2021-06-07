import java.util.Scanner;

public class ArithGeo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        if (followArithmetic(arr)) {
            System.out.println("Arithmetic");
        } else if (followGeometric(arr)) {
            System.out.println("Geometric");
        } else {
            System.out.println("-1");
        }
    }

    private static boolean followArithmetic(int[] arr) {
        int diff = arr[1] - arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] != diff) {
                return false;
            }
        }
        return true;
    }

    private static boolean followGeometric(int[] arr) {
        int mul = arr[1] / arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] / arr[i] != mul) {
                return false;
            }
        }
        return true;
    }

}

