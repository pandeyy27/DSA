// WAP to find factorial

import java.util.*;

class factorial {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the value of N");
        int n = input.nextInt();

        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = i * fact;
        }

        input.close();
        System.out.println("Factorial of " + n + " is " + fact);

    }
}
