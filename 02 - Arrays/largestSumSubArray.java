// WAP to print maximum sum subarray
// IMPORTANT QUESTION
// Use Kadane's Algorithm

class largestSumSubArray {

    static int largestSubArray(int a[]) {
        int curSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < a.length; i++) {
            curSum += a[i];
            if (maxSum < curSum)
                maxSum = curSum;
            if (curSum < 0)
                curSum = 0;
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] a = { -2, 7, -6, 4, 1, -3, 8 };
        System.out.println("Largest sum is " + largestSubArray(a));
    }

}
