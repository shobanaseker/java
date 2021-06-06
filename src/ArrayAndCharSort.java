public class ArrayAndCharSort {
    public static void main(String[] args) {
        NumSort();
        CharSort();
    }

    public static void NumSort() {
        int[] arr = {20, 40, 60, 80, 70};

        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void CharSort() {
        char[] arr = {'d', 'b', 'a', 'c'};

        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = (char) temp;
                }

            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


    }
}
