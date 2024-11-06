package challenges;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MatrixTranspose {
    static Logger log = LoggerFactory.getLogger(MatrixTranspose.class);

    public int[][] transpose(int[][] matrix) {
        int[][] transposed = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        log(matrix, transposed);
        return transposed;
    }

    private static void log(int[][] matrix, int[][] transposed) {
        if (!log.isInfoEnabled()) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        log(sb, "matrix", matrix);
        sb.append(' ');
        log(sb, "transposed", transposed);
        log.info(sb.toString());
    }
    private static void log(StringBuilder sb, String prefix, int[][] matrix) {
        sb.append(prefix).append("=[");
        for (int[] rows : matrix) {
            sb.append('[');
            for (int j = 0; j < rows.length - 1; j++) {
                sb.append(rows[j]).append(',');
            }
            if (matrix[0].length > 0) {
                sb.append(rows[rows.length - 1]);
            }
            sb.append(']');
        }
        sb.append(']');
    }
}