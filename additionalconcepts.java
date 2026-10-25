import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;

public class additionalconcepts {
  



    public static void main(String[] args) {

        // 1. STRINGS
        System.out.println("1. Strings");
        String name = "Java Programming";
        System.out.println(name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.contains("Java"));
        System.out.println(name.substring(0, 4));

        // 2. STRING COMPARISON
        System.out.println("\n2. String Comparison");
        String first = "Java";
        String second = new String("Java");
        System.out.println(first.equals(second)); // true
        System.out.println(first == second);       // false

        // 3. ARRAYS UTILITY METHODS
        System.out.println("\n3. Arrays Utilities");
        int[] numbers = {5, 2, 8, 1};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.binarySearch(numbers, 5));

        // 4. ARRAYLIST: RESIZABLE LIST
        System.out.println("\n4. ArrayList");
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        System.out.println(fruits);
        fruits.remove("Banana");
        System.out.println(fruits);
        System.out.println(fruits.get(0));
        System.out.println(fruits.size());

        // 5. HASHMAP: KEY-VALUE PAIRS
        System.out.println("\n5. HashMap");
        HashMap<String, Integer> scores = new HashMap<>();
        scores.put("Abel", 90);
        scores.put("Sara", 85);
        System.out.println(scores.get("Abel"));
        System.out.println(scores.containsKey("Sara"));
        scores.put("Abel", 95);
        System.out.println(scores.get("Abel"));

        // 6. EXCEPTION HANDLING
        System.out.println("\n6. Exception Handling");
        try {
            int result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } finally {
            System.out.println("Finished");
        }

        // 7. USER INPUT IS NOT REQUIRED FOR THIS EXAMPLE
        System.out.println("\n7. Parsing Strings");
        int age = Integer.parseInt("21");
        double price = Double.parseDouble("19.99");
        System.out.println(age + 1);
        System.out.println(price * 2);

        // 8. ENUM: FIXED SET OF VALUES
        System.out.println("\n8. Enum");
        Day today = Day.MONDAY;
        System.out.println(today);

        // 9. WRAPPER CLASSES
        System.out.println("\n9. Wrapper Classes");
        Integer boxed = 10; // Autoboxing
        int unboxed = boxed; // Unboxing
        System.out.println(boxed);
        System.out.println(unboxed + 5);

        // 10. CONSTANTS
        System.out.println("\n10. Constants");
        final double TAX_RATE = 0.15;
        double amount = 100;
        System.out.println(amount * TAX_RATE);

        // 11. TERNARY OPERATOR
        System.out.println("\n11. Ternary Operator");
        int mark = 75;
        String result = mark >= 50 ? "Pass" : "Fail";
        System.out.println(result);

        // 12. SWITCH EXPRESSION
        System.out.println("\n12. Switch Expression");
        int dayNumber = 2;
        String dayName = switch (dayNumber) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            default -> "Unknown";
        };
        System.out.println(dayName);

        // 13. FOREACH WITH A LIST
        System.out.println("\n13. For-Each");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // 14. NULL CHECK
        System.out.println("\n14. Null Check");
        String message = null;
        if (message == null) {
            System.out.println("No message");
        } else {
            System.out.println(message.length());
        }

        // 15. DATE AND TIME
        System.out.println("\n15. Date and Time");
        java.time.LocalDate date =
                java.time.LocalDate.of(2026, 10, 25);
        System.out.println(date);
        System.out.println(date.plusDays(7));

        // 16. LAMBDA EXPRESSION
        System.out.println("\n16. Lambda Expression");
        Runnable task = () -> System.out.println("Task executed");
        task.run();

        // 17. FILE PATH
        System.out.println("\n17. File Path");
        java.nio.file.Path path =
                java.nio.file.Path.of("notes.txt");
        System.out.println(path.getFileName());
        System.out.println(path.toAbsolutePath().getFileName());
    }
}

enum Day {
    MONDAY, TUESDAY, WEDNESDAY
}

