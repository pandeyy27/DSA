// WAP to find the max and min value of an array

import java.util.*;

class maxAndMin {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of N");
        int n = sc.nextInt();

        int arr[] = new int[n];
        int max = arr[0];
        int min = arr[0];

        System.out.println("Enter " + n + " elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("The maximum number is:" + max);
        System.out.println("The minimum number is: " + min);

        sc.close();

    }
}
