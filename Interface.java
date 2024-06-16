package OOPs;

interface A{
    int x = 10;  // By default variables in interface are public, static and final
    void method1();
    void method2();
    default void method3(){
        System.out.println("Method 3 called in interface because it is default method");
    };
    static void method4(){
        System.out.println("Method 4 called in interface because it is static method");
    }
}
interface C extends A{
    void method5();
}

interface D{
    void method6();
}
interface E extends A, D{
    void method7();
}
class B implements C, D{
// Here we are overriding the abstract methods of interface A because class B implements interface C which extends interface A
    @Override
    public void method1(){   
        System.out.println("Method 1 called in class B");
    }
    @Override
    public void method2(){
        System.out.println("Method 2 called in class B");
    }
    @Override
    public void method5(){
        System.out.println("Method 5 called in class B");
    }
    @Override
    public void method6(){
        System.out.println("Method 6 called in class B");
    }
}
public class Interface {
    public static void main(String[] args) {
        B b = new B();
        b.method1();
        b.method2();
        b.method3();  // Default method in interface can be called using object of child class
        A.method4();  // Static method and properties in interface can be called using interface name
        
    }
}


// -------------------------- NOTE -------------------------- //
// Interface is a blueprint of a class. It is like a class but have only abstract methods.
// Interface can have variables but by default they are public, static and final.
// Interface can have abstract methods, default methods and static methods.
// Interface can not have constructor.
// Interface can be implemented by a class using implements keyword.
// A class can access the default methods of interface using object of class.

// -------------------------- IMPORTANT POINTS -------------------------- //
// Interface can extend one or more than one interface using extends keyword.
// A class can implement one or more than one interface.
// A class can implement interface and extend a class at the same time.
// A class can implement multiple interfaces but can extend only one class.
