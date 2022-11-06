// WAP to separate 0s on left side and 1s on right side of an array of 0s and 1s in random order

import java.util.*;

class segregateArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of N");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the array values as 0s and 1s");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Approach 1: Using sort() function 👇

        // Code:

        // Arrays.sort(arr);
        // System.out.print("Array after segregation is ");
        // for (int i = 0; i < n; ++i)
        // System.out.print(arr[i] + " ");

        // Approach 2: Steps 👇

        // ~ Count the number of 0s
        // ~ Traversing over the whole array for looking out indices where zeros are
        // present
        // ~ Maintaining a count and incrementing as 0 appears
        // ~ Print all zeros to the front
        // ~ The remaining number of 1s will be 1- (total number of 0s)
        // ~ Print the remaining elements

        // Code:

        int count = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 0)
                count++;
        }

        for (int i = 0; i < count; i++)
            arr[i] = 0;

        for (int i = count; i < n; i++)
            arr[i] = 1;

        System.out.print("Array after segregation is ");
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

        sc.close();

    }
}
