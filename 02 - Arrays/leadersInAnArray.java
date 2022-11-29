// WAP to print leaders in an array

class leadersInAnArray {

    static void output(int arr[]) {
        int largest = Integer.MIN_VALUE;

        // int rev[] = new int[arr.length];
        // int j = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] > largest) {
                largest = arr[i];
                System.out.print(arr[i] + " "); /* Remove this line for reverse printing */
                // rev[j++] = arr[i];
            }
        }

        // for (j = j - 1; j >= 0; j--) {
        // System.out.print(rev[j] + " ");
        // }
    }

    public static void main(String[] args) {

        int arr[] = { 2, 7, 6, 4, 1, 3 };
        output(arr);
    }
}