// WAP to find sum of square of N natural numbers using recursion

public class sumOfSquareOfN {
    static int output(int n) {
        if (n == 0)
            return 0;
        int sum = output((n - 1)) + (n * n);
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(output(5));
    }
}