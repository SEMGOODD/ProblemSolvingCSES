public class GrayCode {
    public static String[][] grayCodee(int n){
        int rows = 1 << n;
        String[][] grayCodes = new String[rows][n];

        for (int i = 0; i < rows; i++) {
            int g = i ^ (i >> 1);
            for (int b = n - 1; b >= 0; b--) {
                grayCodes[i][n - 1 - b] = (((g >> b) & 1) == 1) ? "1" : "0";
            }
        }
        return grayCodes;
    }

    public static void main(String[] args) {
        int n = 2;
        String[][] out = grayCodee(n);
        for (String[] row : out) {
            System.out.println(String.join("", row));
        }
    }
}


/*you can run it using only:
javac -d bin GrayCode.java
java -cp bin GrayCode
*/