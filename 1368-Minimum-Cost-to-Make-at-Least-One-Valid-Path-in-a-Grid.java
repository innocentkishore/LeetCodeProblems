import java.util.*;

class Solution {
    public int minCost(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        boolean[][] vis = new boolean[n][m];
        int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        pq.offer(new int[]{0, 0, 0}); // {cost, row, col}

        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int d = curr[0], r = curr[1], c = curr[2];
            if (vis[r][c]) continue;
            vis[r][c] = true;
            if (r == n - 1 && c == m - 1) return d;
            int dir = grid[r][c] - 1;
            int nr = r + directions[dir][0];
            int nc = c + directions[dir][1];
            if (isValid(nr, nc, n, m, vis)) {
                pq.offer(new int[]{d, nr, nc});
            }
            for (int i = 0; i < 4; i++) {
                if (i == dir) continue;
                nr = r + directions[i][0];
                nc = c + directions[i][1];
                if (isValid(nr, nc, n, m, vis)) {
                    pq.offer(new int[]{d + 1, nr, nc});
                }
            }
        }
        return -1;
    }

    private boolean isValid(int r, int c, int n, int m, boolean[][] vis) {
        return r >= 0 && c >= 0 && r < n && c < m && !vis[r][c];
    }
}