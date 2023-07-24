import java.util.Scanner;
public class DigitReverser{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be reversed: ");
        int num = sc.nextInt();
        int t1= num;
        int dig = 0;
        if(num==0){
            System.out.println("The reversed number is 0.");
        }
        else if(num>=0){
            while(t1>0){
                t1= t1/10;
                dig++;
            }
            int digArr[];
            digArr = new int[dig];
            int t2 = num;
            int rem, i=0;
            while(t2>0){
                rem=t2%10;
                t2=t2/10;
                digArr[i]=rem;
                i++;
            }
            System.out.println("The reversed number is: ");
            for(int j=0;j<dig;j++){
                System.out.print(digArr[j]);
            }
        }
        sc.close();
    }
}
