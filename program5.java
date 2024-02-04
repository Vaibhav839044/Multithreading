//sychronization demo

class program5{
    public static void main(String[] arg){
        Bus r = new Bus(1);
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        Thread t3 = new Thread(r);

        t1.setName("Vaibhav");
        t2.setName("Shyam");
        t3.setName("Ram");
        t1.start();
        t2.start();
        t3.start();
    }
}

class Bus implements Runnable{
    int avaliable = 2,passenger;
    Bus(int passenger){
        this.passenger = passenger;
    }
    public synchronized void run(){
        String n = Thread.currentThread().getName();
        if(avaliable >= passenger){
            System.out.println(n+"reserved seat!");
            avaliable = avaliable - passenger;
        }
        else
        {
            System.out.println("Seat not available");
        }   
    }   
}