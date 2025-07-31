import java.util.*;
public class AlmostAllDivisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            List<Long> a = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                a.add(sc.nextLong());
            }
            Collections.sort(a);
            long x = a.get(0) * a.get(a.size() - 1);
            List<Long> divisors = new ArrayList<>();
            for (long i = 2; i * i <= x; ++i) {
                if (x % i == 0) {
                    divisors.add(i);
                    if (i != x / i) {
                        divisors.add(x / i);
                    }
                }
            }
            Collections.sort(divisors);
            boolean equal = (divisors.size() == a.size());
            if (equal) {
                for (int i = 0; i < a.size(); i++) {
                    if (!a.get(i).equals(divisors.get(i))) {
                        equal = false;
                        break;
                    }
                }
            }
            System.out.println(equal ? x : -1);
        }
    }
}
