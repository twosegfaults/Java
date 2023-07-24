import java.util.Scanner;
public class SM {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s1 = sc.nextLine();
        s1= s1.toLowerCase();
        System.out.println(s1);
        System.out.print("enter your name: ");
        String s2 = sc.next();
        System.out.printf("Dear %s, thanks a lot.", s2);
        System.out.println("Enter a string with a double and a triple space: ");
        String s3= sc.nextLine();
        System.out.printf("The index of double space is %d.", s3.indexOf("  ", 0));
        System.out.printf("The index of triple space is %d.", s3.indexOf("   ", 0));
        sc.close();
    }
}
