import java.util.Scanner;
public class exe19 {
    public static void main(String [] arg){
        int x,y,i=1,j;
        int bin[]=new int[100];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        x = sc.nextInt();
        y=x;
        while(y!=0){
            bin[i++]=y%2;
            y=y/2;
        }
        System.out.println("Binary representation is:  ");
        for (j=i-1;j>0;j--){
            System.out.print(bin[j]);
        }
        System.out.println("\n");

    }
}
