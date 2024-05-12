import java.util.Arrays;
// Fill a Matrix with 0
class Matriz0 {
    static void Ceros(int[][] mat){
        int m = mat.length;
        int n = mat[0].length;
        boolean hayCeros = false;

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(mat[i][j] == 0){
                    hayCeros = true;
                    break;
                }
            }
        }

        if (hayCeros) {
            for(int i = 0; i < m; i++){
                Arrays.fill(mat[i], 0);
            }
            System.out.println("La matriz contiene al menos un cero:");
            imprimir(mat, m, n);
        } else {
            System.out.println("La matriz no contiene ceros.");
        }
    }

    static void imprimir(int[][] mat, int row, int col){
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
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
        Ceros(mat);

        // Test Case 2
        int[][] newMat = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
        };
        Ceros(newMat);

        // Test Case 3
        int[][] noBi = {
            {1, 2, 3},
            {4, 5, 6},
        };
        Ceros(noBi);
    }
}
