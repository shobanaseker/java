public class ArraysTwoDimensional {
    public static void main(String[] args) {
        //MatrixAdd();
        //Transpose();
        //DiagonalDiff();
        //SubMatrix();
        ColumnSum();

    }

    public static void MatrixAdd() {
        int[][] MatrixOne = {{1, 2, 3}, {5, 6, 7}, {7, 8, 9}};
        int[][] MatrixTwo = {{2, 1, 2}, {1, 2, 1}, {2, 1, 2}};

        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                System.out.print(MatrixOne[i][j] + MatrixTwo[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void Transpose() {
        int[][] MatrixOne = {{1, 2, 3}, {4, 5, 6}};

        int a = MatrixOne.length;
        int b = MatrixOne[0].length;

        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print(MatrixOne[j][i] + " ");
            }
            System.out.println();
        }

    }

    public static void DiagonalDiff() {
        int[][] Matrix = {{1, 2, 3}, {4, 5, 6}, {0, 8, 9}};
        int LeftSum = 0, RightSum = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    LeftSum += Matrix[i][i];
                }
                if (j == 2 - i) {
                    RightSum += Matrix[i][j];
                }
            }
        }
        System.out.println(LeftSum - RightSum);
    }


    public static void SubMatrix() {
        int[][] Matrix = {{1, 2, 3}, {5, 6, 7}, {7, 8, 9}};
        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j <= 1; j++) {
                System.out.print(Matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void ColumnSum() {
        int[][] a = {{1, 2, 1}, {2, 1, 2}};
        for (int i = 0; i < 3; i++) {
            int sum = 0;
            for (int j = 0; j < 2; j++) {
                sum = sum + a[j][i];
            }
            System.out.print(sum + " ");
        }
    }

    public static void Number() {
        String a = "google";
        String temp = "";
        for (int i = 0; i < a.length(); i++) {
            for (int j = i; j < a.length(); j++) {


            }
        }
    }


}


