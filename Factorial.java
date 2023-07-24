import java.util.Scanner;
public class Factorial {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number whose factorial is desired: ");
        int n = sc.nextInt();
        long fact=1;
        if(n>=1){
            for(int i=1; i<=n; i++){
                fact=(i*fact);
            }
            System.out.printf("The value of %d factorial is %d.", n, fact);
        }
        else if(n==0){
            System.out.println("The value of 0 factorial is 1.");
        }
        else{
            System.out.println("Factorial not defined for given input.");
        }
        sc.close();
    }
}
