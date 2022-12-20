// WAP to find GCD of two numbers (Euclid Formula)

public class gcdUsingRecursion {
    static int gcd(int a, int b) {
        if (a == 0)
            return b;
        if (b == 0)
            return a;
        if (a > b)
            return gcd(a % b, b);
        else
            return gcd(a, b % a);
    }

    public static void main(String[] args) {
        System.out.println(gcd(50, 60));
    }
}