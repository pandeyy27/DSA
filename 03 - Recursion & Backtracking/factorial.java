// WAP to find the factorial of a number using recursion

public class factorial {
    static int output(int n) {
        if (n == 0 || n == 1)
            return 1;
        int fact = output(n - 1) * n;
        return fact;
    }
    
    public static void main(String[] args) {
        System.out.println(output(6));
    }
}