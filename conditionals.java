public class conditionals {
    public static void main(String[] args) {

        // 1. IF: execute code when a condition is true
        System.out.println("1. If Statement");

        int age = 20;

        if (age >= 18) {
            System.out.println("You are an adult");
        }

        // 2. IF-ELSE: choose between two options
        System.out.println("\n2. If-Else Statement");

        int number = 7;

        if (number % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }

        // 3. IF-ELSE-IF: check multiple conditions
        System.out.println("\n3. If-Else-If Statement");

        int score = 85;

        if (score >= 90) {
            System.out.println("Grade A");
        } else if (score >= 80) {
            System.out.println("Grade B");
        } else if (score >= 70) {
            System.out.println("Grade C");
        } else if (score >= 50) {
            System.out.println("Grade D");
        } else {
            System.out.println("Grade F");
        }

        // 4. NESTED IF: an if statement inside another if
        System.out.println("\n4. Nested If");

        boolean hasAccount = true;
        boolean isVerified = true;

        if (hasAccount) {
            if (isVerified) {
                System.out.println("Access granted");
            } else {
                System.out.println("Verify your account");
            }
        } else {
            System.out.println("Create an account");
        }

        // 5. SWITCH: select among multiple cases
        System.out.println("\n5. Switch Statement");

        int day = 2;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid day");
        }

        // 6. SWITCH EXPRESSION: return a value
        System.out.println("\n6. Switch Expression");

        int choice = 1;

        String result = switch (choice) {
            case 1 -> "Home";
            case 2 -> "Settings";
            case 3 -> "Profile";
            default -> "Unknown option";
        };

        System.out.println(result);

        // 7. LOGICAL OPERATORS IN CONDITIONS
        System.out.println("\n7. Logical Operators");

        int userAge = 22;
        boolean hasID = true;

        if (userAge >= 18 && hasID) {
            System.out.println("Entry allowed");
        }

        if (userAge < 18 || !hasID) {
            System.out.println("Entry denied");
        }

        // 8. TERNARY OPERATOR: short if-else
        System.out.println("\n8. Ternary Operator");

        int temperature = 30;

        String weather = temperature > 25
                ? "Hot"
                : "Cool";

        System.out.println(weather);

        // 9. STRING COMPARISON
        System.out.println("\n9. String Comparison");

        String username = "admin";

        if (username.equals("admin")) {
            System.out.println("Welcome, administrator");
        } else {
            System.out.println("Unknown user");
        }

        // 10. COMPARING MULTIPLE CONDITIONS
        System.out.println("\n10. Multiple Conditions");

        int mark = 75;

        if (mark >= 50 && mark <= 100) {
            System.out.println("Valid passing mark");
        } else {
            System.out.println("Failed or invalid mark");
        }
    }
}

  

