class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        int top = 0;
        int bottom = n - 1;

        while (top <= bottom) {
            int midrow = top + (bottom - top) / 2;
            if (target > matrix[midrow][m - 1]) {
                top = midrow + 1;
            } else if (target < matrix[midrow][0]) {
                bottom = midrow - 1;
            } else {
                break;
            }
        }

        if (top > bottom) {
            return false;
        }

        int row = top + (bottom - top) / 2;

        int l = 0, r = m - 1;

        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (target == matrix[row][mid]) {
                return true;
            }else if (target > matrix[row][mid]) {
                l = mid + 1;
            } else{
                r= mid-1;
            }
        }

        return false;
    }
}
