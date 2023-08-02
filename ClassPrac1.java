import java.util.Scanner;
class Employee{
    int salary;
    String name;
    int getSalary(){
        return salary;
    }
    String getName(){
        return name;
    }
    void setNameAndSalary(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the employee name: ");
        name= s.nextLine();
        System.out.print("Enter the employee salary: ");
        salary= s.nextInt();
        s.close();
    }
    public Employee(){
        salary=0;
        name=" ";
    }
    public Employee(int sal, String na){
        salary=sal;
        name=na;
    }
}
public class ClassPrac1 {
    public static void main(String args[]){
        Employee E1 = new Employee();
        E1.name= "Ajay";
        E1.salary= 50000;
        Employee E2 = new Employee();
        E2.name= "Sam";
        E2.salary= 100000;
        Employee E3= new Employee();
        E3.setNameAndSalary();
        System.out.println(E3.getSalary());
        System.out.println(E1.getName());
    }
}
