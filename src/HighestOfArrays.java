public class HighestOfArrays {
    public static void main(String[] args) {
        int[] arr = {10, 22, 5, 8};
        int high = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            int a = arr[i];
            int b = arr[i + 1];
            if (a < b) {
                if (high < b) {
                    high = b;
                }
            } else {
                high = a;
            }
        }
        System.out.println(high);
    }
}
