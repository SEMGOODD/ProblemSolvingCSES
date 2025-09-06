import java.util.*;

public class TwoSets {
    public static void twoSets(int n) {
        if (n % 4 == 1 || n % 4 == 2) {
            System.out.println("NO");
        }

        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();

        if (n % 4 == 0) {
            for (int i = 1; i <= n / 4; i++) {
                l1.add(i);
                l1.add(n-i+ 1);
            }
            for (int i = n / 4 + 1; i <=n - n / 4; i++) {
                l2.add(i);
            }
        }
        else if (n % 4 == 3) {
            l1.add(1);
            l1.add(2);
            l2.add(3);
            for (int i = 4; i <= (n + 1) / 4 + 2; i++) {
                l1.add(i);
                l1.add(n - i + 4);
            }
            for (int i = (n + 1) / 4 + 3; i <= n - (n + 1) / 4 + 1; i++) {
                l2.add(i);
            }
        }
        System.out.println("YES");
        System.out.println(l1.size());
        printLine(l1);
        System.out.println(l2.size());
        printLine(l2);
    }

    private static void printLine(List<Integer> list){
        StringBuilder sb = new StringBuilder();
        for (int x : list) sb.append(x).append(' ');
        System.out.println(sb.toString().trim());
    }

    public static void main(String[] args) {
        twoSets(11);
    }
}
/*
 * you can run it using only:
  javac -d bin TwoSets.java
  java -cp bin TwoSets
 */