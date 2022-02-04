class Solution {
    Queue<int[]> q;
    int orig;
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if (image == null || image.length == 0 || newColor == image[sr][sc]) return image;
        orig = image[sr][sc];
        q = new LinkedList<>();
        q.add(new int[]{sr, sc});
        bfs(image, sr, sc, newColor);
        return image;
    }
    
    public void bfs(int[][] image, int sr, int sc, int newColor) {
        int dirs[][] = {{0, 1}, {0, -1}, {1,0 }, {-1, 0}};
        while(!q.isEmpty()) {
            int[] cell = q.poll();  
            image[cell[0]][cell[1]] = newColor;
            for(int[] dir : dirs) {
                int r = dir[0] + cell[0];
                int c = dir[1] + cell[1];
                if (r >= 0 && r < image.length && c < image[0].length && c >= 0 && image[r][c] ==  orig) {
                    image[r][c] = newColor;
                    q.add(new int[]{r,c});
                }
            }
        }
    }
}