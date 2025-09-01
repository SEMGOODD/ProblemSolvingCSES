public class ClosestNumber {
    public static int ClosestNumberr(int n, int m){
        if (m == 0){
            return n;
        }
        int q = n/m;
        int c1 = q*m;
        int c2 = (q+1)*m;
        if (Math.abs(n-c1) < Math.abs(n-c2) ){
            return c1;
        }
        else{
            return c2;
        }
    }
    public static void main(String[] args) {
        System.out.println(ClosestNumberr(13, 4));
        System.out.println(ClosestNumberr(-15, 6));
        System.out.println(ClosestNumberr(12, 0));
    }
}

/*you can run it using only: 
javac -d bin ClosestNumber.java
java -cp bin ClosestNumber
*/