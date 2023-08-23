import java.util.Scanner;
class CustomEx extends Exception{
    public CustomEx(String str){
        super(str);
    }    
}
class Calc{
    double addition(double x, double y)throws CustomEx{
        if(x>100000 || y>100000){
            throw new CustomEx("Maximum input limit exceeded!");
        }
        double ans = x+y;
        return ans;
    }
    double subtraction(double x, double y)throws CustomEx{
        if(x>100000 || y>100000){
            throw new CustomEx("Maximum input limit exceeded!");
        }
        double ans= x-y;
        return ans;
    }
    double multiply(double x, double y) throws CustomEx{
        if(x>7000 || y>7000){
            throw new CustomEx("Maximum input limit exceeded!");
        }
        double ans = x*y;
        return ans;
    }
    double divide(double x, double y) throws CustomEx{
        if(x>100000 || y>100000){
            throw new CustomEx("Maximum input limit exceeded!");
        }
        if(y==0){
            throw new CustomEx("Division by zero is invalid!");
        }
        double ans = x/y;
        return ans;
    }
}
public class CustomCalc{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Calc c = new Calc();
        Boolean flag= true;
        String op;
        double anstemp=0;
        int choice;
        double x,y,z;
        while(flag==true){
            System.out.println("What would you like to do?");
            op= sc.nextLine();
            if(op.equals("addition")){
                try{
                    if(anstemp==0){
                        System.out.print("Enter the first number: ");
                        x= sc.nextDouble();
                        System.out.print("Enter the second number: ");
                        y= sc.nextDouble();
                        anstemp= c.addition(x, y);
                        System.out.println("The sum is "+ anstemp);
                    }
                    else{
                        System.out.println("Enter the number to be added: ");
                        z= sc.nextDouble();
                        anstemp= c.addition(anstemp, z);
                        System.out.println("The sum is "+ anstemp);
                    }
                }
                catch(CustomEx e){
                    System.out.println(e.getMessage());
                }
            }
            else if(op.equals("subtraction")){
                try{
                    if(anstemp==0){
                        System.out.print("Enter the first number: ");
                        x= sc.nextDouble();
                        System.out.print("Enter the second number: ");
                        y= sc.nextDouble();
                        anstemp= c.subtraction(x, y);
                        System.out.println("The difference is "+ anstemp);
                    }
                    else{
                        System.out.println("Enter the number to be subtracted: ");
                        z= sc.nextDouble();
                        anstemp= c.subtraction(anstemp, z);
                        System.out.println("The sum is "+ anstemp);
                    }
                }
                catch(CustomEx e){
                    System.out.println(e.getMessage());
                }
            }
            else if(op.equals("multiplication")){
                try{
                    if(anstemp==0){
                        System.out.print("Enter the first number: ");
                        x= sc.nextDouble();
                        System.out.print("Enter the second number: ");
                        y= sc.nextDouble();
                        anstemp= c.multiply(x, y);
                        System.out.println("The product is "+ anstemp);
                    }
                    else{
                        System.out.println("Enter the number to be multiplied: ");
                        z= sc.nextDouble();
                        anstemp= c.multiply(anstemp, z);
                        System.out.println("The product is "+ anstemp);
                    }
                }
                catch(CustomEx e){
                    System.out.println(e.getMessage());
                }
            }
            else if(op.equals("division")){
                try{
                    if(anstemp==0){
                        System.out.print("Enter the dividend: ");
                        x= sc.nextDouble();
                        System.out.print("Enter the divisor: ");
                        y= sc.nextDouble();
                        anstemp= c.divide(x, y);
                        System.out.println("The quotient is "+ anstemp);
                    }
                    else{
                        System.out.println("Enter the divisor: ");
                        z= sc.nextDouble();
                        anstemp= c.divide(anstemp, z);
                        System.out.println("The quotient is "+ anstemp);
                    }
                }
                catch(CustomEx e){
                    System.out.println(e.getMessage());
                }
            }
            else{
                System.out.println("Invalid operation.");
            }
            System.out.println("Continue? 0/1/2");
            choice= sc.nextInt();
            sc.nextLine();
            if(choice==0){
                flag = false;
            }
            else if(choice==2){
                anstemp=0;
            } 
        }
        sc.close();
    }
}