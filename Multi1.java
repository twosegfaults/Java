class Threader implements Runnable
{
      String message;
      Threader(String msg)
      {
            message = msg;
      }
      public void run()
      {
            for(int count=0;count<=5;count++)
            {
                  try
                  {
                        System.out.println("Run method: " + message);
                        Thread.sleep(100);
                  }
                  catch (InterruptedException ie)
                  {
                        System.out.println("Exception in thread: "+ie.getMessage());
                  }
            }
      }
}
public class Multi1 {
    public static void main(String[] args)
      {
             Threader obj1 = new Threader("MyThread obj1");
             Threader obj2 = new Threader("MyThread obj2");
             Thread t1 = new Thread(obj1);
             Thread t2 = new Thread(obj2);
             t1.start();
             t2.start();
      }
}
