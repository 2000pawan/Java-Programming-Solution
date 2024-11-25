public class TypeCasting{
    public static void main(String[] args) {

        // Implicit Casting.
        int x=100;
        long y=x;
        System.out.println("Implicit Casting: Int to Long:- "+y);
        
        //Explicit Casting.
        double z=9.78;
        int a=(int)z;
        System.out.println("Explicit Casting: Double to Int:- "+a);
    }
}