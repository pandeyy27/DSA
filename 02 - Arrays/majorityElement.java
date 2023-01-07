// Majority Element Problem - Find the element that repeats more than n/2 times
// Approach: Moore's voting algorithm O(N)
// Step 1: We find the candidate which is majority in the array
// Step 2: We check wether the candidate is in majority or not?

public class majorityElement {
    static int output(int a[]) {
        int n = a.length;
        int count = 1;
        int ansIndex = 0;

        // Step 1:
        for (int i = 1; i < n; i++) {
            if (a[i] == a[ansIndex]) {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                count = 1;
                ansIndex = i;
            }
        }

        // Step 2:
        count = 0;
        for (int i = 0; i < n; i++) {
            if (a[ansIndex] == a[i]) {
                count++;
            }
        }

        if (count <= (n / 2)) {
            return -1;
        } else
            return a[ansIndex];
    }

    public static void main(String[] args) {
        int a[] = { 3, 3, 4, 2, 4, 4, 2, 4, 4 };
        System.out.println(output(a));
    }
}