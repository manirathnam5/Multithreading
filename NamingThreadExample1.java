class TestMultiNaming1 extends Thread{  

    public void run() {  
         System.out.println("running...");  
        }  
      }
 

class NamingThreadExample1{

 public static void main(String args[]){  
  
  TestMultiNaming1 t1 = new TestMultiNaming1();  
  TestMultiNaming1 t2 = new TestMultiNaming1();  

  System.out.println("Name of t1:"+t1.getName());  
  System.out.println("Name of t2:"+t2.getName());  
   
  t1.start();  
  t2.start();  
  
  t1.setName("Sonoo Jaiswal");  
  t2.setName("Mickie Mouse");

  System.out.println("After changing name of t1:"+t1.getName());  
  System.out.println("After changing name of thread t2 : " + t2.getName());

     }  
  
   }  