
// WAP to find the numbers greater than the average of the number of a given array

import java.util.*;

class noGreaterThanAvg {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter N value");
        int n = sc.nextInt();

        int ele[] = new int[n];

        System.out.println("Enter " + n + " elements");
        for (int i = 0; i < ele.length; i++) {
            ele[i] = sc.nextInt();
        }

        int sum = 0;

        for (int i = 0; i < ele.length; i++) {
            sum += ele[i];
        }

        double avg = (double) sum / ele.length;

        System.out.println("Average is " + avg);

        // Numbers greater than the avg 👇
        for (int i = 0; i < ele.length; i++) {
            if (ele[i] > avg) {
                System.out.println(ele[i]);
            }

        }

        sc.close();

    }

}