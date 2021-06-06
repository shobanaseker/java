public class LeadingZeros {
    public static void main(String[] args) {
        int[] arr = {2, 0, 0, 1};
        int swap = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if ((i == 0 && arr[j] != 0 || (i != 0))) {
                    if (arr[i] > arr[j]) {
                        swap = arr[i];
                        arr[i] = arr[j];
                        arr[j] = swap;
                    }
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
