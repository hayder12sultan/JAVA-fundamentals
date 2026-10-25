public class logicalOperators {
  

    public static void main(String[] args) {

        boolean a = true;
        boolean b = false;

        // 1. LOGICAL AND (&&)
        System.out.println("1. Logical AND");
        System.out.println(a && b);     // false
        System.out.println(5 > 2 && 10 > 5); // true
        System.out.println(5 > 2 && 10 < 5); // false

        // 2. LOGICAL OR (||)
        System.out.println("\n2. Logical OR");
        System.out.println(a || b);     // true
        System.out.println(5 > 2 || 10 < 5); // true
        System.out.println(5 < 2 || 10 < 5); // false

        // 3. LOGICAL NOT (!)
        System.out.println("\n3. Logical NOT");
        System.out.println(!a); // false
        System.out.println(!b); // true

        // 4. COMBINING LOGICAL OPERATORS
        System.out.println("\n4. Combined Conditions");
        int age = 20;
        boolean hasID = true;

        System.out.println(age >= 18 && hasID); // true
        System.out.println(age < 18 || hasID);  // true
        System.out.println(!(age >= 18));        // false

        // 5. PRACTICAL EXAMPLE: LOGIN
        System.out.println("\n5. Login Check");
        String username = "admin";
        String password = "1234";

        boolean loginSuccessful =
                username.equals("admin") && password.equals("1234");

        System.out.println(loginSuccessful); // true

        // 6. PRACTICAL EXAMPLE: AGE ELIGIBILITY
        System.out.println("\n6. Age Eligibility");
        int userAge = 22;

        if (userAge >= 18 && userAge <= 65) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not eligible");
        }

        // 7. SHORT-CIRCUIT AND (&&)
        System.out.println("\n7. Short-Circuit AND");
        int number = 0;

        if (number != 0 && 10 / number > 1) {
            System.out.println("Condition is true");
        } else {
            System.out.println("Condition is false");
        }

        // The second condition is skipped because number != 0 is false.

        // 8. SHORT-CIRCUIT OR (||)
        System.out.println("\n8. Short-Circuit OR");
        System.out.println(true || false);  // true
        System.out.println(false || true);  // true
        System.out.println(false || false); // false

        // 9. TRUTH TABLE
        System.out.println("\n9. Truth Table");
        System.out.println("AND: " + (true && true));   // true
        System.out.println("AND: " + (true && false));  // false
        System.out.println("OR: " + (true || false));   // true
        System.out.println("OR: " + (false || false));  // false
        System.out.println("NOT: " + (!true));          // false

        // 10. LOGICAL VS BITWISE OPERATORS
        System.out.println("\n10. Logical vs Bitwise");
        System.out.println(true & false); // false
        System.out.println(true | false); // true
        System.out.println(!true);        // false
    }
}


