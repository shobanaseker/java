public class PairsMay10 {
    public static void main(String[] args) {
        // Pair();
        Maxoccuring();
        //CharacterOccurance();
        //Unique();
    }

    public static void Pair() {
        int[] arr = {8, 4, 6, 2, 5, 3};
        int a = 10;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == a) {
                    System.out.println(arr[i] + " " + arr[j]);


                }
            }
        }
    }


    public static void Maxoccuring() {
        int[] arr = {0, 2, 0, 2, 2};
        int glomax = 0;
        int gloMaxVal = arr[0];

        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (glomax < count) {
                glomax = count;
                gloMaxVal = arr[i];
            }
        }
        System.out.println(gloMaxVal + "-" + glomax);


    }

    public static void CharacterOccurance() {
        String str = "Masai School";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char a = str.charAt(i);
            count = 0;
            for (int j = 0; j < str.length(); j++) {
                char b = str.charAt(j);

                if (a == b) {
                    count++;
                }

            }
            System.out.println(a + " " + count);

        }

    }

    public static void Unique() {
        int[] arr = {10, 20, 10, 30, 40};
        int[] arr1 = new int[arr.length];
        int k = 0;
        boolean flag = true;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {
                if ((arr[i] == arr[j]) && (i != j)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(arr[i]);
            }
        }
    }
}








