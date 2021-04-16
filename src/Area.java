import java.util.Scanner;

public class Area {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("enter side");
        int side = sc.nextInt();
        areaofsquare(side);

        System.out.println("enter length and breadth");
        int length = sc.nextInt(), breadth = sc.nextInt();
        areaofrectangle(length, breadth);

        System.out.println("enter r");
        int r = sc.nextInt();
        areaofcircle(r);

        System.out.println("enter height and base");
        int height = sc.nextInt(), base = sc.nextInt();
        areaoftriangle(height, base);


    }

    public static void areaofrectangle(int length, int breadth) {
        System.out.println("Area of Rectangle" + length * breadth);
    }

    public static void areaofcircle(int r) {
        System.out.println("Area of Circle" + 3.14 * r * r);
    }

    public static void areaoftriangle(int height, int base) {
        System.out.println("Area of Triangle" + (base * height) / 2);
    }

    public static void areaofsquare(int side) {
        System.out.println("Area of Square" + side * side);
    }

}
