// WAP to replace every element with the greatest element on right side.

class greatestElementOnRight {
    static void output(int arr[], int n) {
        int greatest = -1;

        for (int i = n - 1; i >= 0; i--) {
            int temp = arr[i];
            arr[i] = greatest;

            if (temp > greatest) {
                greatest = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 16, 17, 4, 3, 5, 2 };
        output(arr, arr.length);
    }
}