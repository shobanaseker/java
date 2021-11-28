public class ArrayAssignmentMay14 {
    public static void main(String[] args) {

        //MaxMin();
        SecondLargest();
        //Equillibrium();
        //MinArrayUpdateReq();
    }

    public static void MaxMin() {
        int[] arr = {32, 4, 78, 5, 78, 4, 9};

        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }

        }
        System.out.println(max + " " + min);
    }

    public static void SecondLargest() {
        int[] arr = {5, 2, 10, 6, 8, 9};

        int temp;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }

        }
        System.out.println(arr[n - 2]);

    }

    public static void Equillibrium() {
        int[] arr = {3, 3, 5, 5, 1};
        int leftsum = 0, rightsum = 0;
        boolean flag = true;

        for (int i = 0; i < arr.length; i++) {
            rightsum = 0;

            for (int j = i + 1; j < arr.length; j++) {
                rightsum += arr[j];
            }
            if (rightsum == leftsum) {
                flag = false;
                System.out.println(i + 1);
                break;
            }
            leftsum += arr[i];
        }
        if (flag) {
            System.out.println(-1);
        }
    }

    public static void MinArrayUpdateReq() {
        int[] arr = {1, 3, 8, 3, 5};
        int num = 4;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < num) {
                int temp = num - arr[i];
                arr[i] += temp;
                count += temp;
            }
        }
        System.out.println(count);
    }

}









