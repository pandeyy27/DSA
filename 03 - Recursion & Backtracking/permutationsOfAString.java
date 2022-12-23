// WAP to print all permutations of a given string

public class permutationsOfAString {
    static void output(String str, String ans) {

        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            String res = str.substring(0, i) + str.substring(i + 1);

            output(res, ans + ch);
        }
    }

    public static void main(String[] args) {
        String s = "abc";
        output(s, "");
    }
}