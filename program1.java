class program1{
    public static void main(String[] arg) throws  InterruptedException{
        A t = new A();
        t.start();
        for(int i = 0;i<=5;i++){
            System.out.println("Shubham");
            Thread.sleep(2000);
        }
    }
}
class A extends Thread{
    public void run(){
        try{
            for(int i = 0;i<=5;i++){
            System.out.println("Vaibhav");
            Thread.sleep(2000);
        }
        }
        catch(InterruptedException j){

        }
    }
}

