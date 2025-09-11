public class trailingZeros {
    public static long factorialDP(int n){
        long dp [] = new long[n+1];
        dp[0] = 1;
        for (int i = 1; i < n+1; i++){
            dp[i] = dp[i-1] * i;
        }
        return dp[n];
    }
    public static int countTrailingZeros(int n){
        long fact = factorialDP(n);
        int count = 0;
        while (fact % 10 == 0){
            count++;
            fact /= 10;
        }
        return count;
    }
    public static void main(String[] args){
        System.out.println(factorialDP(20));
        System.out.println(countTrailingZeros(20));
    }
}
/*you can run it using only: 
javac -d bin trailingZeros.java
java -cp bin trailingZeros
*/