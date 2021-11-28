import java.util.HashMap;
import java.util.Scanner;

public class Atm1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> bankdetails = new HashMap<>();
        bankdetails.put("Rithika", 9087);
        bankdetails.put("Monisha", 2304);
        bankdetails.put("sangavi", 7687);
        bankdetails.put("shinega", 1234);
        bankdetails.put("shobana", 2201);

        System.out.println("Enter username");
        String username = sc.nextLine();
        System.out.println("Enter pin");
        int pin = sc.nextInt();

        if (bankdetails.containsKey(username)) {
            if (bankdetails.get(username).equals(pin)) {
                int balance = 2500;
                while (true) {
                    int n = sc.nextInt();
                    switch (n) {
                        case 1:
                            System.out.print("Enter withdraw amt");
                            int withdraw = sc.nextInt();
                            if (balance >= withdraw) {
                                balance = balance - withdraw;
                                System.out.println("take your money");
                            } else {
                                System.out.println("balance not sufficient");
                            }
                            break;
                        case 2:

                            System.out.print("money to be deposited:");
                            int deposit = sc.nextInt();
                            balance = balance + deposit;
                            System.out.println("money successfully deposited");
                            break;

                        case 3:

                            System.out.println(balance);
                            break;
                    }


                }


            }
        }
    }
}
