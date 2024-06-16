package OOPs;
class Parent{
    Parent(){
        System.out.println("Parent constructor called");
    }
    public void method1(){
        System.out.println("Method 1 called in parent");
    }
    void method2(){
        System.out.println("Method 2 called in parent");
    }
}
class Child extends Parent{
    Child(){
        System.out.println("Child constructor called");
    }
    @Override
    public void method1(){
        System.out.println("Method 1 called in child this means method overriding");
    }
    void method3(){
        System.out.println("Method 3 called");
    }
    void method4(int x){
        System.out.println("Method 4 called with integer argument");
    }
    void method4(double x){
        System.out.println("Method 4 called with double argument"); 
    }
    void method2(String s){
        System.out.println("Method 2 called with string argument"); // This is method overloading not overriding because argument is different from parent class method2
    }
}
public class Inheritance {
    public static void main(String[] args){
        Child child = new Child();
        Parent parent = new Parent();
        Parent child1 = new Child();
        child.method1();
        child.method3();
        child.method2();
        parent.method1();
        parent.method2();
        child1.method1();     // This will call the method1 of child class because child1 is of object type Child
        child1.method2();
        // child1.method3();  // This will give error because child1 is of type Parent and method3 is not present in Parent class
        // System.out.println(child instanceof Parent);  // true
        // System.out.println(parent instanceof Child);  // false
    }
}


//----------------------------- NOTES -----------------------------//
// Inheritance is the concept of inheriting the properties of one class into another class.
// Inheritance is achieved by using extends keyword.
// Types of Inheritance:
// 1. Single Inheritance : When a class inherits only one class.
// 2. Multilevel Inheritance : When a class inherits another class which is already inherited by another class.
// 3. Hierarchical Inheritance : When multiple classes inherit a single class.
// 4. Multiple Inheritance : When a class inherits multiple classes. Java does not support multiple inheritance.
// 5. Hybrid Inheritance : Combination of two or more types of inheritance.

// --------------------------------------------------------------------------------------------------------------------------------

// When the child class object is created then the parent class constructor is called first and then the child class constructor
// When an overridden method is called through a superclass reference,
// Java determines which version(superclass/subclasses) of that method is to be executed based upon the type of the object being referred to at the time the call occurs. Thus, this determination is made at run time.
// Overriding is the concept of defining the same method in child class which is already present in parent class.
// Overriding is achieved by using @Override annotation.
// Overloading is the concept of defining the same method with different arguments.
// If parent class have a method private then only it can not be accessed by child class.


// ----------------------------- IMPORTANT POINTS -----------------------------//
// Parent reference and child object is possible, but child reference and parent object is not possible.
// When a parent reference refers to a child object, then only those methods of child class can be accessed which are in parent class.
// A child class can't change a protected method or public method in a parent class to private.
// It can only change it to protected or public if that is a protected method other wise if public then it can not change that also.
// It means child can not reduce the visibility of the method in parent class.
// A child class can't override a private method in parent class.