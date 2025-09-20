import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AppleDivision {
    public static long appleDivision(int n, long[] weights) {
        long total = 0;
        for (long x : weights) total += x;

        long best = Long.MAX_VALUE;
        int totalSubsets = 1 << n;

        for (int mask = 0; mask < totalSubsets; mask++) {
            long subset = 0;
            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0) {
                    subset += weights[i];
                }
            }
            long diff = Math.abs(total - 2L * subset);
            if (diff < best) best = diff;
        }
        return best;
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        StringTokenizer st = new StringTokenizer(br.readLine());
        long[] weights = new long[n];
        for (int i = 0; i < n; i++) weights[i] = Long.parseLong(st.nextToken());

        System.out.println(appleDivision(n, weights));
    }
}

/*you can run it using only:
javac -d bin AppleDivision.java
java -cp bin AppleDivision
*/