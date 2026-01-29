
import java.util.Random;
import java.util.Scanner;
public class rockpapergame {
    public static void main(String[]args){
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 0 for - Rock");
        System.out.println("Enter 1 for - Scissors");
        System.out.println("Enter 2 for - Paper");
        int a = sc.nextInt();
        int b =r.nextInt(3);
        if(a==0&&b==1){
            System.out.println("You Win");
        }else if(a==1&&b==2){
            System.out.println("You win");
        }else if(a==2&&b==0){
            System.out.println("You win");
        }else if(b==0&&a==1){
            System.out.println("You loss");
        }else if(b==1&&a==2){
            System.out.println("You loss");
        }else if(b==2&&a==0){
            System.out.println("You loss");
        }else if(a==b){
            System.out.println("Draw");
        }else{
            System.out.println("Invalid entry");
        }
        System.out.println("Random number taken by computer is "+b);
    }
}
