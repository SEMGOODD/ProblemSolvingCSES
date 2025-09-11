import java.util.Scanner;
//using modular exponentiation
public class BitStrings {
    static final long MOD = 1000000007;
    public static long bitStrings(long base, long exp, long mod){
        long a = 1;
        base %= mod;
        while (exp > 0){
            if ((exp & 1) == 1){
                a = (a * base) % mod;
            }
            base =(base * base) % mod;
            exp >>= 1;
        } 
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(bitStrings(2, n, MOD));
        sc.close();
    }
}
/*you can run it using only: 
javac -d bin BitStrings.java
java -cp bin BitStrings
*/