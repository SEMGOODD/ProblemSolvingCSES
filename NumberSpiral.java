import java.util.Scanner;

public class NumberSpiral {
    public static long numberSpirall(int y, int x){
        long max = Math.max(y,x);
        long maxSquare = max * (long)max;
        if (max%2 == 0){
            if (y==max){
                return maxSquare - x + 1;
            } else {
                return (max-1L)*(long)(max-1L) + y;
            }
        }else{
            if (x==max){
                return maxSquare - y + 1;
            } else {
                return (max-1L)*(long)(max-1L) + x;
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i=0; i<t; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println(numberSpirall(y, x));
        }
        sc.close();
    }
}
/*you can run it using only: 
javac -d bin NumberSpiral.java
java -cp bin NumberSpiral
*/
