public class DiagonalSum {

    //Diagonal Sum for square matrix
    public static int diagonalSum(int matrix[][]) {
        int sum = 0;
        /*  // O(n^2)
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if ((i == j) || (i + j == matrix.length - 1)) {
                    sum += matrix[i][j];
                }
            }
        }
        */

        // O(n)
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];

            if (i != matrix.length - 1 - i) {
                sum += matrix[i][matrix.length - i - 1];
            }
        }

        return sum;
    }

    // O(n)
    public static int diagonalSum2(int[][] mat) {
        // Primary diagonal
        int i = 0, j = 0, sum = 0;
        while(j < mat[0].length) {
            sum += mat[i][j];
            i++;
            j++;
        }
        // Secondary diagonal
        i = 0;
        j = mat[0].length - 1;
        while(j >= 0) {
            if(i == j)
            {
                i++;
                j--;
                continue;
            }
            sum += mat[i][j];
            i++;
            j--;
        }

        return sum;
    }
    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 3},
                          {4, 5, 6},
                          {7, 8, 9}};
        System.out.println(diagonalSum(matrix));
        System.out.println(diagonalSum2(matrix));
    }
}
