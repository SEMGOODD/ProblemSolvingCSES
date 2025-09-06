import java.util.*;

public class Permutations {
    public static void permutations(int n){
        if (n == 1){
            System.out.println(1);
            return;
        }
        if (n == 2 || n == 3){
            System.out.println("NO SOLUTION");
            return;
        }

        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();

        for (int i = 1; i <= n; i++){
            if (i % 2 == 0){
                even.add(i);
            } else {
                odd.add(i);
            }
        }

        for (int num : even){
            System.out.print(num + " ");
        }
        for (int num : odd){
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        permutations(n);
        sc.close();
    }
}
/*you can run it using only: 
javac -d bin Permutations.java
java -cp bin Permutations
*/