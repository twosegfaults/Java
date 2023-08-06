import java.util.Scanner;
class Manager{
    Scanner sc = new Scanner(System.in);
    private int maxsize =100;
    String availableBooks[]= new String[maxsize];
    int BookQuantities[]= new int[maxsize];
    private int index=0;
    String issuedBooks[]= new String[maxsize];
    int IssueQuantities[]= new int[maxsize];
    void addBooks(){
        System.out.println("Enter the number of books to be added: ");
        int num = sc.nextInt();
        sc.nextLine();
        for(int i=0; i<num; i++){
            System.out.println("Enter the name of the book: ");
            availableBooks[index]= sc.nextLine();
            issuedBooks[index]= availableBooks[index];
            IssueQuantities[i]=0;
            System.out.println("Enter the number of books added:");
            BookQuantities[index]= sc.nextInt();
            sc.nextLine();
            index++;
        }
        for(int j=index+1;j<maxsize;j++){
            availableBooks[j]= "book not available";
            issuedBooks[j]=availableBooks[j];
            IssueQuantities[j]=0;
        }

    }
    void showAvailableBooks(){
        System.out.println("The books available are: ");
        for(int i=0; i<index; i++){
            System.out.printf("%s, number available= %d.\n", availableBooks[i], BookQuantities[i]);
        }
    }
    void issueBook(){
        System.out.println("Enter the name of the book you want to issue: ");
        String book= sc.nextLine();
        int token=0;
        for(int i=0; i<index; i++){
            if(book.equals(availableBooks[i])){
                if(BookQuantities[i]>0){
                    BookQuantities[i]-=1;
                    IssueQuantities[i]+=1;
                    token+=1;
                    System.out.println("Book issued!");
                }
                else{
                    System.out.println("All books currently issued.");
                    token+=1;
                }
            }
        }
        if(token==0){
            System.out.println("Book not found.");
        }
    }
    void returnBook(){
        System.out.println("Enter the name of the book to be returned: ");
        String book= sc.nextLine();
        int token =0;
        for(int i=0; i<index; i++){
            if(book.equals(availableBooks[i])){
                BookQuantities[i]+=1;
                IssueQuantities[i]-=1;
                token+=1;
                System.out.println("Book successfully returned.");
            }
        }
        if(token==0){
            System.out.println("Book not found.");
        }
    }
}
public class Library {
    public static void main(String args[]){
        Manager LibMan = new Manager();
        Scanner s = new Scanner(System.in);
        System.out.println("0-Exit.\n1-See available books.\n2-Issue a book.\n3-Return a book.\n4-Add books.");
        System.out.println("What would you like to do?");
        int ans =s.nextInt();
        while(ans!=0){    
            switch(ans){
                case 1:{
                    LibMan.showAvailableBooks();
                    System.out.println("What would you like to do next? ");
                    ans= s.nextInt();
                    break;
                }
                case 2:{
                    LibMan.issueBook();
                    System.out.println("What would you like to do next? ");
                    ans= s.nextInt();
                    break;
                }
                case 3:{
                    LibMan.returnBook();
                    System.out.println("What would you like to do next? ");
                    ans= s.nextInt();
                    break;
                }
                case 4:{
                    LibMan.addBooks();
                    System.out.println("What would you like to do next? ");
                    ans= s.nextInt();
                    break;
                }
            }
        }
        System.out.println("Thank you.");
        s.close();
    }   
}
