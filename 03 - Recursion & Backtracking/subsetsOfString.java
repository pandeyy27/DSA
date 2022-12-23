// WAP to generate all subsets/subsequence of a string

public class subsetsOfString {
    static void generateAllSubsets(String s) {
        utilGenerateAllSubsets(s, 0, "");
    }

    static void utilGenerateAllSubsets(String s, int i, String cur) {
        if (i == s.length()) {
            System.out.println(cur);
            return;
        }
        utilGenerateAllSubsets(s, i + 1, cur);
        utilGenerateAllSubsets(s, i + 1, cur + s.charAt(i));
    }

    public static void main(String[] args) {
        generateAllSubsets("abc");
    }
}

// To display all subsets uniquely use the code shown below:

// public class subsetsOfString {
//     static void generateAllSubsets(String s) {
//         Set<String> set = new HashSet<>();
//         utilGenerateAllSubsets(s, 0, "", set);
//         for (String st : set) {
//             System.out.println(st);
//         }
//     }

//     static void utilGenerateAllSubsets(String s, int i, String cur, Set<String> set) {
//         if (i == s.length()) {
//             // System.out.println(cur);
//             set.add(cur);
//             return;
//         }
//         utilGenerateAllSubsets(s, i + 1, cur, set);
//         utilGenerateAllSubsets(s, i + 1, cur + s.charAt(i), set);
//     }

//     public static void main(String[] args) {
//         generateAllSubsets("aaa");
//     }
// }