// Move all 0s to the end of the array
// Input: 8, 0, 1, 3, 0, 0, 5
// Output: 8, 1, 3, 5, 0, 0, 0

import java.util.Arrays;

public class move0s {
    static void output(int a[]) {
        int j = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                a[j] = a[i];
                j++;
            }
        }
        for (; j < a.length; j++) {
            a[j] = 0;
        }
    }

    public static void main(String[] args) {
        int a[] = { 8, 0, 1, 3, 0, 0, 5 };
        output(a);
        System.out.print(Arrays.toString(a));
    }
}