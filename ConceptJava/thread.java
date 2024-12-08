

/*
Thread:-A thread in Java is a lightweight subprocess that allows a program to perform multiple tasks concurrently. 
The Java Thread class and the Runnable interface are used to create and manage threads. 
The main thread is the first thread that starts when a Java program begins.
Multithreading:- 
Multithreading allows multiple threads to run concurrently.
Each thread operates independently but shares the same memory space.

Thread Lifecycle A thread in Java goes through the following states:
New: Created but not started.
Runnable: Ready to run; waiting for CPU time.
Running: Actively executing.
Blocked/Waiting: Waiting for a resource or condition.
Terminated: Completed execution.
Method use in Thread:-
1. start(): Starts the thread.
2. run(): The method that is called when the thread is started.
3. join(): Waits for the thread to finish.
4. sleep(): Causes the thread to sleep for a specified amount of time.
5. join(): Waits for the thread to finish.
6. isAlive(): Checks if the thread is alive.
7. getName(): Returns the name of the thread.
8. setName():- Sets the name of the thread.
9. yield():- Causes the currently executing thread object to yield the CPU.
10. interrupt():- Interrupts the thread.
11. isInterrupted():- Checks if the thread has been interrupted.
12. setPriority():- Sets the priority of the thread.
13. getPriority():- Returns the priority of the thread.
14. currentThread():- Returns the currently executing thread.
15. enumerate():- Returns an array of all the threads in the current thread's thread group.
16. setDaemon(boolean):- Sets the thread as a daemon thread.
17. isDaemon():- Checks if the thread is a daemon thread.
18.notify():- Wakes up all threads that are waiting on the current thread.
19.notifyAll():- Wakes up all threads that are waiting on the current thread.
20. wait():- Causes the current thread to wait until it is woken up by a call to notify
 */
class MyThread extends Thread {
    public MyThread(String name) {
        setName(name); // Set thread name
    }

    public void run() {
        System.out.println(getName() + " is running with priority " + getPriority());
        try {
            Thread.sleep(500); // Sleep for 500ms
            System.out.println(getName() + " woke up.");
        } catch (InterruptedException e) {
            System.out.println(getName() + " was interrupted.");
        }
    }
}

class Notify {
    final Object lock = new Object(); // Shared lock for synchronization

    Thread t1 = new Thread(() -> {
        synchronized (lock) {
            try {
                System.out.println("Thread t1 is waiting...");
                lock.wait(); // Wait for notification
                System.out.println("Thread t1 received notification!");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    });

    Thread t2 = new Thread(() -> {
        synchronized (lock) {
            System.out.println("Thread t2 is sending notification...");
            lock.notify(); // Notify waiting thread
        }
    });
}

public class thread{
    public static void main(String[] args) {
        try {
            MyThread t1 = new MyThread("Thread-1");
            MyThread t2 = new MyThread("Thread-2");
            t1.setPriority(Thread.MAX_PRIORITY); // Set high priority
            t2.setPriority(Thread.MIN_PRIORITY); // Set low priority

            System.out.println("Current Thread: " + Thread.currentThread().getName()); // Current thread

            t1.start(); // Start thread t1
            t2.start(); // Start thread t2

            System.out.println(t1.getName() + " is alive? " + t1.isAlive()); // Check if alive
            t1.join(); // Wait for t1 to finish
            t2.join(); // Wait for t2 to finish

            // Notify example
            Notify notifyExample = new Notify();
            notifyExample.t1.start(); // Start waiting thread
            Thread.sleep(1000); // Delay to ensure t1 starts waiting
            notifyExample.t2.start(); // Start notifying thread

            System.out.println("All threads finished execution.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
