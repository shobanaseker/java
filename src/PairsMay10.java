public class PairsMay10 {
    public static void main(String[] args) {
        // Pair();
        //Maxoccuring();
        //CharacterOccurance();
        uniqueValue();
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


    public static void uniqueValue() {
        int[] arr = {10, 20, 30, 10, 40, -2, 30};
        int[] val = new int[7];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            int flag = 0;
            for (int j = 0; j < arr.length; j++) {
                if (i != j) {
                    if (arr[i] == arr[j]) {
                        flag = 1;
                        break;
                    }
                }
            }
            if (flag == 0) {
                val[index] = arr[i];
                index++;
            }
        }
        for (int i = 0; i < index; i++) {
            System.out.println(val[i]);
        }
    }
}








