package challenges;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MatrixTransposeTest {

    @Test
    public void transpose() {
        checkTranspose(new int[][] {{0,1,2}, {1,0,0}}, new int[][]{{0,1},{1,0},{2,0}});
        checkTranspose(new int[][] {{0,1},{1,1},{2,2},{3,4}}, new int[][]{{0,1,2,3},{1,1,2,4}});
    }

    static void checkTranspose(int[][] matrix, int[][] expected) {
        MatrixTranspose matrixTranspose = new MatrixTranspose();

        print(matrix);
        int[][] transposed = matrixTranspose.transpose(matrix);
        print(transposed);
        System.out.println();
        assertTrue(Arrays.deepEquals(transposed, expected));
    }

    static void print(int[][] matrix) {
        System.out.print('[');
        for (int[] rows : matrix) {
            System.out.print('[');
            for (int j = 0; j < rows.length - 1; j++) {
                System.out.print(rows[j]);
                System.out.print(',');
            }
            if (matrix[0].length > 0) {
                System.out.print(rows[rows.length - 1]);
            }
            System.out.print(']');
        }
        System.out.println(']');
    }

}