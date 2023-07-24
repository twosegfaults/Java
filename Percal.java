import java.util.Scanner;
public class Percal{
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        System.out.print("Enter the first score: ");
        int x=s.nextInt();
        System.out.print("Enter the second score: ");
        int y=s.nextInt();
        System.out.print("Enter the third score: ");
        int z=s.nextInt();
        float perc=((x+y+z)/3f);
        System.out.print("The overall percentage obtained is: ");
        System.out.println(perc);
        s.close();
    }
}