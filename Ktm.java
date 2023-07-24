import java.util.Scanner;
public class Ktm{
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        System.out.print("Enter the kilometer value: ");
        float mi=s.nextFloat();
        float cf=0.621371f;
        System.out.print(String.format("The corresponding number of miles is: %f.", mi*cf));
        s.close();
    }
}
