public class mathimatical {
  

    public static void main(String[] args) {

        // 1. ADDITION
        System.out.println("1. Addition");
        int a = 10;
        int b = 3;
        System.out.println(a + b); // 13

        // 2. SUBTRACTION
        System.out.println("\n2. Subtraction");
        System.out.println(a - b); // 7

        // 3. MULTIPLICATION
        System.out.println("\n3. Multiplication");
        System.out.println(a * b); // 30

        // 4. DIVISION
        System.out.println("\n4. Division");
        System.out.println(a / b);         // 3 (integer division)
        System.out.println((double) a / b); // 3.333...

        // 5. MODULUS: REMAINDER
        System.out.println("\n5. Modulus");
        System.out.println(a % b); // 1

        // 6. INCREMENT
        System.out.println("\n6. Increment");
        int x = 5;
        x++;
        System.out.println(x); // 6

        // 7. DECREMENT
        System.out.println("\n7. Decrement");
        int y = 5;
        y--;
        System.out.println(y); // 4

        // 8. COMPOUND ASSIGNMENT
        System.out.println("\n8. Compound Assignment");
        int score = 10;
        score += 5;
        System.out.println(score); // 15
        score -= 3;
        System.out.println(score); // 12
        score *= 2;
        System.out.println(score); // 24
        score /= 4;
        System.out.println(score); // 6
        score %= 4;
        System.out.println(score); // 2

        // 9. OPERATOR PRECEDENCE
        System.out.println("\n9. Operator Precedence");
        System.out.println(2 + 3 * 4);   // 14
        System.out.println((2 + 3) * 4); // 20

        // 10. ABSOLUTE VALUE
        System.out.println("\n10. Absolute Value");
        System.out.println(Math.abs(-15)); // 15

        // 11. POWER
        System.out.println("\n11. Power");
        System.out.println(Math.pow(2, 3)); // 8.0

        // 12. SQUARE ROOT
        System.out.println("\n12. Square Root");
        System.out.println(Math.sqrt(64)); // 8.0

        // 13. MINIMUM AND MAXIMUM
        System.out.println("\n13. Min and Max");
        System.out.println(Math.min(10, 20)); // 10
        System.out.println(Math.max(10, 20)); // 20

        // 14. ROUNDING
        System.out.println("\n14. Rounding");
        System.out.println(Math.round(4.6)); // 5
        System.out.println(Math.floor(4.9)); // 4.0
        System.out.println(Math.ceil(4.1));  // 5.0

        // 15. RANDOM NUMBER
        System.out.println("\n15. Random Number");
        double random = Math.random();
        System.out.println(random); // From 0.0 up to, but not including, 1.0

        // Random integer from 1 to 10
        int randomNumber = (int) (Math.random() * 10) + 1;
        System.out.println(randomNumber); // 1 to 10

        // 16. EVEN OR ODD
        System.out.println("\n16. Even or Odd");
        int number = 8;

        if (number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        // 17. SWAP TWO VARIABLES
        System.out.println("\n17. Swap Variables");
        int first = 10;
        int second = 20;
        int temp = first;
        first = second;
        second = temp;

        System.out.println(first);  // 20
        System.out.println(second); // 10

        // 18. CALCULATE AVERAGE
        System.out.println("\n18. Average");
        double n1 = 80;
        double n2 = 90;
        double n3 = 70;

        double average = (n1 + n2 + n3) / 3;
        System.out.println(average); // 80.0

        // 19. AREA OF A CIRCLE
        System.out.println("\n19. Circle Area");
        double radius = 5;
        double area = Math.PI * radius * radius;
        System.out.println(area); // Approximately 78.54

        // 20. ROUND TO TWO DECIMAL PLACES
        System.out.println("\n20. Two Decimal Places");
        double price = 12.5678;
        System.out.printf("%.2f%n", price); // 12.57
    }
}


