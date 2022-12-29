// GCD or HCF of two numbers
// Method: Euclid algorithm
// Time complexity: O(n)

class gcd {
    static int output(int a, int b) {
        if (a == b)
            return a;
        if (a < b)
            return output(b, a);

        return output(a - b, b);
    }

    public static void main(String[] args) {
        System.out.println(output(40, 41));
    }
}