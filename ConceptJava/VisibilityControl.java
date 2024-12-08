/*
Visibility control in Java refers to controlling the access level of variables, methods, and classes using access modifiers. 
These modifiers determine which parts of a program can access a specific member or class.
Access Modifiers:-
1.Private:- The member is accessible only within the same class.
Provides the highest level of encapsulation.
2. Default:- The member is accessible within the same class and any class in the same package.
This is the default access level if no modifier is specified.
3. Protected:- The member is accessible within the same class, any class in the same package,
and any subclass of the class in which the member is declared.
4. Public:- The member is accessible from any class.
Provides the least restriction.
 */

 public class VisibilityControl{
    private int x=10;
    private void display(){
        System.out.println("Private variable: "+x);
    }
    int y=15;
    void show(){
        System.out.println("Default Method");
    }
    protected  int z=20;
    protected void displayProtected(){
        System.out.println("Protected variable: "+z);
    }
    public int a=25;
    public void displayPublic(){
        System.out.println("Public variable: "+a);
    }
    public static void main(String[] args){
        VisibilityControl obj=new VisibilityControl();
        obj.display();
        obj.show();
        obj.displayProtected();
        obj.displayPublic();
    
    }
 }