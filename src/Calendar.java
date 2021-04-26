public class Calendar {
    public static void main(String[] args) {
        calen();

    }

    public static void calen() {
        int year = 2020;
        for (int mon = 1; mon <= 7; mon++) {
            if (mon % 2 != 0) {
                for (int date = 1; date <= 31; date++) {
                    System.out.println(year + " " + mon + " " + date);
                }
            } else if (mon == 2) {
                for (int date = 1; date <= 29; date++) {
                    System.out.println(year + " " + mon + " " + date);
                }
            } else {
                for (int date = 1; date <= 30; date++) {
                    System.out.println(year + " " + mon + " " + date);
                }
            }

        }
        for (int mon = 8; mon <= 12; mon++) {
            if (mon % 2 != 0) {
                for (int date = 1; date <= 30; date++) {
                    System.out.println(year + " " + mon + " " + date);
                }
            } else {
                for (int date = 1; date <= 31; date++) {
                    System.out.println(year + " " + mon + " " + date);
                }
            }
        }
    }
}
