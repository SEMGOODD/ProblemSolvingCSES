public class WeirdAlgorithm {
    public static void WeirdAlgorithmm(int n){
        System.out.print(n + " "); // print first number
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = n * 3 + 1;
            }
            System.out.print(n + " ");
        }
    }
    public static void main(String[] args) {
        WeirdAlgorithmm(6);
        WeirdAlgorithmm(19);
    }
}

/*you can run it using only: 
javac -d bin WeirdAlgorithm.java
java -cp bin WeirdAlgorithm
*/