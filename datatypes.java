
public class datatypes {
    public static void main(String[] args) {

        // 1. byte: small whole numbers
        byte age = 20;
        System.out.println(age); // 20

        // 2. short: short whole numbers
        short year = 2026;
        System.out.println(year); // 2026

        // 3. int: standard whole numbers
        int salary = 15000;
        System.out.println(salary); // 15000

        // 4. long: large whole numbers
        long population = 8000000000L;
        System.out.println(population); // 8000000000

        // 5. float: decimal numbers (use f)
        float temperature = 25.5f;
        System.out.println(temperature); // 25.5

        // 6. double: decimal numbers (default decimal type)
        double price = 99.99;
        System.out.println(price); // 99.99

        // 7. char: one character (single quotes)
        char grade = 'A';
        System.out.println(grade); // A

        // 8. boolean: true or false
        boolean isStudent = true;
        System.out.println(isStudent); // true

        // 9. String: text (reference type)
        String name = "Abel";
        System.out.println(name); // Abel

        // 10. Array: stores multiple values of one type
        int[] numbers = {10, 20, 30};
        System.out.println(numbers[0]); // 10

        // 11. Object: an instance of a class
        Object value = "Hello Java";
        System.out.println(value); // Hello Java

        // 12. Type conversion: int to double
        int number = 10;
        double converted = number;
        System.out.println(converted); // 10.0

        // 13. Type casting: double to int
        double decimal = 9.8;
        int whole = (int) decimal;
        System.out.println(whole); // 9

        // 14. Check a variable's type indirectly
        System.out.println(
            ((Object) name).getClass().getSimpleName()
        ); // String
    }
}
