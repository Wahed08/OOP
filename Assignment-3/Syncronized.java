
package OOP;

class counter{
    int count;
    public synchronized void increment(){
        count++;
    }
}

public class Syncronized {
    
    public static void main(String[] args) throws InterruptedException
    { 
        counter ob=new counter();
        Thread t1=new Thread(new Runnable(){
            @Override
            public void run(){
                for(int i=0; i<100; i++){
                    ob.increment();
                }
            }
        });
   
        Thread t2=new Thread(new Runnable(){
            @Override
            public void run(){
                for(int i=0; i<100; i++){
                    ob.increment();
                }
            }
        });
     
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("the count is: "+ob.count);
    }
}
