import java.util.*;

public class CreatingStrings {
    static TreeSet<String> permutations = new TreeSet<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        sc.close();

        char[] arr = s.toCharArray();
        boolean[] used = new boolean[arr.length];
        Arrays.sort(arr);
        backtrack(arr, used, new StringBuilder());

        System.out.println(permutations.size());
        for (String p : permutations) {
            System.out.println(p);
        }
    }

    static void backtrack(char[] arr, boolean[] used, StringBuilder sb) {
        if (sb.length() == arr.length) {
            permutations.add(sb.toString());
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if (used[i]) continue;
            used[i] = true;
            sb.append(arr[i]);
            backtrack(arr, used, sb);
            sb.deleteCharAt(sb.length() - 1);
            used[i] = false;
        }
    }

}

/*you can run it using only:
javac -d bin CreatingStrings.java
java -cp bin CreatingStrings
*/