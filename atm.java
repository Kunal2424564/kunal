import java.util.Scanner;
public class atm {
    int n = 0;
    public static void main(String[] args) {
        atm obj = new atm();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for Withdraw");
        System.out.println("Enter 2 for Deposit");
        System.out.println("Enter 3 for Check balanc2e ");
        System.out.println("Enter 4 for exit");


        while (true) {
            int a = sc.nextInt();
            if (a == 1) {
                System.out.println("How much you want to withdraw");
                int mon = sc.nextInt();
                obj.n -= mon;
                System.out.println("Amount left " + obj.n);
            } else if (a == 2) {
                System.out.println("How much you want to Deposit");
                int dep = sc.nextInt();
                obj.n += dep;
                System.out.println("Amount = " + obj.n);
            } else if (a == 3) {
                System.out.println("Your balance is " + obj.n);
            }else if(a==4){
                System.out.println("Thank you for visiting ");
                break;
            }else{
                System.out.println("Invalid entry");
            }
        }
    }
}
