//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

// Position this line where user code will be pasted.

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] grid = new int[n][m];

            for (int i = 0; i < n; i++) {

                for (int j = 0; j < m; j++) {
                    grid[i][j] = sc.nextInt();
                }
            }

            Solution ob = new Solution();
            int ans = ob.countDistinctIslands(grid);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    class Pair {
        int r, c;

        Pair(int r, int c) {
            this.r = r;
            this.c = c;
        }
    }

    int countDistinctIslands(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] visited = new int[n][m];

        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (visited[i][j] == 0 && grid[i][j] == 1) {
                    StringBuilder shape = new StringBuilder();
                    dfs(i, j, visited, grid, shape, i, j);
                    set.add(shape.toString());
                }
            }
        }
        return set.size();
    }

    void dfs(int i, int j, int[][] visited, int[][] grid, StringBuilder shape, int row0, int col0) {
        visited[i][j] = 1;
        int n = grid.length;
        int m = grid[0].length;

        int[] drow = { -1, 0, 1, 0 };
        int[] dcol = { 0, -1, 0, 1 };

        for (int x = 0; x < 4; x++) {
            int row = i + drow[x];
            int col = j + dcol[x];

            if (row >= 0 && row < n && col >= 0 && col < m && visited[row][col] == 0 && grid[row][col] == 1) {
                shape.append((row - row0) + "," + (col - col0) + ";");
                dfs(row, col, visited, grid, shape, row0, col0);
            }
        }
    }
}
