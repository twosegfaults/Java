import java.util.Scanner;
public class Sum{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the first number: ");
        int x = sc.nextInt();
        System.out.print("Enter the value of the second number: ");
        int y = sc.nextInt();
        System.out.print("The value of their sum is: ");
        System.out.println(x+y);
        sc.close();
    }
}
