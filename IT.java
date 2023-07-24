import java.util.Scanner;
public class IT {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your yearly income: ");
        float income = sc.nextFloat();
        float slab;
        float tax;
        if(income>=1000000){
            slab=0.3f;
            tax = slab*income;
            System.out.printf("Your tax obligation is %f.", tax);
        }
        else if(income<1000000 && income>=500000){
            slab = 0.2f;
            tax = slab*income;
            System.out.printf("Your tax obligation is %f.", tax);
        }
        else if(income<500000 && income>=250000){
            slab = 0.05f;
            tax = slab*income;
            System.out.printf("Your tax obligation is %f.", tax);
        }
        else if(income<250000){
            System.out.println("No tax due.");
        }
        sc.close();
    }
}
