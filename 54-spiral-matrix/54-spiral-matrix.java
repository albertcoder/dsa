class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int T = 0; int B = m - 1; int L = 0; int R = n - 1;
        ArrayList<Integer> result = new ArrayList<>();
        while (L <= R && T <= B) {
            //top row
            // if (L <= R) {
                for (int i = L; i <= R; i++ ) {
                    result.add(matrix[T][i]);
                }
            // }
            T++;
            // if (T <= B) {
                //right column
                for (int i = T; i <= B; i++) {
                    result.add(matrix[i][R]);
                }
            // }
            R--;
            if (T <= B) {
                //bottom row
                for (int i = R; i >= L; i--) {
                    result.add(matrix[B][i]);
                }
            }
            B--;
            
            if (L <= R) {
                for (int i = B; i >= T; i--) {
                    result.add(matrix[i][L]);
                }   
            }
            L++;
        }
        return result;
    }
}