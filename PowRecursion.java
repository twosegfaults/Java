import java.util.Scanner;
public class PowRecursion {
    static long exp(int a, int b){
        if(a!=0){
            if(b>0){
                return a*exp(a, b-1);
            }
            else return 1;
        }
        else return 0;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number whose exponent you want: ");
        int n = sc.nextInt();
        System.out.print("Enter the power: ");
        int x = sc.nextInt();
        long ans= exp(n,x);
        System.out.printf("The value of %d raised to the power %d is %d.", n, x, ans);
        sc.close();
    }
}
