// WAP to remove duplicates from a sorted array

class removeDuplicates {

    public static void main(String[] args) {

        int arr[] = { 1, 2, 2, 3, 4, 4, 7, 7, 7, 7 };

        int j = 1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[j] = arr[i + 1];
                j++;
            }
        }

        for (int i = 0; i < j; i++)
            System.out.print(arr[i] + " ");

    }
}
