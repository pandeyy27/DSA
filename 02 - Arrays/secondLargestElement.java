// WAP to print second largest element in an array

class secondLargestElement {

    public static void main(String[] args) {

        int a[] = { 12, 8, 12, 5 };

        int largestIndex = 0;
        int secondlargestIndex = -1;

        for (int i = 1; i < a.length; i++) {
            if (a[i] > a[largestIndex]) {
                secondlargestIndex = largestIndex; // Do not write this line below
                largestIndex = i; // Do not write this line above
            } else if (a[i] < a[largestIndex]) {
                if (secondlargestIndex == -1 || a[i] > a[secondlargestIndex]) {
                    secondlargestIndex = i;
                }
            }
        }
        System.out.println("Second Largest element found at index position " + secondlargestIndex);
        System.out.println("Second Largest element is " + a[secondlargestIndex]);
    }
}