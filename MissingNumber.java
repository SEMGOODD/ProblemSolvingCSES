import java.util.Arrays;

public class MissingNumber{
    public static int MissingNumberr(int n, int arr[]){
        Arrays.sort(arr);
        for (int i=1; i<n; i++){
            if (arr[i-1] != i){
                return i;
            }
        }
        return n;
    }
    public static void main(String[] args){
        int arr[] = {1, 2, 4, 5, 6};
        int n = 6;
        int missing = MissingNumberr(n, arr);
        if (missing != -1) {
            System.out.println("The missing number is: " + missing);
        } else {
            System.out.println("No missing number found.");
        }
    }
}

/*you can run it using only: 
javac -d bin MissingNumber.java
java -cp bin MissingNumber
*/