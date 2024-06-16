package OOPs;

abstract class SuperClass {
    SuperClass(){
        System.out.println("SuperClass constructor called");
    }

    abstract void method1();

    abstract void method2();

    void method3() {
        System.out.println("Method 3 called in parent");
    }
}

class SubClass extends SuperClass {
    @Override
    void method1() {
        System.out.println("Method 1 called in child");
    }

    @Override
    void method2() {
        System.out.println("Method 2 called in child");
    }
}

public class Abstract {
    public static void main(String[] args) {
        SubClass subClass = new SubClass();
        subClass.method1();
        subClass.method2();
        subClass.method3();
        SuperClass superClass = new SubClass();
        superClass.method1();
        superClass.method2();

    }
}

// -------------------------- NOTE -------------------------- //
// Abstract class is a class that cannot be instantiated. It means no object of
// abstract class can be created.
// Abstract class can have abstract methods and concrete methods. 
// concrete methods are the methods with body. Example here method3 is concrete method.
// Abstract methods are the methods without body. Example here method1 and method2.
// All the abstract methods should be override in the child class otherwise the child class also become abstract class.
// Abstract class can have constructor. But it is called when the object of child class is created.

// -------------------------- IMPORTANT POINTS -------------------------- //

// Abstract methods cannot hove final, static, private or strictfp.
// because abstract methods are meant to be overridden in the child class.
