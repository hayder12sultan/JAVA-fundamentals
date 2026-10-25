public class OOP {
  public static void main(String[] args) {

        // 1. CLASS AND OBJECT
        System.out.println("1. Class and Object");

        Student student = new Student("Abel", 20);
        student.introduce();

        // 2. CONSTRUCTOR
        System.out.println("\n2. Constructor");

        Student student2 = new Student("Sara", 22);
        student2.introduce();

        // 3. ENCAPSULATION
        System.out.println("\n3. Encapsulation");

        BankAccount account = new BankAccount(1000);
        account.deposit(500);
        System.out.println("Balance: " + account.getBalance());

        // 4. INHERITANCE
        System.out.println("\n4. Inheritance");

        Dog dog = new Dog();
        dog.eat();
        dog.bark();

        // 5. POLYMORPHISM: METHOD OVERRIDING
        System.out.println("\n5. Polymorphism");

        Animal animal = new Dog();
        animal.makeSound();

        // 6. METHOD OVERLOADING
        System.out.println("\n6. Method Overloading");

        Calculator calculator = new Calculator();
        System.out.println(calculator.add(2, 3));
        System.out.println(calculator.add(2, 3, 4));

        // 7. ABSTRACTION
        System.out.println("\n7. Abstraction");

        Shape shape = new Circle(5);
        System.out.println("Area: " + shape.area());

        // 8. INTERFACE
        System.out.println("\n8. Interface");

        Payment payment = new CashPayment();
        payment.pay();

        // 9. STATIC MEMBERS
        System.out.println("\n9. Static Members");

        System.out.println("School: " + Student.school);
        System.out.println("Students created: " + Student.count);

        // 10. COMPOSITION: HAS-A RELATIONSHIP
        System.out.println("\n10. Composition");

        Car car = new Car();
        car.drive();
    }
}

// CLASS AND OBJECT
class Student {
    String name;
    int age;

    static String school = "ABC School";
    static int count = 0;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
        count++;
    }

    void introduce() {
        System.out.println(name + ", " + age);
    }
}

// ENCAPSULATION
class BankAccount {
    private double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public double getBalance() {
        return balance;
    }
}

// INHERITANCE
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }

    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }

    @Override
    void makeSound() {
        System.out.println("Dog says woof");
    }
}

// METHOD OVERLOADING
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

// ABSTRACTION
abstract class Shape {
    abstract double area();
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

// INTERFACE
interface Payment {
    void pay();
}

class CashPayment implements Payment {
    @Override
    public void pay() {
        System.out.println("Payment made with cash");
    }
}

// COMPOSITION
class Engine {
    void start() {
        System.out.println("Engine started");
    }
}

class Car {
    private final Engine engine = new Engine();

    void drive() {
        engine.start();
        System.out.println("Car is moving");
    }
}
