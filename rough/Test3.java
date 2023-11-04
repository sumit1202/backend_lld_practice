package rough;
public class Test3 {

    public static void main(String[] args) {
        System.out.println(solve(2,27));
    }

    static long M = 1000000007;
    public static int solve(int a, int b) {
        long ans = 0;
        ans = pow(a%M, fact(b), M)%M;
        return (int) ans;
    }

    // factorial fn
    public static long fact(long num) {
        if (num == 0) return 1;
        long res = (num%M * fact(num - 1)%M)%M;
        return res%M;
    }

    // power fn
    public static long pow(long a, long n, long M) {

        // Base cases
        if (a == 0) return 0;
        if (n == 0) return 1;

        // If n is even
        long y;
        if (n % 2 == 0) {
            y = pow(a, n / 2, M)%M;
            y = (y%M * y%M) % M;
        }

        // If n is odd
        else {
            y = a % M;
            y = (y%M * pow(a, n - 1, M) % M) % M;
        }

        return (y + M) % M;
    }
}
