import java.util.*;

public class Oops {

    public static void main(String[] args) {

        int ageList[] = new int[5];
        Scanner sc = new Scanner(System.in);

        System.out.println("enter 5 elements");
        for (int i = 0; i < ageList.length; i++) {
            ageList[i] = sc.nextInt();
        }
        
        for (int ele : ageList) {
            System.out.println(ele);
        }
        sc.close();
    }
}
