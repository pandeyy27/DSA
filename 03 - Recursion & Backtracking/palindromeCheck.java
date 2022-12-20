// WAP to check if an arr is a palindrome using recursion

public class palindromeCheck {
    static boolean output(int arr[], int start, int end) {

        if (arr.length == 0 || arr.length == 1)
            return true;

        if (start >= end)
            return true;

        if (arr[start] == arr[end]) {
            return output(arr, start + 1, end - 1);
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int a[] = { 3, 6, 0, 6, 3 };
        System.out.println(output(a, 0, a.length - 1));
    }
}