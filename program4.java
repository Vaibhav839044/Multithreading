import java.util.*;
class program4{
    public static void main(String[] arg){
        A t1 = new A();
        A t2 = new A();
        A t3 = new A();

        t1.setName("thread 1");
        t2.setName("thread 2");
        t3.setName("thread 3");
        t2.start();
        try{
            t2.join();
        }
        catch(InterruptedException i){

        }
        t1.start();
        t3.start();
}
}

class A extends Thread{
    public void run(){
        try{
            String n = Thread.currentThread().getName();
        for(int i= 1;i<=3;i++){
            System.out.println(n);
            Thread.sleep(2000);
        }
        }
        catch(InterruptedException i){
            
        }
    }
}