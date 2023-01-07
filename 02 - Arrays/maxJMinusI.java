// WAP to find maximum j-i [j > i] such that arr[j] > arr[i]

public class maxJMinusI {
    static int output(int[] arr) {
        int n = arr.length;
        int[] leftMin = new int[n];
        leftMin[0] = arr[0];
        for (int i = 1; i < n; i++) {
            leftMin[i] = Math.min(leftMin[i - 1], arr[i]);
            // System.out.println(leftMin[i]);
        }

        int maxDist = Integer.MIN_VALUE;
        int i = n - 1, j = n - 1;
        while (i >= 0 && j >= 0) {
            if (arr[j] >= leftMin[i]) {
                maxDist = Math.max(maxDist, j - i);
                // System.out.println(maxDist);
                i--;
            } else
                j--;
        }
        return maxDist;
    }

    public static void main(String[] args) {
        int a[] = {9, 2, 3, 4, 5, 6, 7, 8, 18, 0};
        System.out.println(output(a));
    }
}