import java.util.Scanner;
import java.util.Random;
class Game{
    int synumber;
    int unumber;
    int guesses;
    Scanner sc = new Scanner(System.in);
    public Game(){
        Random rd= new Random();
        synumber= rd.nextInt(1,100);
        unumber=0;
        guesses=1;
    }
    void takeUserInput(){
        System.out.print("enter your guess (1 to 100): ");
        unumber= sc.nextInt();
    }
    public int getGuesses() {
        return guesses;
    }
    void check(){
        if(unumber==synumber){
            System.out.printf("The number of guesses required was %d.", getGuesses());
            sc.close();
        }
        else{
            guesses+=1;
            if(unumber>synumber){
                System.out.println("Reduce your guess.");
            }
            else{
                System.out.println("Increase your guess.");
            }
        }

    }
}
public class Guess {
    public static void main(String args[]){
            Game gtn = new Game();
            gtn.takeUserInput();
            gtn.check();
            while(gtn.synumber!=gtn.unumber){
                gtn.takeUserInput();
                gtn.check();
            }
            System.out.println("Thanks for playing.");
    }
}
