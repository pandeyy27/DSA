// WAP to find the power of the number

public class powerOfANumber {
    static int output(int a, int b) {

        if (b == 0)
            return 1;
        int power = output(a, b - 1);

        return power * a;
    }

    public static void main(String[] args) {
        System.out.println(output(3, 3));
    }
}