import java.io.*;
class ExceptionMaker extends Exception{
    public ExceptionMaker(String message){
        super(message);
    }
}
class Problematic{
    public static void findFile() throws IOException{
        File newFile =new File("test");
        FileInputStream stream = new FileInputStream(newFile);
    }
    public static void noFile() throws IOException{
        throw new IOException("its literally called no file/ why called this method??");
    }
    public static void something() throws ExceptionMaker{
        ExceptionMaker eo = new ExceptionMaker("sigh");
        throw eo;
    } 
}
public class lab_8{
    public static void main(String args[]){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String ans= "default";
        System.out.println("new input method lesgo");
        try {
            ans = br.readLine();
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(ans);
        for(int i=0; i<5; i++){
            try{
                int j =0;
                String serror = null;
                int oof = 70/j;
                System.out.println(serror.length());
            }
            catch(ArithmeticException e){
                System.out.println("Why u divide by zero?");
            }
            catch(NullPointerException e1){
                System.out.println("404 lol");
            }
            finally{
                System.out.println("This is a finally block");
            }
        }
        try{
            Problematic.findFile();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        try {
            Problematic.noFile();
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
        try{
            Problematic.something();
        }
        catch(ExceptionMaker e){
            System.out.println(e.getMessage());
        }
    }
}
