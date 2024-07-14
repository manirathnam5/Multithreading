
class MyThread extends Thread{
    public void run(){

        for(int i = 0 ; i< 10 ;i++){
       try{
             Thread.sleep(1000);
            } catch(InterruptedException ie){
                System.out.println(ie);
            }

            System.out.println(i +"   "+ Thread.currentThread().getName() + " Thread running " );
        }
    }
}


class MultithreadingExample3{


    public static void main(String[] arg){

       MyThread  t1 = new MyThread();
       t1.setName("First Thread ");
       t1.start();

       MyThread  t2 = new MyThread();
       t1.setName("Second Thread ");
       t2.start();
       

    }
}