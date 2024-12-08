/*
Interface:-
1.  The function takes a list of integers as input.
2.  It returns the sum of all the integers in the list.
An interface in Java is a blueprint for a class.It is a collection of methods that a class must implement. 
It is used to define a contract that must be implemented by any class that implements it. 
interface SumOfList {
    int sumOfList(int[] list);
}
class Sum implements SumOfList{
    public int sumOfList(int[] list) {
        int sum = 0;
        for (int i : list) {
            sum += i;
            }
        return sum;
    }
}
public class Interface{
    public static void main(){
        Sum sum = new Sum();
        int[] list = {1, 2, 3, 4, 5};
        System.out.println(sum.sumOfList(list));
    }
}

