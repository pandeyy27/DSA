// In an array of all 0s & 1s, find the longest lenght of all consecutive 1s
// Input: 1, 1, 1, 0, 0, 1, 0, 1, 1, 1, 1, 0, 1
// Output: 4
class consecutive1s {
    static void ouput(int a[]) {
        int count = 0;
        int res = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                count = 0;
            } else {
                count++;
                res = Math.max(res, count);
            }
        }
        System.out.println(res);
    }

    public static void main(String[] args) {
        int a[] = { 1, 1, 1, 0, 0, 1, 0, 1, 1, 1, 1, 0, 1 };
        ouput(a);
    }
}