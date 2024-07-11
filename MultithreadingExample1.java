class MyThread extends Thread{

    public void run(){
        System.out.println(" I am running thread") ;
    }
}

class MyThread1 extends Thread{
    public void run(){
        System.out.println(" I am running thread 2") ;
    }
}


class MyThread2 extends Thread{

    public void run(){
        System.out.println(" I am running thread 3") ;
    }
}


class MultithreadingExample1{


    public static void main(String[] arg) {

        MyThread  t1  = new MyThread();
        t1.start();

        MyThread1  t2 = new MyThread1();
        t2.start();


        MyThread2  t3 = new MyThread2();
        t3.start();

    }

}