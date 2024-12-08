/*
Wrapper Class:- Wrapper classes are used to convert the primitive data types into objects. 
They are used to provide a class wrapper around the primitive data types. 
Wrapper Classes in Java
Primitive Type	Wrapper Class
byte	          Byte
short	          Short
int	              Integer
long	          Long
float	          Float
double	          Double
char	          Character
boolean	          Boolean

Commonly Used Methods in Wrapper Classes
Integer
Integer.parseInt(String s): Converts string to int.
Integer.toString(int i): Converts int to string.
Integer.valueOf(int i): Returns an Integer object.

Double
Double.parseDouble(String s): Converts string to double.
Double.valueOf(double d): Returns a Double object.
Boolean
Boolean.parseBoolean(String s): Converts string to boolean.
Boolean.valueOf(boolean b): Returns a Boolean object.

Character
Character.isDigit(char ch): Checks if the character is a digit.
Character.isLetter(char ch): Checks if the character is a letter.
Character.toUpperCase(char ch): Converts to uppercase.
 */

class Wrapper{
    public static void main(String[] args){
        // Integer
        int a =10;
        Integer wrappedInt=Integer.valueOf(a);//Wrapping
        int unwrappedInt=wrappedInt.intValue();//Unwrapping
        System.out.println("Wrapped Integer:- "+wrappedInt);
        System.out.println("Unwrapped Integer:- "+unwrappedInt);

    }
}








