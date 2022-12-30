// Print all divisors of N in sorted manner

class printSortedDivisor {
    public static void printSortedDivisors(int n) {
        int i = 1;
        for (; i * i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
        i--;
        for (; i >= 1; i--) {
            if (n % i == 0) {
                if (n / i != i)
                    System.out.println(n / i);
            }
        }
    }

    public static void main(String[] args) {
        printSortedDivisors(25);
    }
}