// WAP to print output of N natural numbers

class sumOfNNaturalNumbers {
    static int output(int n) {

        if (n <= 1)
            return n;
        int sum = output(n - 1) + n;

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(output(10));
    }
}