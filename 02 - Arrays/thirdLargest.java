// WAP to print third largest element in an array

class thirdLargest {

    static void output(int arr[], int arr_size) {
        /*
           There should be
           atleast three elements
        */
        if (arr_size < 3) {
            System.out.printf("Invalid Input");
            return;
        }

        // largest element
        int first = arr[0];
        for (int i = 1; i < arr_size; i++)
            if (arr[i] > first)
                first = arr[i];

        // second largest element
        int second = Integer.MIN_VALUE;
        for (int i = 0; i < arr_size; i++)
            if (arr[i] > second && arr[i] < first)
                second = arr[i];

        // third largest element
        int third = Integer.MIN_VALUE;
        for (int i = 0; i < arr_size; i++)
            if (arr[i] > third && arr[i] < second)
                third = arr[i];

        System.out.printf("The third Largest element is %d", third);
    }

    public static void main(String[] args) {
        int arr[] = { 12, 15, 7, 10, 34, 16 };
        int n = arr.length;
        output(arr, n);
    }
}
