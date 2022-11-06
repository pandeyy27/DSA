// WAP to print multiplication table upto 10

import java.util.*;

class tablesUpto10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int x = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(x + " X " + i + " = " + (i * x));
        }

        sc.close();

    }
}
