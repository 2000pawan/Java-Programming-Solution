public class ArithmeticException{
    public static void main(String [] args){
        int x = 10;
        int y = 0;
        try {
            int result;
            result=x/y;
            System.out.println("Result: "+result);
        } catch (java.lang.ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero");
        }
        finally{
            System.out.println("This block always run");
        }
    }
}