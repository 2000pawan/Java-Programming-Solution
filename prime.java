import java.util.Scanner;
public class prime {
    public static void main(String[] args){
        int i,x;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:-");
        boolean isPrime=true;
        x=sc.nextInt();
        if (x<2){
            System.out.println("Given Number is not a Prime number!");
        }
        else{
            for(i=2;i<x-1;i++){
                if (x%i==0){
                    System.out.println("Given number is not a Prime Number!");
                    isPrime=false;
                    break;
                }
            }
        }
        if (isPrime){
            System.out.println("Given Number is a Prime Number!");
        }
        sc.close();
    }
}
