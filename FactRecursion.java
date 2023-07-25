import java.util.Scanner;
public class FactRecursion {
    static long factorial(int n){
        if(n>1){
            return n*factorial(n-1);
        }
        else return 1;
    } 
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number whose factorial is desired: ");
        int n = sc.nextInt();
        long ans= factorial(n);
        System.out.printf("The factorial of %d is %d.", n, ans);
        sc.close();
    }
}
