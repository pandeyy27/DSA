// WAP to find three numbers in an unsorted array with the given sum
// Time complexity: O(nlogn + n^2) = O(n^2)

import java.util.Arrays;

public class threeNumbersInAnUnsortedArray {
    static boolean output(int a[], int sum) {
        Arrays.sort(a);

        for (int z = 0; z < a.length; z++) {
            int k = sum - a[z];
            int i = 0;
            int j = a.length - 1;

            while (i < j) {
                if (k == (a[i] + a[j])) {
                    return true;
                }
                if (k < (a[i] + a[j])) {
                    j--;
                } else {
                    i++;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int a[] = { 2, 7, 4, 0, 9, 5, 1, 3 };
        System.out.println(output(a, 6));
    }
}