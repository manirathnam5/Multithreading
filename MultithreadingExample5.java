	class TestDaemonThread extends Thread{
		

	 public void run(){

	    
	     if(Thread.currentThread().isDaemon()){

	     System.out.println(" This thread Daemon thread ");
	       }
	     else {

	       System.out.println(" This is normal thread ") ;
	     }

	 }


	}



	class MultithreadingExample5{
		


	  public static void main(String[] arg) {

	     TestDaemonThread  td1 = new TestDaemonThread();
	     td1.setDaemon(true);
	     td1.start();

	    
	    TestDaemonThread  td2 = new TestDaemonThread();
	    td2.start();
        
	    TestDaemonThread  td3 = new TestDaemonThread();
	    td3.start();

 

	  }

	}