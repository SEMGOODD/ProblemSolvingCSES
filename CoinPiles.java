public class CoinPiles {
    public static void coinPiless(int t, int[][] testCases){
        for (int i = 0; i < t; i++){
            int a = testCases[i][0];
            int b = testCases[i][1];
            if ((a + b) % 3 != 0 || Math.min(a, b) * 2 < Math.max(a, b)){
                System.out.println("NO");
            } else if ((a + b) % 3 == 0 && Math.min(a, b) * 2 >= Math.max(a, b)){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    public static void main(String[] args) {
        int t = 3;
        int[][] testCases = {
            {2, 1},
            {2, 4},
            {3, 1}
        };
        coinPiless(t, testCases);
    }
}
/*you can run it using only: 
javac -d bin CoinPiles.java
java -cp bin CoinPiles
*/