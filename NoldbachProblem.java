import java.util.*;
public class NoldbachProblem {
    static final int MAX = 1005;
    static boolean[] isPrime = new boolean[MAX];
    static void sieve(int n) {
        Arrays.fill(isPrime, 0, n + 1, true);
        isPrime[0] = isPrime[1] = false;
        for (int i = 2; i * i <= n; ++i) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
    }
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sieve(n);
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= n; ++i) {
            if (isPrime[i]) {
                primes.add(i);
            }
        }
        int count = 0;
        for (int i = 0; i + 1 < primes.size(); ++i) {
            int sum = primes.get(i) + primes.get(i + 1) + 1;
            if (sum <= n && isPrime[sum]) {
                count++;
            }
        }
        System.out.println(count >= k ? "YES" : "NO");
    }
}

