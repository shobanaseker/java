public class Rectangle {
    static int length = 2;
    int breadth = 2;

    public static void Area() {
        Rectangle ar = new Rectangle();
        int result = length * ar.breadth;
        System.out.println(result);

    }

    public static void Perimeter() {
        Rectangle pr = new Rectangle();
        int result1 = 2 * (length + pr.breadth);
        System.out.println(result1);
    }

}
