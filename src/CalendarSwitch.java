public class CalendarSwitch {
    public static void main(String[] args) {
        int date, month, year = 2020;
        for (month = 1; month <= 12; month++) {
            switch (month) {


                case 1:
                case 3:
                    for (date = 1; date <= 31; date++) {
                        System.out.println(year + " " + month + " " + date);
                    }
                    break;
                case 2:
                    for (date = 1; date <= 28; date++) {
                        System.out.println(year + " " + month + " " + date);
                    }
                    break;
                case 4:
                    for (date = 1; date <= 30; date++) {
                        System.out.println(year + " " + month + " " + date);
                    }
                    break;
                case 5:
                    for (date = 1; date <= 31; date++) {
                        System.out.println(year + " " + month + " " + date);
                    }
                    break;
                case 6:
                    for (date = 1; date <= 30; date++) {
                        System.out.println(year + " " + month + " " + date);
                    }
                    break;
                case 7:
                    for (date = 1; date <= 31; date++) {
                        System.out.println(year + " " + month + " " + date);
                    }
                    break;
                case 8:
                    for (date = 1; date <= 31; date++) {
                        System.out.println(year + " " + month + " " + date);
                    }
                    break;
                case 9:
                    for (date = 1; date <= 30; date++) {
                        System.out.println(year + " " + month + " " + date);
                    }
                    break;
                case 10:
                    for (date = 1; date <= 31; date++) {
                        System.out.println(year + " " + month + " " + date);
                    }
                    break;
                case 11:
                    for (date = 1; date <= 30; date++) {
                        System.out.println(year + " " + month + " " + date);
                    }
                    break;
                case 12:
                    for (date = 1; date <= 31; date++) {
                        System.out.println(year + " " + month + " " + date);
                    }
                    break;

            }
        }
    }
}