public class IncreasingArray {
    public static int increasingArrayy(int[] array, int n) {
        int ops = 0;
        for (int i = 1; i < n; i++) {
            if (array[i] < array[i - 1]) {
                ops += array[i - 1] - array[i];
                array[i] = array[i - 1];
            }
        }
        return ops;
    }
    public static void main(String[] args) {
        int[] array = {3, 2, 5, 1, 7};
        System.out.println(increasingArrayy(array, 5));
    }
}

/*you can run it using only: 
javac -d bin IncreasingArray.java
java -cp bin IncreasingArray
*/