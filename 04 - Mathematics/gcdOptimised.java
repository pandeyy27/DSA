// GCD or HCF of two numbers
// Method: Euclid algorithm
// Time complexity: O(log(n))

class gcdOptimised {
    static int output(int a, int b) {
        if (a % b == 0)
            return b;
        if (a < b)
            return output(b, a);

        return output(a % b, b);
    }

    public static void main(String[] args) {
        System.out.println(output(20, 36));
    }
}