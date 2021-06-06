public class ArrayOutOfBounds {
    public static void main(String[] args) {
        int[] array = {1, 2, -3, 4, 5};
        int[] index = {3, 2, 0};
        boolean flag = true;

        for (int i = 0; i < index.length; i++) {
            if (index[i] < array.length) {
                array[index[i]] = 0;
            } else {
                System.out.println("Array Index Out of Bounds");
                flag = false;
                break;
            }
        }
        if (flag) {
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }
        }

    }
}
