package easy;

public class ProjectionAreaOf3DShapes883 {
    public static int projectionArea(int[][] grid) {
        int n = grid.length;
        int result = 0;
        int[] is = new int[n];
        int[] js = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] != 0) {
                    result++;
                }
                if (grid[i][j] > is[i]) {
                    is[i] = grid[i][j];
                }
                if (grid[i][j] > js[j]) {
                    js[j] = grid[i][j];
                }
            }
        }
        for (int i = 0; i < n; i++) {
            result += is[i] + js[i];

        }
        return result;
    }
    public static void main(String[] args) {
        int[][] a = {{2, 3}, {3, 7}};
        System.out.println(projectionArea(a));
    }
}
