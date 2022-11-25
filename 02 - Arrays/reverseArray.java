// WAP to reverse an array

class reverseArray {

    public static void main(String[] args) {

        int arr[] = { 2, 3, 4, 5, 6 };

        int rev[] = new int[arr.length];

        int j = arr.length;
        for (int i = 0; i < arr.length; i++) {
            rev[j - 1] = arr[i];
            j--;
        }

        System.out.println("Reversed array is:");
        for (int k = 0; k < arr.length; k++) {
            System.out.print(rev[k] + " ");
        }
    }

}
