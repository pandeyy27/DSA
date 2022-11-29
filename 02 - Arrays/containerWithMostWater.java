class containerWithMostWater {

    public static int op(int a[]) {
        int left = 0;
        int right = a.length - 1;
        int maxArea = 0;

        while (left < right) {
            // Calculating the max area

            int height = Math.min(a[left], a[right]);
            int distance = right - left;
            int area = height * distance;
            maxArea = Math.max(maxArea, area);

            // OR USE THIS
            // maxArea = Math.max(maxArea, Math.min(a[left], a[right]) * (right - left));

            if (a[left] < a[right])
                left++;
            else
                right--;
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int y[] = { 1, 8, 6, 2, 4, 5, 8, 3, 7 };
        System.out.println(op(y));
    }
}
