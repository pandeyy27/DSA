// WAP to print largest element in an array

class largestElement {

    public static void main(String[] args) {

        int a[] = { 4, 1, 7, 12, 3 };

        int n = a.length;
        int index = 0;

        for (int i = 1; i < n; i++) {
            if (a[i] > a[index]) {
                index = i;
            }
        }
        System.out.println("Largest element found at index position: " + index);
        System.out.println("Largest element found is: " + a[index]);
    }
}