class Solution {
    public int[] sumZero(int n) {
        if (n == 1) return new int[]{0};
        int[] result = new int[n];
        for (int i = 1; i < n/2 + 1; i++) {
            result[i - 1] = i;
            result[n - i] = -i;
        }
        if (n % 2 == 1) {
            result[n/2] = 0;
        }
        return result;
    }
}