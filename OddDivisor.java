import java.util.*;
public class OddDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t--> 0) {
            long n = sc.nextLong();
            while (n % 2 == 0) {
                n/= 2;
            }
            System.out.println(n > 1 ? "YES" : "NO");
        }
    }
}
