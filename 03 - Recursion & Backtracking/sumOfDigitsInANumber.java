// WAP to find sum of digits in a number using recursion

public class sumOfDigitsInANumber {
    static int output(int n) {
        if (n == 0)
            return 0;
        int lastDigit = n % 10;
        int restDigits = n / 10;

        return lastDigit + output(restDigits);
    }

    public static void main(String[] args) {
        System.out.println(output(222));
    }
}