
import java.util.Scanner;
public class exe20 {
    public static void main(String [] args){
        int x,y;
        String hex="";
        char hex1[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        Scanner sc=new Scanner(System.in);
        System.out.println("Input a decimal nnumber:- ");
        x=sc.nextInt();
        while(x>0){
            y=x%16;
            hex=hex1[y]+hex;
            x=x/16;
        }
        System.out.println("Hexadecimal equivalent of decimal number is:- "+hex+"\n");

    }
}
