abstract class Pen{
    void write(){}
    void read(){}
}
class FountainPen extends Pen{
    void write(){
        System.out.println("The pen writes.");
    }
    void read(){
        System.out.println("Reading content.");
    }
    void changeNib(){
        System.out.println("Nib changed.");
    }
}
class Monkey{
    void bite(){
        System.out.println("Bite attack!");
    }
    void jump(){
        System.out.println("Jumping.");
    }
}
interface BasicAnimal{
    void eat();
    void sleep();
}
class Human extends Monkey implements BasicAnimal{
    void talk(){
        System.out.println("Speech.");
    }
    public void eat(){
        System.out.println("Eating.");
    }
    public void sleep(){
        System.out.println("Sleeping");
    }
}
public class ACI {
    public static void main(String args[]){
        FountainPen Pen1= new FountainPen();
        Pen1.changeNib();
        Pen1.read();
        Pen1.write();
        Human dude = new Human();
        dude.eat();
        dude.talk();
        dude.sleep();
        dude.jump();
        Monkey ape = new Human();
        ape.bite();
        ape.jump();
    }
}
