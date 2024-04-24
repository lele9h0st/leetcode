package easy;

public class NthTribonacciNumber1137 {
    public int tribonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 1;
        }
        int[] array = new int[n + 1];
        array[0] = 0;
        array[1] = 1;
        array[2] = 1;
        for (int i = 3; i < n; i++) {
            array[i] = array[i - 1] + array[i - 2] + array[i - 3];
        }
        return array[n - 1] + array[n - 2] + array[n - 3];
    }
    public int tribonacci2(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 1;
        }
        return tribonacci2(n-1)+tribonacci2(n-2)+tribonacci2(n-3);
    }
}
