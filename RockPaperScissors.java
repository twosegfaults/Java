import java.util.Scanner;
import java.util.Random;
public class RockPaperScissors {
    public static void main(String args[]){
        System.out.println("1= Rock \n2= Paper \n3= Scissors");
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int comp = rd.nextInt(1,4);
        System.out.println("Enter a number from 1 to 3: ");
        int player = sc.nextInt();
        if(player>3 || player <1){
            System.out.println("Invalid input.");
        }
        else{
            if((player==1 && comp==3)||(player==2 && comp==1)||(player==3 && comp==2)){
                System.out.printf("The computer chose %d. You Win!", comp);
            }
            else if(player==comp){
                System.out.printf("The computer chose %d. It's a draw!", comp);
            }
            else{
                System.out.printf("The computer chose %d. You Lose!", comp);
            }
        }
        sc.close();
    }
}
