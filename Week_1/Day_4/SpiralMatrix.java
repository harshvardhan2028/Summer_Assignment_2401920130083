package Week_1.Day_4;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {

        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;
        List<Integer> res = new ArrayList<>();

        while (startRow <= endRow && startCol <= endCol) {
            for (int j = startCol; j <= endCol; j++) {
                res.add(matrix[startRow][j]);
            }
            for (int i = startRow + 1; i <= endRow; i++) {
                res.add(matrix[i][endCol]);
            }
            if (startRow < endRow) {
                for (int j = endCol - 1; j >= startCol; j--)
                    res.add(matrix[endRow][j]);
            }

            if (startCol < endCol) {
                for (int i = endRow - 1; i > startRow; i--)
                    res.add(matrix[i][startCol]);
            }
            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
        return res;
    }
}

