/*
Constructors:-
A constructor is a special method in Java used to initialize objects. 
It has the same name as the class and does not have a return type. 
It is automatically called when an object is created.
 */

class constructor {
    int num;
    // COnstructor
    constructor(int n) {
        num=n;
    }
    void display(){
        System.out.println("Number: "+num);
    }
    public static void main(String[] args) {
        constructor obj = new constructor(10);
        obj.display();
    }
}
