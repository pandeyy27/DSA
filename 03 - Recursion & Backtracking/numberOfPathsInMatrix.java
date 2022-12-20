// WAP to find the numnber of paths in an nxm matrix

public class numberOfPathsInMatrix {
    static int output(int n, int m) {

        if (n == 1 || m == 1)
            return 1;

        int rightSide = output(n, m - 1);
        int downSide = output(n - 1, m);

        return rightSide + downSide;
    }

    public static void main(String[] args) {
        System.out.println(output(3, 4));
    }
}