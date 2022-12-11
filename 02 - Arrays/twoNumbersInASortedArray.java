// WAP to find two numbers in a sorted array with the given sum
// Usually for sorted or subarray problem use two pointer approach

public class twoNumbersInASortedArray {
    static boolean output(int a[], int sum) {

        int i = 0;
        int j = a.length - 1;

        while (i < j) {
            if (sum == (a[i] + a[j])) {
                return true;
            }
            if (sum < (a[i] + a[j])) {
                j--;
            } else {
                i++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int a[] = { 1, 2, 7, 8, 10, 12 };
        System.out.println(output(a, 12));
    }
}