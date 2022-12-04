// Implementation Using Two Pointers

class trappingRainWater {

    static int cal(int[] A) {
        int res = 0;
        int left_max = 0;
        int right_max = 0;
        int i = 0;
        int j = A.length - 1;
        while (i < j) {
            left_max = Math.max(left_max, A[i]);
            right_max = Math.max(right_max, A[j]);
            if (left_max < right_max) {
                res += left_max - A[i];
                i++;
            } else {
                res += right_max - A[j];
                j--;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int a[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        System.out.println(cal(a));

    }
}
