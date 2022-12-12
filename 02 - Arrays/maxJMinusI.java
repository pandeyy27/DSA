// WAP to find maximum j-i [j > i] such that arr[j] > arr[i]

public class maxJMinusI {
    static int output(int[] arr) {
        int n = arr.length;
        int[] leftMin = new int[n];
        leftMin[0] = arr[0];
        for (int i = 1; i < n; i++)
            leftMin[i] = Math.min(leftMin[i - 1], arr[i]);

        // leftMin[i] = min{ arr[i...(n-1] }

        int maxDist = Integer.MIN_VALUE;
        int i = n - 1, j = n - 1;
        while (i >= 0 && j >= 0) {
            if (arr[j] >= leftMin[i]) {
                maxDist = Math.max(maxDist, j - i);
                i--;
            } else
                j--;
        }
        return maxDist;
    }

    public static void main(String[] args) {
        int a[] = { 34, 8, 10, 3, 2, 80, 30, 33, 1 };
        System.out.println(output(a));
    }
}