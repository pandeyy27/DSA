// WAP to print minimum sum subarray
// IMPORTANT QUESTION
// Use Kadane's Algorithm

public class minSumSubArray {
    static int largestSubArray(int a[]) {
        int curSum = 0;
        int minSum = Integer.MAX_VALUE;

        for (int i = 0; i < a.length; i++) {
            curSum += a[i];
            if (minSum > curSum)
                minSum = curSum;
            if (curSum > 0)
                curSum = 0;
        }
        return minSum;
    }

    public static void main(String[] args) {
        int[] a = { -4, 5, -1, -6, 8 };
        System.out.println("Largest sum is " + largestSubArray(a));
    }
}