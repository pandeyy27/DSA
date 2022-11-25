// WAP to check if array is sorted

class checkSorted {

    static boolean output(int arr[], int arr_size) {
        if (arr_size == 1 || arr == null)
            return true;

        for (int i = 0; i < arr_size - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        int arr[] = { 8, 1, 2, 3, 4, 5 };

        int n = arr.length;

        System.out.println(output(arr, n));
    }
}