// WAP to replace every element with the greatest element on right side.

class greatestElementOnRight {
    static void output(int arr[], int n) {

        int gtr = -1;
        int temp = 0;
        
        for (int i = n - 1; i >= 0; i--) {
            temp = arr[i];
            arr[i] = gtr;
            gtr = Math.max(gtr, temp);
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