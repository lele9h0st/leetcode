package easy;

public class IslandPerimeter463 {
    public int islandPerimeter(int[][] grid) {
        int n = grid.length;
        int block = 0;
        for (int i = 0; i < n; i++) {
            int count = 0;
            int prevBlock = 0;
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1 && prevBlock == 1) {
                    count++;
                } else if (grid[i][j] == 1 && prevBlock == 0) {
                    count = 1;
                    block++;
                } else if (grid[i][j] == 0 && prevBlock == 1) {
                    count = 0;
                }
                prevBlock = grid[i][j];
            }

        }
        for (int i = 0; i < grid[0].length; i++) {
            int count = 0;
            int prevBlock = 0;
            for (int j = 0; j < n; j++) {
                if (grid[j][i] == 1 && prevBlock == 1) {
                    count++;
                } else if (grid[j][i] == 1 && prevBlock == 0) {
                    count = 1;
                    block++;
                } else if (grid[j][i] == 0 && prevBlock == 1) {
                    count = 0;
                }
                prevBlock = grid[j][i];
            }
        }
        return block * 2;
    }

    public int islandPerimeter2(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int result = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) {
                    if (i == 0) {
                        result++;
                    } else if (grid[i - 1][j] == 0) {
                        result++;
                    }

                    if (i == n - 1) {
                        result++;
                    } else if (grid[i + 1][j] == 0) {
                        result++;
                    }
                    if (j == 0) {
                        result++;
                    } else if (grid[i][j - 1] == 0) {
                        result++;
                    }

                    if (j == m - 1) {
                        result++;
                    } else if (grid[i][j + 1] == 0) {
                        result++;
                    }
                }

            }
        }
        return result;
    }
}
