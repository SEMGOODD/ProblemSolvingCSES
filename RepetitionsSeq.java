public class RepetitionsSeq {
    public static int generateSequence(String seq) {
        if (seq == null || seq.isEmpty()) return 0;

        int count = 1;
        int maxCount = 1;

        for (int i = 1; i < seq.length(); i++) {
            if (seq.charAt(i) == seq.charAt(i-1)) {
                count++;
            } else{
                count = 1;
            }
            maxCount = Math.max(maxCount, count);
        }
        return maxCount;
    }
    public static void main(String[] args) {
        String seq = "ATTCGGGA";
        int result = generateSequence(seq);
        System.out.println("The length of the longest repetition is: " + result);
    }
}
/*you can run it using only: 
javac -d bin RepetitionsSeq.java
java -cp bin RepetitionsSeq
*/