import java.util.Scanner;
public class Salary_Slip {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter basic salary");
        int salary = sc.nextInt();
        if(salary >= 20000){
            float HRA = 0.20f*salary;
            float DA = 0.10f*salary;
            float w = HRA+DA;
            float q = salary+w;
            System.out.println("Basic salary- "+salary+"rs");
            System.out.println("HRA - "+HRA+"rs");
            System.out.println("DA - "+DA+"rs");
            System.out.println("Net salary - "+q+"rs");
        }else if(salary < 20000){
            float HRA = 0.10f*salary;
            float DA = 0.05f*salary;
            float w = HRA+DA;
            float q = salary+w;
            System.out.println("Basic salary- "+salary+"rs");
            System.out.println("HRA - "+HRA+"rs");
            System.out.println("DA - "+DA+"rs");
            System.out.println("Net salary - "+q+"rs");
        }else{
            System.out.println("Invalid entry");
        }
    }
}
