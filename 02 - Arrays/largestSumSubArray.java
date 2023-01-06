// WAP to print maximum sum subarray
// IMPORTANT QUESTION
// Use Kadane's Algorithm

class largestSumSubArray {

    static int largestSubArray(int a[]) {
        // int curSum = 0;
        // int maxSum = Integer.MIN_VALUE;

        // for (int i = 0; i < a.length; i++) {
        // curSum += a[i];
        // if (maxSum < curSum)
        // maxSum = curSum;
        // if (curSum < 0)
        // curSum = 0;
        // }

        int current_sum = 0, max_sum = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            current_sum += a[i];
            max_sum = Math.max(max_sum, current_sum);
            if (current_sum <= 0) {
                current_sum = 0;
            }
        }
        return max_sum;

        // return maxSum;
    }

    public static void main(String[] args) {
        int[] a = { -2, -4, -3, -6, -5 };
        System.out.println("Largest sum is " + largestSubArray(a));
    }

}
