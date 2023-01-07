// WAP to print minimum sum subarray
// IMPORTANT QUESTION
// Use Kadane's Algorithm

public class minSumSubArray {
    static int subArray(int a[]) {
        // int curSum = 0;
        // int minSum = Integer.MAX_VALUE;

        // for (int i = 0; i < a.length; i++) {
        // curSum += a[i];
        // if (minSum > curSum)
        // minSum = curSum;
        // if (curSum > 0)
        // curSum = 0;
        // }

        int current_sum = 0, min_sum = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            current_sum += a[i];
            min_sum = Math.min(min_sum, current_sum);
            if (current_sum >= 0) {
                current_sum = 0;
            }
        }
        return min_sum;

        // return minSum;
    }

    public static void main(String[] args) {
        int[] a = { 3, -4, 2, -3, -1, 7, -5 };
        System.out.println("Minimum sum is " + subArray(a));
    }
}