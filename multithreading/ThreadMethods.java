package sarbajit.multithreading;

/*class MyRun implements Runnable
{
    public void run()
    {

    }
}*/

class MyThreadMethods extends Thread {
    public MyThreadMethods(String name) {
        super(name);
        //setPriority(Thread.MAX_PRIORITY);
        //setPriority(Thread.MIN_PRIORITY+2);
    }

    public void run() {
        int count=1;
        while(true) {
            System.out.println(count++);
            try {
                Thread.sleep(1000);
            }
            catch(InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class ThreadMethods {

    public static void main(String[] args) {
        //Thread t=new Thread(new MyRun(),"My Name");
        MyThreadMethods t=new MyThreadMethods("My Thread 1");
        t.start();
        t.interrupt();
        /*System.out.println("ID "+t.getId());
        System.out.println("Name "+t.getName());
        System.out.println("Priority "+t.getPriority());
        t.start();
        System.out.println("State "+t.getState());
        System.out.println("Alive "+t.isAlive());*/
    }
}