// WAP to find if the array can be splited in three equal sum subarrays

import java.util.Arrays;

public class splitArray {

    static boolean canThreePartsEqualSum(int[] A) {

        int sum = Arrays.stream(A).sum();

        if (sum % 3 != 0) {
            return false;
        }

        int partitionSum = sum / 3;
        int numberOfPartion = 0;
        int tempSum = 0;
        for (int i = 0; i < A.length; i++) {
            tempSum += A[i];
            if (tempSum == partitionSum) {
                tempSum = 0;
                numberOfPartion++;
            }
        }
        return numberOfPartion >= 3;
    }

    public static void main(String[] args) {
        int a[] = { 0, 2, 1, -6, 6, -7, 9, 1, 2, 0, 1 };
        System.out.println(canThreePartsEqualSum(a));
    }
}