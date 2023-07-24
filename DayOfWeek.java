import java.util.Scanner;
public class DayOfWeek {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day number (1 to 7): ");
        int index = sc.nextInt();
        switch(index){
            case 1:{
                System.out.println("The day is Sunday.");
                break;
            }
            case 2:{
                System.out.println("The day is Monday.");
                break;
            }
            case 3:{
                System.out.println("The day is Tuesday.");
                break;
            }
            case 4:{
                System.out.println("The day is Wednesday.");
                break;
            }
            case 5:{
                System.out.println("The day is Thursday.");
                break;
            }
            case 6:{
                System.out.println("The day is Friday.");
                break;
            }
            case 7:{
                System.out.println("The day is Saturday.");
                break;
            }
            default:{
                System.out.println("Invalid input.");
            }        
        }
        sc.close();
    }
}
