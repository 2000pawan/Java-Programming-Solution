/*
MultiThreading:- 
1.  It is a technique where multiple threads are created and executed concurrently.
2.  It is used to improve the performance of a program by executing multiple tasks simultaneously.
3.  It is useful when a program needs to perform multiple tasks that are independent of each other
4.  It is used in operating systems, web servers, and other applications where multiple tasks need
to be executed concurrently.
Same as Thread is sub part of multithreading. thread are use in this
 */
class Multithreading extends Thread{
    public void run(){
        System.out.println("Thread running:- "+Thread.currentThread().getName());
        try {
            Thread.sleep(60000); // Sleep for 1 minute
            System.out.println("Thread resumed: " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + Thread.currentThread().getName());
        }
    }
    public static void main(String[] args) {
        Multithreading t1=new Multithreading();
        Multithreading t2=new Multithreading();
        t1.start();
        t2.start();
    }
}