import java.lang.*;  
  
public class ThreadPriorityExample1 extends Thread   
{  

// Whenever the start() method is called by a thread  
// the run() method is invoked  
  public void run()  
   {   
    System.out.println("Inside the run() method");  
  }  
}

class MultiThreadingExample4{
  
// the main method  
 public static void main(String argvs[])  
 {  
  
 Thread.currentThread().setPriority(7);  
  
 System.out.println("Priority of the main thread is : " + Thread.currentThread().getPriority());  
  
 ThreadPriorityExample1 th1 = new ThreadPriorityExample1();    

 System.out.println("Priority of the thread th1 is : " + th1.getPriority());  
  
   }  

   }  