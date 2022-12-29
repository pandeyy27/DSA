// WAP to check palindrome of a number

class palindromeNumber {
    public static boolean palindromeNumbers(int n) {
        int rev = 0;
        int temp = n;

        while (temp > 0) {
            int ld = temp % 10;
            rev = rev * 10 + ld;
            temp /= 10;
        }
        return n == rev;
    }

    public static void main(String[] args) {
        System.out.println(palindromeNumbers(343));
    }
}