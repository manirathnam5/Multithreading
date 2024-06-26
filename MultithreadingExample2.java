class  AccountThread implements Runnable{


    public void run(){

        System.out.println("Bank Account running the thread ") ;
    }
}

class MultithreadingExample1{


    public static void main(String[] arg) {
   
        AccountThread  act = new AccountThread();

        Thread t1 = new Thread(act) ;


        t1.start();

        AccountThread  act2 = new AccountThread();

        Thread t2 = new Thread(act2) ;


        t2.start();

    

    }
}