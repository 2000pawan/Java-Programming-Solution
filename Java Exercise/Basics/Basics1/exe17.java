import java.util.Scanner;
public class exe17{
    public static void main(String[] args){
        long bin1,bin2;
        int i=0,remainder=0;
        int[] sum = new int[20];
        Scanner in = new Scanner(System.in);
        System.out.println("Input first binary number: ");
        bin1=in.nextLong();
        System.out.println("Input second binary number: ");
        bin2=in.nextLong();
        while(bin1 !=0 || bin2!=0){
            sum[i++] = (int)((bin1 % 10 + bin2 % 10 + remainder) % 2);
            remainder = (int)((bin1 % 10 + bin2 % 10 + remainder) / 2);
            bin1 = bin1 / 10;
            bin2 = bin2 / 10;
        }
        if (remainder != 0) {
            sum[i++] = remainder;
           }
        --i;
        System.out.println("Sum of two binary number: ");
        while (i>=0){
            System.out.print(sum[i--]);
        }
        System.out.println("\n");
    }
}