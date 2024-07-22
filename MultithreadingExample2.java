class  AccountThread implements Runnable{

    public void run(){
        System.out.println("Bank Account running the thread ") ;
    }
}

class SavingsAccount extends Thread{
    public void run(){
        System.out.println("Savings account thread ") ;
    }
}

class FixedAccount extends Thread{

    public void run(){
        System.out.println(" Fixed account thread ") ;
    }
}


class MultithreadingExample2{

    public static void main(String[] arg) {
   
        AccountThread  act = new AccountThread();

        Thread t1 = new Thread(act) ;

        t1.start();

        AccountThread  act2 = new AccountThread();

        Thread t2 = new Thread(act2) ;
        t2.start();

         SavingsAccount sa = new SavingsAccount();
         sa.start();
         
         FixedAccount fa = new FixedAccount();
         fa.start();

         
    }
}