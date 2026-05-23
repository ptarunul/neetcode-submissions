class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] res = new int[n];

        for (int i = 0; i < n; i++) {
            int j = i + 1;

            while (j < n && temperatures[j] <= temperatures[i]) {
                j++;
            }

            if (j < n) {
                res[i] = j - i;
            } else {
                res[i] = 0;
            }
        }

        return res;
    }
}
