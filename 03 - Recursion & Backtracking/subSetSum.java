// Time complexity: O(2^n)

public class subSetSum {

    static boolean output(int sum, int a[], int N) {
        if (sum < 0)
            return false;
        if (N < 0)
            return false;

        if (sum == 0)
            return true;

        return output(sum - a[N], a, N - 1) || output(sum, a, N - 1);
    }

    public static void main(String[] args) {
        int a[] = { 3, 34, 4, 12, 5, 2 };
        int sum = 31;
        System.out.println(output(sum, a, a.length - 1));
    }
}