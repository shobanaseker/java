public class LowestOfArrays {
    public static void main(String[] args) {
        int[] arr = {10, 5, 9, 1, 4};
        int low = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            int a = arr[i];
            int b = arr[i + 1];
            if (a < b) {
                if (low > a) {
                    low = a;
                }

            } else if (low > b) {
                low = b;
            }
        }
        System.out.println(low);
    }
}
