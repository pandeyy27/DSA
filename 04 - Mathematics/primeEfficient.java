// Check if a number is prime or not in efficent manner

class primeEfficient {

    public static boolean isPrimeEfficient(int n) {
        if (n == 1)
            return false;
        for (int i = 2; i * i <= n; i++) { // Alternative condition : i < Math.sqrt(n)
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrimeEfficient(4));
    }
}