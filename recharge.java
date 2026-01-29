import java.util.Scanner;
public class recharge {
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        System.out.println("Enter the amount of which you wants to recharge");
        int b = a.nextInt();
        if(b<100){
            System.out.println("Original amount- "+b);
            System.out.println("Discout - NO Discout");
            System.out.println("Final payable amount - "+b);
        }else if(b>=100&&b<=299){
            float d = b*0.05f;
            float c = b-d;
            System.out.println("Original amount- "+b);
            System.out.println("Discout - 5% = "+d+"rs");
            System.out.println("Final payable amount - "+c+"rs");
        }else if(b>= 300){
            float d = b*0.10f;
            float c = b-d;
            System.out.println("Original amount- "+b);
            System.out.println("Discout - 10% = "+d+"rs");
            System.out.println("Final payable amount - "+c+"rs");
        }else{
            System.out.println("Invalid entry..");
        }
    }
}
