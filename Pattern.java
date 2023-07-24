import java.util.Scanner;
public class Pattern {
    public static void main(String args[]){    
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows you want in the pattern: ");
        int n = sc.nextInt();
        for(int i=n;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        sc.close();
    }
}
