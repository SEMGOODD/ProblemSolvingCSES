public class DynamicFib {
    public static long DynamicFibb(int n){
        long dp [] = new long[n+1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i<n+1 ;i++){
            dp[i]= dp[i-1] + dp[i-2];
        }

        return dp[n];
    }
    public static void main(String[] args) {
        System.out.println(DynamicFibb(70));
    }
}
/*you can run it using only: 
javac -d bin DynamicFib.java
java -cp bin DynamicFib
*/