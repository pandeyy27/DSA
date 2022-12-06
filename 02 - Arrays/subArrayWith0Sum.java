// WAP to find if there is a subarray with 0 sum
// Method: Prefix sum
// Example: a=[ 2, 3, 1, -4, 3, -2 ]
// Prefix sum is: [ 2, 5, 6, 2, 5, 3 ]

import java.util.HashSet;
import java.util.Set;

public class subArrayWith0Sum {

    static boolean cal(int a[]) {
        
        Set<Integer> set = new HashSet<>();

        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
            if (set.contains(sum)) {
                return true;
            }
            set.add(sum);
        }
        return false;
    }

    public static void main(String[] args) {
        int a[] = { 2, 3, 1, -4, 3, -2 };
        System.out.println(cal(a));
    }
}