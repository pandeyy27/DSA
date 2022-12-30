// WAP to maximise the number of rods after cutting a rod with three given sizes
// Time complexity: O(3^n)

public class maxRods {
    static int maxRodsSol(int N, int a, int b, int c) {
        if (N == 0)
            return 0;
        if (N < 0)
            return -1;

        int cutA = maxRodsSol(N - a, a, b, c);
        int cutB = maxRodsSol(N - b, a, b, c);
        int cutC = maxRodsSol(N - c, a, b, c);

        int res = Math.max(cutA, Math.max(cutB, cutC));

        if (res == -1)
            return -1;

        return res + 1;
    }

    public static void main(String[] args) {
        int N = 25;
        int a = 6;
        int b = 7;
        int c = 13;

        System.out.println(maxRodsSol(N, a, b, c));
    }
}