package methodsAndConstructors.ClassWork;

import java.util.Random;

public class Matrix {
    private int rows;
    private int columns;
    private int[][] matrix;

    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        matrix = generateMatrix(rows,columns);
    }

    private int[][] generateMatrix(int rows, int columns) {
        final int[][] matrix = new int[rows][columns];

        for (int r = 0; r < rows; r++){
            for (int c = 0; c < columns; c++) {
                matrix[r][c] = new Random().nextInt(9);
            }
        }
        return matrix;
    }

    void print(){
        for (int r = 0; r < rows; r++){
            for (int c = 0; c < columns; c++){
                System.out.print(matrix[r][c] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Matrix(2,5).print();
    }
}
