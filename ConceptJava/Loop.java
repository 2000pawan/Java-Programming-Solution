/*
Loops are used to execute a block of code repeatedly based on a condition. 
Java provides three main types of loops: for, while, and do-while.
For Loop:-
The for loop is used when the number of iterations is known beforehand. 
It consists of three parts: initialization, condition, and increment/decrement.

While Loop:-
The while loop is used when the condition is evaluated before the loop body executes. 
It is best when the number of iterations is not known in advance.

Do-While Loop:-
The do-while loop is similar to the while loop, but the condition is evaluated after the loop.
 */

 public class Loop{
    public static void main(String[] args) {
        // For Loop
        int x=5,i,j=1;
        System.out.println("Counting from 1 to 5:- ");
        for (i=1;i<x;i++){
            System.out.println(i);
        }
        System.out.println("Loop completed");
        // While Loop
        System.out.println("Counting from 1 to 5:- ");
        while (j<x){
            System.out.println(j);
            j++;
        }
        System.out.println("Loop completed");
        // Do-While Loop
        do { 
            System.out.println("This do -while loop will run at least once without checking the condition");
            i++;
        } while (i<x);
        System.out.println("Loop completed");
    }
 }