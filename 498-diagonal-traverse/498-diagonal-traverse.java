class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if (mat == null || mat.length == 0) return new int[0]; 
        int rows = mat.length;
        int cols = mat[0].length;
        int dir = 1;
        int[] result = new int[rows*cols];
        int i = 0;
        int r = 0;
        int c = 0;
        while (i < rows*cols) {
            result[i] = mat[r][c]; 
            //if going up
            if (dir == 1) {
                if (c == cols - 1) {
                    r++; dir = -1;
                } else if (r == 0) {
                    c++; dir = -1;
                } else {
                    r--; c++;
                }
            } else {//going down
                if (r == rows - 1) {
                    c++; dir = 1;
                } else if (c == 0) {
                    r++; dir = 1;
                } else {
                    r++; c--;
                }
            }
            i++;
        }
        return result;
    }
}