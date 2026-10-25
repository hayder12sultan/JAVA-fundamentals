public class functions {
    public static void main(String[] args) {

        // 1. METHOD WITHOUT PARAMETERS OR RETURN VALUE
        System.out.println("1. Simple Method");
        greet();

        // 2. METHOD WITH PARAMETERS
        System.out.println("\n2. Parameters");
        greetPerson("Abel");

        // 3. METHOD WITH A RETURN VALUE
        System.out.println("\n3. Return Value");
        System.out.println(add(5, 3)); // 8

        // 4. VOID METHOD
        System.out.println("\n4. Void Method");
        printMessage("Learning Java");

        // 5. METHOD WITH MULTIPLE PARAMETERS
        System.out.println("\n5. Multiple Parameters");
        System.out.println(calculateTotal(10, 20, 30)); // 60

        // 6. METHOD OVERLOADING
        System.out.println("\n6. Method Overloading");
        System.out.println(addNumbers(2, 3));       // 5
        System.out.println(addNumbers(2, 3, 4));    // 9
        System.out.println(addNumbers(2.5, 3.5));   // 6.0

        // 7. METHOD WITH A CONDITION
        System.out.println("\n7. Conditional Method");
        System.out.println(checkAge(20)); // Adult
        System.out.println(checkAge(15)); // Minor

        // 8. METHOD WITH A LOOP
        System.out.println("\n8. Method with a Loop");
        printNumbers(3);

        // 9. RECURSION: A METHOD CALLING ITSELF
        System.out.println("\n9. Recursion");
        System.out.println(factorial(5)); // 120

        // 10. STATIC METHOD
        System.out.println("\n10. Static Method");
        System.out.println(square(4)); // 16

        // 11. INSTANCE METHOD
        System.out.println("\n11. Instance Method");
        Calculator calculator = new Calculator();
        System.out.println(calculator.multiply(4, 5)); // 20

        // 12. VARARGS: VARIABLE NUMBER OF ARGUMENTS
        System.out.println("\n12. Varargs");
        System.out.println(sum(1, 2, 3, 4, 5)); // 15

        // 13. METHOD RETURNING A BOOLEAN
        System.out.println("\n13. Boolean Method");
        System.out.println(isEven(8)); // true
        System.out.println(isEven(7)); // false
    }

    // 1. No parameters, no return value
    static void greet() {
        System.out.println("Hello!");
    }

    // 2. Parameter
    static void greetPerson(String name) {
        System.out.println("Hello, " + name);
    }

    // 3. Return value
    static int add(int a, int b) {
        return a + b;
    }

    // 4. Void method
    static void printMessage(String message) {
        System.out.println(message);
    }

    // 5. Multiple parameters
    static int calculateTotal(int a, int b, int c) {
        return a + b + c;
    }

    // 6. Method overloading
    static int addNumbers(int a, int b) {
        return a + b;
    }

    static int addNumbers(int a, int b, int c) {
        return a + b + c;
    }

    static double addNumbers(double a, double b) {
        return a + b;
    }

    // 7. Conditional method
    static String checkAge(int age) {
        if (age >= 18) {
            return "Adult";
        }
        return "Minor";
    }

    // 8. Method with a loop
    static void printNumbers(int limit) {
        for (int i = 1; i <= limit; i++) {
            System.out.println(i);
        }
    }

    // 9. Recursive method
    static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    // 10. Static method
    static int square(int number) {
        return number * number;
    }

    // 12. Varargs
    static int sum(int... numbers) {
        int total = 0;

        for (int number : numbers) {
            total += number;
        }

        return total;
    }

    // 13. Boolean method
    static boolean isEven(int number) {
        return number % 2 == 0;
    }
}

// 11. Instance method
class Calculator {
    int multiply(int a, int b) {
        return a * b;
    }
}

  

