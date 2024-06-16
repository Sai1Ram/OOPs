package OOPs;
class Student{
    private String name;
    private int age;
    private int rollNo;
    // constructor
    Student(String name, int age, int rollNo){
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
        System.out.println("Constructor called");
    }
    // getter and setter methods
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getRollNo(){
        return rollNo;
    }
    public void setRollNo(int rollNo){
        this.rollNo = rollNo;
    }

    
}
public class BasicOOPs {
    public static void main(String[] args) {
        // Creating object of class
        Student student = new Student("Sai Ram", 20, 1210502);
        int age = student.getAge();
        String name = student.getName();
        int rollNo = student.getRollNo();
        System.out.printf("Name: %s\nRoll No: %d\n", name, rollNo);
        System.out.println("Age: "+age);
        Student students[] = new Student[3];  // This is the array of objects
        students[0] = new Student("Arpit", 20, 1210798);
        students[1] = new Student("Atanu", 20, 1210504);
        students[2] = new Student("Sree", 20, 1210859);
    }
}

// -------------------------- NOTE --------------------------

// OOPs have 4 basic concepts
// 1. Abstraction
// 2. Encapsulation
// 3. Inheritance
// 4. Polymorphism
// --------------------------------------------------------------------------------------------------------------------------------
// 1. Abstraction :- Abstraction is the concept of hiding the inner details and showing required functionality to the user.
// Abstraction is achieved by using abstract classes and interfaces.
// 2. Encapsulation :- Encapsulation is the concept of wrapping the data and code that operates on the data into a single unit.
// Encapsulation is achieved by using classes, getters and setters methods.
// 3. Inheritance :- Inheritance is the concept of acquiring the properties and behavior of one class into another class.
// Inheritance is achieved by using extends keyword. 
// 4. Polymorphism :- Polymorphism means different form of one thing. 
// Polymorphism is achieved by using method overloading and method overriding.


// -------------------------- IMPORTANT POINTS -------------------------- //
// All the things created with new keyword are stored in heap memory. So the objects are stored in heap memory.
// The reference variable is stored in stack memory.
// Each method has its own stack memory in which the local variables are stored.