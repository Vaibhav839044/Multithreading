import java.util.*;
class program2{
    public static void main(String[] arg) throws InterruptedException {
        A a = new A();
        Thread t = new Thread(a);
        t.start();
        for(int i = 0;i<5;i++){
            System.out.println("Shubham");
            Thread.sleep(2000);
        }

    }
}

class A implements Runnable {
    public void run(){
        try{
            for(int i =0;i<5;i++){
            System.out.println("Vaibhav");
            Thread.sleep(2000);
        }
        
        }
        catch(InterruptedException i){
            
        }
    }

}