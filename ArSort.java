import java.util.Scanner;
public class ArSort {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int arr[]= new int[size];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<size; i++){
            System.out.print("Enter an element: ");
            arr[i]= sc.nextInt();
        }
        for(int j=0; j<size-1; j++){
            int temp;
            for(int k=j+1; k<size; k++){
                if(arr[k]<arr[j]){
                    temp=arr[k];
                    arr[k]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int g :arr){
            System.out.print(g);
        }
        sc.close();
    }
}