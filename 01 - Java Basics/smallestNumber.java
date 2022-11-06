// WAP to find the smallest number among three numbers

import java.util.*;

class smallestNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if (a < b && a < c) {
            System.out.println(a + " is the smallest");
        } else if (b < c) {
            System.out.println(b + " is the smallest");
        } else {
            System.out.println(c + " is the smallest");
        }

        // int smallest = (a < b) ? (a < c ? a : c) : (b < c ? b : c);
        // System.out.println(smallest + " is the smallest.");

        input.close();
    }
}
