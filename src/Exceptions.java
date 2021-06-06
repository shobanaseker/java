public class Exceptions {
    public static void main(String[] args) {
        Array();
        Arithmetic();
    }

    public static void Array() {
        int[] arr = {1, 2, 3, 4, 5};
        try {
            System.out.println(arr[7]);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Successfull");
    }

    public static void Arithmetic() {
        try {
            int a = 50 / 0;
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        System.out.println("rest code");

    }

}
