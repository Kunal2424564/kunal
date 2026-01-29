import java.util.Scanner;
public class mobile_app {
    int b = 0;

    public static void main(String[] args) {
        mobile_app obj = new mobile_app();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your user id ");
        String id = sc.nextLine();
        System.out.println("Enter your password");
        String pass1 = "kunal#1234";
        boolean loggedin = false;
        for (int i = 1; i <= 3; i++) {
            String pass = sc.nextLine();
            if (pass.equals(pass1)) {
                loggedin = true;
                break;
            } else {
                System.out.println("Wrong pass.. try again only " + (3 - i) + " attempt left");
            }
        }
        if (!loggedin) {
            System.out.println("Account blocked");
            return;
        }
        System.out.println("Welcome sir.. How can i help you");
        while (true) {
            System.out.println("Enter 1 for deposit");
            System.out.println("Enter 2 for withdraw");
            System.out.println("Enter 3 for check balance");
            System.out.println("Enter 4 for exit");
            int a = sc.nextInt();
            if (a == 1) {
                System.out.println("How much you wants to deposit");
                int dep = sc.nextInt();
                obj.b += dep;
                System.out.println("Balance is " + obj.b);
            } else if (a == 2) {
                System.out.println("How much you want to withdraw ?");
                int with = sc.nextInt();
                obj.b -= with;
                System.out.println("Remaining balance is " + obj.b);
            } else if (a == 3) {
                System.out.println("Balance is " + obj.b);
            } else if (a == 4) {
                System.out.println("Thankyou for banking with us..");
                break;
            } else {
                System.out.println("Invalid entry");
            }
        }
    }
}


