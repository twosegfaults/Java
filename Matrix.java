import java.util.Scanner;
public class Matrix {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Make entries for first matrix: ");
        int ma[][]= new int[3][3];
        int mb[][]= new int[3][3];
        int mc[][]= new int[3][3];
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print("Enter an element: ");
                ma[i][j]=sc.nextInt();
            }
        }
        System.out.println("Make entries for second matrix: ");
        for(int a=0; a<3; a++){
            for(int b=0; b<3; b++){
                System.out.print("Enter an element: ");
                mb[a][b]=sc.nextInt();
            }
        }
        System.out.println("1 = Addition, 2 = Subtraction, 3 = Multiplication");
        System.out.println("Enter code of desired operation: ");
        int ans= sc.nextInt();
        switch(ans){
            case 1:{
                for(int x=0; x<3; x++){
                    for(int y=0; y<3; y++){
                        mc[x][y]= ma[x][y]+mb[x][y];
                    }
                }
                System.out.println("The resulting matrix is: ");
                for(int w=0; w<3; w++){
                    for(int v=0; v<3; v++){
                        System.out.printf("%d ", mc[w][v]);
                    }
                    System.out.print("\n");
                }
                break;
            }
            case 2:{
                for(int x=0; x<3; x++){
                    for(int y=0; y<3; y++){
                        mc[x][y]= ma[x][y]-mb[x][y];
                    }
                }
                System.out.println("The resulting matrix is: ");
                for(int w=0; w<3; w++){
                    for(int v=0; v<3; v++){
                        System.out.printf("%d ", mc[w][v]);
                    }
                    System.out.print("\n");
                }
                break;
            }
            case 3:{
                for(int l=0; l<3; l++){
                    int m=0;
                    for(int p=0; p<3; p++){
                        int rsum=0,prod;
                        for(int q=0; q<3; q++){
                            prod=ma[p][q]*mb[q][p];
                            rsum+=prod;
                        }
                        mc[l][m]=rsum;
                        m++;
                    }
                }
                System.out.println("The resulting matrix is: ");
                for(int w=0; w<3; w++){
                    for(int v=0; v<3; v++){
                        System.out.printf("%d ", mc[w][v]);
                    }
                    System.out.print("\n");
                }
                break;
            }
            default:{
                System.out.println("Invalid input.");
                break;
            }
        }
        sc.close();
    }
}
