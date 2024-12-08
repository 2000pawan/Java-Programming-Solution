/*
Object_Oriented in Java:-  
Object-Oriented Programming (OOP) in Java is a programming paradigm that relies on the concept of objects. 
It allows developers to model real-world entities and their interactions within the program. 
Java is a fully object-oriented language, as it strongly supports the OOP concepts.

Key Concepts of OOP in Java:-
1. Class:- A class is a blueprint or a template that defines the properties and behavior of an object.
2. Object:- An object is an instance of a class and has its own set of attributes.
3. Method:- A method is a block of code that performs a specific action. It is associated with a class or an object. 
It is also known as a function.
 */

 class Fibonacci{
    void printfibonacci(int n){
        int t1=0, t2=1;
        int count=0;
        while(count<n){
            System.out.print(t1+" ");
            int sum=t1+t2;
            t1=t2;
            t2=sum;
            count++;
        }
    }
 }
 public class oopsbasic{
    public static void main(String [] args){
        Fibonacci f=new Fibonacci();
        f.printfibonacci(10);
    } 
 }