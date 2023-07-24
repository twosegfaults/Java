import java.util.Scanner;
public class POF {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the marks in the first subject: ");
        int m1= sc.nextInt();
        System.out.println("enter the second marks: ");
        int m2 = sc.nextInt();
        System.out.println("Enter the third marks: ");
        int m3 = sc.nextInt();
        float tp= ((m1+m2+m3)/3);
        if(tp>=40 && m1>33 && m2> 33 && m3> 33){
            System.out.println("Passed.");
        }
        else{
            System.out.println("Failed.");
        }
        sc.close();
    }
}
