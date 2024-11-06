package challenges;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MatrixTransposeTest {

    @Test
    public void transpose() {
        MatrixTranspose matrixTranspose = new MatrixTranspose();

        int[][] transposed = matrixTranspose.transpose(new int[][] {{0,1,2}, {1,0,0}});
        assertTrue(Arrays.deepEquals(transposed, new int[][]{{0,1},{1,0},{2,0}}));

        transposed = matrixTranspose.transpose(new int[][] {{0,1},{1,1},{2,2},{3,4}});
        assertTrue(Arrays.deepEquals(transposed, new int[][]{{0,1,2,3},{1,1,2,4}}));
    }

}