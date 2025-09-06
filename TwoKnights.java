import java.util.Scanner;

public class TwoKnights {
    public static long twoKnightss(long k){
        long k2 = k * k;
        long totalWays = k2 * (long)(k2 - 1) / 2;
        long attackWays = 4 * (long)(k - 1) * (k - 2);
        long finalWays = (long)(totalWays - attackWays);
        return finalWays;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        for (int i = 1; i <= n; i++){
            System.out.println(twoKnightss(i));
        }
        sc.close();
    }
}
/*you can run it using only: 
javac -d bin TwoKnights.java
java -cp bin TwoKnights
*/