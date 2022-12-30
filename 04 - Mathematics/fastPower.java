// WAP to calculate pow(a,b)

class fastPower {
    static int output(int a, int b) {

        if (b == 0)
            return 1;

        int halfRes = output(a, b / 2);

        int fullRes = halfRes * halfRes;

        if (b % 2 != 0)
            fullRes = fullRes * a;

        return fullRes;
    }

    public static void main(String[] args) {
        System.out.println(output(3, 4));
    }
}