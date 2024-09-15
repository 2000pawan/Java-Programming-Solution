import java.util.*;
public class exe12 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            System.out.println("Enter the number of elements in the array");
        }
        double average;
        int sum = 0;
        for(int i=0;i<n;i++){
            sum = sum + arr[i];
            }
            average = (double)sum/n;
            System.out.println("Average of the array is "+average);
    }
}
