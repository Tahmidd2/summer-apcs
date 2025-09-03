public class Tester {
    public static void main(String[] args) {
        int[] nthPrimeInput = { 0, 1, 2, 3, 10, 25, 100, 219, 3293 };
        int[] expected      = { 2, 3, 5, 7, 31, 101, 547, 1373, 30509 };

        for (int i = 0; i < nthPrimeInput.length; i++) {
            int actual = nthPrime(nthPrimeInput[i]);
            if (actual == expected[i]) {
                System.out.println("pass");
            } else {
                System.out.println("fail expected " + expected[i] + ", but value returned was " + actual);
            }
        }
    }

    public static boolean isPrime(int x) {
        if (x < 2) {
            return false;
        }

        for (int i = 2; i <= x - 1; i++) {
            if (x % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static int nthPrime(int n) {
        int nthCount = 0;
        int nthNum = 0;

        for (int i = 2; nthCount <= n; i++) {
            if (isPrime(i)) {
                nthNum = i;
                nthCount++;
            }
        }

        return nthNum;
    }
}
