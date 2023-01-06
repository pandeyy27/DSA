// WAP to rotate the array to the left by k steps

import java.util.Arrays;

public class leftRotate {

    static void reverse(int num[], int low, int high) {
        while (low < high) {
            int temp = num[low];
            num[low] = num[high];
            num[high] = temp;
            low++;
            high--;
        }
    }

    static void rotate(int nums[], int k) {
        int n = nums.length;
        k = k % n;
        reverse(nums, 0, n - k - 1);
        reverse(nums, n - k, n - 1);
        reverse(nums, 0, n - 1);
    }

    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5, 6, 7 };
        rotate(a, 3);
        System.out.println(Arrays.toString(a));
    }
}