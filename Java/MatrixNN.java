// To rotate a N x M matrix by 90 degrees in clockwise direction

class MatrixNN {
    static void rotateMatrix(int[][] matriz) {
        int m = matriz[0].length;
        int n = matriz.length;
        int[][] newMat = new int[m][n];
 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                newMat[j][n - i - 1] = matriz[i][j];
            }
        }
        matriz = newMat;
        displayMatrix(matriz);
    }
 
    // Function to print the matrix
    static void displayMatrix(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(mat[i][j] + " ");
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

        // Test Case 1
        int[][] noBi = {
            {1, 2, 3},
            {4, 5, 6},
        };
        rotateMatrix(noBi);
    }  
}