class ThreadTest extends Thread
{
      private Thread thread;
      private String threadName;

      ThreadTest( String msg)
      {
             threadName = msg;
             System.out.println("Creating thread: " +  threadName );
      }
      public void run()
      {
             System.out.println("Running thread: " +  threadName );
             try
             {
                   for(int i = 0; i < 5; i++)
                   {
                         System.out.println("Thread: " + threadName + ", " + i);
                         Thread.sleep(50);
                   }
             }
             catch (InterruptedException e)
             {
                   System.out.println("Exception in thread: " +  threadName);
             }
             System.out.println("Thread " +  threadName + " continue...");
      }   
      public void start ()
      {
            System.out.println("Start method " +  threadName );
            if (thread == null)
            {
                  thread = new Thread (this, threadName);
                  thread.start ();
            }
      }
}
public class Multi2
{
      public static void main(String args[])
      {
            ThreadTest thread1 = new ThreadTest( "First Thread");
            ThreadTest thread2 = new ThreadTest( "Second Thread");
            ThreadTest thread3 = new ThreadTest( "Second Thread");
            thread2.setPriority(Thread.MIN_PRIORITY);
            thread1.start();
            thread2.start();
            thread3.start();
      }   
}