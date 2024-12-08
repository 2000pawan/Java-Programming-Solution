/*
Exception Handling:-
Exception Handling in Java is a mechanism to handle runtime errors or exceptions gracefully. 
It allows us to handle runtime errors in a more controlled way, preventing the program from crashing.
There are two types of exceptions in Java: checked and unchecked exceptions.
Checked exceptions are those that are checked at compile time, 
while unchecked exceptions are not checked at compile time
It is done using try, catch, finally, throw, and throws keywords.
 */



public class ExceptionHandling{
    public static void main(String[] args) {
        try {
            int x=5/0;
            System.out.println("This Won't be printed.");
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception Occurred:-  " +e);
        }finally{
            System.out.println("Finally block executed.");
        }
        System.out.println("Program Continues...");
    }
}
