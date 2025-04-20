import java.util.*;

public class Matrix {

    // Search an element in matrix
    public static void search(int matrix[][], int key) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("Found at cell (" + i + ", " + j + ")");
                    return;
                }
            }
        }
        System.out.println("Key not found");
    }

    // Finds largest element in matrix
    public static int largest(int matrix[][]) {
        int l = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (l < matrix[i][j]) {
                    l = matrix[i][j];
                }
            }
        }
        return l;
    }

    //Finds smallest element in matrix
    public static int smallest(int matrix[][]) {
        int s = Integer.MAX_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (s > matrix[i][j]) {
                    s = matrix[i][j];
                }
            }
        }
        return s;
    }

    // Prints Transpose of matrix
    public static void transpose(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrix [][] = new int[3][3];
        //Input
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        //Output
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        //Search element
        search(matrix, 5);

        //Largest element
        System.out.println(largest(matrix));

        //Smallest element
        System.out.println(smallest(matrix));

        //Transpose
        transpose(matrix);


    }
}
