// WAP to find the length of the largest subarray with equal number of 0s and 1s
// Approach: Hashmap

import java.util.HashMap;

public class largestSubArray {
    static int solution(int a[]) {

        int ans = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                sum += -1;
            } else if (a[i] == 1) {
                sum += +1;
            }

            if (map.containsKey(sum)) {
                int idx = map.get(sum);
                int len = i - idx;
                if (len > ans) {
                    ans = len;
                } else {
                    map.put(sum, i);
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int a[] = { 0, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 1 };
        System.out.println(solution(a));
    }
}