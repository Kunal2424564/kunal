import java.util.Scanner;
public class login {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your user id");
        String a = sc.nextLine();
        System.out.println("Enter the password");
        String b = "kunal#1234";
        for (int i = 0; i < 3; i++) {
            String c = sc.nextLine();
            if (c.equals(b)) {
                System.out.println("Welcome...");
                break;
            } else {
                System.out.println("Wrong password");
                System.out.println("Try again.. Only " + (3 - (i + 1)) + " attempt left");
            }
            if (i == 2) {
                System.out.println("Account Locked!");
            }
        }
    }
}