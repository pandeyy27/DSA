// WAP to sum values of an array

import java.util.*;

class sumValuesOfArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of array");
        int n = sc.nextInt();

        int array[] = new int[n];
        System.out.println("Enter the elements of array");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("The sum is " + sum);

        sc.close();
    }
}
