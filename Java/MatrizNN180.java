// Rotate a Matrix by 180 degree

public class MatrizNN180 {
    static void rotateMatrix(int[][] matriz) {
        int m = matriz.length; // Número de filas
        int n = matriz[0].length; // Número de columnas

        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Test Case 1
        int[][] mat = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15},
            {16, 17, 18, 19, 20},
            {21, 22, 23, 24, 25},
        };
        rotateMatrix(mat);

        // Test Case 2
        int[][] newMat = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
        };
        rotateMatrix(newMat);

        // Test Case 3
        int[][] noBi = {
            {1, 2, 3},
            {4, 5, 6},
        };
        rotateMatrix(noBi);
    }
}


