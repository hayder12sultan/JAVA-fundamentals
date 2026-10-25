public class loops {
    public static void main(String[] args) {

        // 1. FOR LOOP: repeat a known number of times
        System.out.println("1. For Loop");

        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // 2. WHILE LOOP: repeat while a condition is true
        System.out.println("\n2. While Loop");

        int i = 1;

        while (i <= 3) {
            System.out.println(i);
            i++;
        }

        // 3. DO-WHILE LOOP: executes at least once
        System.out.println("\n3. Do-While Loop");

        int j = 1;

        do {
            System.out.println(j);
            j++;
        } while (j <= 3);

        // 4. ENHANCED FOR LOOP: iterate through an array
        System.out.println("\n4. Enhanced For Loop");

        int[] numbers = {10, 20, 30};

        for (int number : numbers) {
            System.out.println(number);
        }

        // 5. BREAK: stop the loop immediately
        System.out.println("\n5. Break");

        for (int k = 1; k <= 5; k++) {
            if (k == 3) {
                break;
            }

            System.out.println(k);
        }

        // 6. CONTINUE: skip the current iteration
        System.out.println("\n6. Continue");

        for (int k = 1; k <= 5; k++) {
            if (k == 3) {
                continue;
            }

            System.out.println(k);
        }

        // 7. NESTED LOOPS: a loop inside another loop
        System.out.println("\n7. Nested Loops");

        for (int row = 1; row <= 2; row++) {
            for (int col = 1; col <= 3; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        // 8. LOOP THROUGH A STRING
        System.out.println("\n8. Loop Through a String");

        String word = "Java";

        for (int index = 0; index < word.length(); index++) {
            System.out.println(word.charAt(index));
        }

        // 9. LOOP THROUGH AN ARRAY USING INDEX
        System.out.println("\n9. Array Index Loop");

        String[] names = {"Abel", "Sara", "John"};

        for (int index = 0; index < names.length; index++) {
            System.out.println(index + ": " + names[index]);
        }
    }
}


