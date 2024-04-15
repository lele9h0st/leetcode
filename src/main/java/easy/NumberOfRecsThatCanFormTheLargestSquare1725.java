package easy;

public class NumberOfRecsThatCanFormTheLargestSquare1725 {
    public static int countGoodRectangles(int[][] rectangles) {
        int maxLength = 0;
        int maxLengthCount = 0;
        for (int i = 0; i < rectangles.length; i++) {
            int width = rectangles[i][0];
            int height = rectangles[i][1];
            int cutSize = 0;
            if (width < height) {
                cutSize = width;
            } else {
                cutSize = height;
            }
            if (maxLength == cutSize) {
                maxLengthCount++;
            } else if (maxLength < cutSize) {
                maxLengthCount = 1;
                maxLength = cutSize;
            }
        }
        return maxLengthCount;
    }

    public static void main(String[] args) {
        int[][] a = {{2, 3}, {3, 7}, {4, 3}, {3, 7}};
        System.out.println(countGoodRectangles(a));
    }
}
