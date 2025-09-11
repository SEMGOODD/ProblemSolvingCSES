public class PalindromeReorder {
    public static String palindromeReorder(int n,String str) {
        int count[] = new int[26];
        for (int i = 0; i < n; i++) {
            count[str.charAt(i) - 'a']++;
        }
        int oddCount = 0;
        for (int i = 0; i < 26; i++) {
            if (count[i] % 2 != 0) {
                oddCount++;
            }
        }
        if (oddCount > 1) {
            return "NO SOLUTION";
        }
        StringBuilder firstHalf = new StringBuilder();
        StringBuilder middle = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            if (count[i] % 2 != 0) {
                middle.append((char) (i + 'a'));
                count[i]--;
            }
            for (int j = 0; j < count[i] / 2; j++) {
                firstHalf.append((char) (i + 'a'));
            }
        }
        String secondHalf = firstHalf.reverse().toString();
        return firstHalf.reverse().toString() + middle.toString() + secondHalf;
    }
    public static void main(String[] args) {
        String str = "aaaabbbbcc";
        int n = str.length();
        System.out.println(palindromeReorder(n, str));
    }
}

/*you can run it using only:
javac -d bin PalindromeReorder.java
java -cp bin PalindromeReorder
*/