import java.util.*;

public class TowerOfHanoi {

    static void hanoi(int n, int from, int aux, int to, StringBuilder sb) {
        if (n == 0) return;
        hanoi(n - 1, from, to, aux, sb); // move n-1 from 'from' to 'aux'
        sb.append(from).append(" -> ").append(to).append('\n'); // move largest to 'to'
        hanoi(n - 1, aux, from, to, sb); // move n-1 from 'aux' to 'to'
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of disks: ");
        int n = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        hanoi(n, 1, 2, 3, sb);

        System.out.print(sb.toString());
        sc.close();
    }
}
/*you can run it using only:
javac -d bin TowerOfHanoi.java
java -cp bin TowerOfHanoi
*/