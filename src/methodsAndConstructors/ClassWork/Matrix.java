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

    public void setValue(int row, int column, int value){
        this.matrix[row][column] = value;
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    int[] getRow(int index){
        int[] result = new int[matrix[index].length];
        for (int i = 0; i < matrix[index].length; i++){
            result[i] = matrix[index][i];
        }
        return result;
    }

    int[] getColumn(int index){
        int[] result = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++){
            result[i] = matrix[i][index];
        }
        return result;
    }

    public static int[][] addMatrices(Matrix m1, Matrix m2){
        if (m1.columns != m2.columns || m1.rows != m2.rows){
            System.out.println("Matrices:");
            m1.print();
            System.out.println("and");
            m2.print();
            System.out.println("can not be added.");
            return null;
        }
        int[][] result = new int[m1.rows][m1.columns];
        for (int i = 0; i < m1.rows; i++){
            for (int j = 0; j < m1.columns; j++){
                result[i][j] = m1.matrix[i][j] + m2.matrix[i][j];
            }
        }
        return result;
    }

    void print(){
        for (int r = 0; r < rows; r++){
            for (int c = 0; c < columns; c++){
                System.out.print(matrix[r][c] + " ");
            }
            System.out.println();
        }
    }

    void printIntArray(int[] input){
        for (int i = 0; i < input.length; i++){
            System.out.print(input[i] + " ");
        }
    }

    static void printMatrix(int[][] matrix){
        if (matrix == null){
            System.out.println("Nothing to print!");
            return;
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] multiplyMatrices(Matrix matrix1, Matrix matrix2){
        if (!canBeMultiplied(matrix1, matrix2)) {
            return null;
        }
        int[][] result = new int[matrix1.columns][matrix2.rows];
        for (int i = 0; i < result.length; i++){
            for (int j = 0; j < result[i].length; j++){
                int[] matrix1row = matrix1.getColumn(i);
                int[] matrix2column = matrix2.getRow(j);
                for (int k = 0; k < matrix1row.length; k++){
                    result[i][j] += matrix1row[k] * matrix2column[k];
                }
            }
        }
        return result;
    }

    public static int[][] multiplyMatricesV2(Matrix matrix1, Matrix matrix2){
        if (!canBeMultiplied(matrix1, matrix2)) {
            return null;
        }
        int[][] result = new int[matrix1.columns][matrix2.rows];
        int sum = 0;
        for (int i = 0; i < result.length; i++){
            for (int j = 0; j < result[i].length; j++){
                for (int k = 0; k < matrix1.rows; k++){
                    sum += matrix1.matrix[k][i] * matrix2.matrix[j][k];
                }
                result[i][j] = sum;
                sum = 0;
            }
        }
        return result;
    }

    private static boolean canBeMultiplied(Matrix matrix1, Matrix matrix2) {
        if (matrix1.rows != matrix2.columns) {
            System.out.println("Matrices:");
            matrix1.print();
            System.out.println("and");
            matrix2.print();
            System.out.println("can not be multiplied.");
            return false;
        } else {
            return true;
        }
    }


    public static void main(String[] args) {
        createSumAndPrint();

        createMultiplyAndPrint();
    }

    private static void createMultiplyAndPrint() {
        Matrix m1 = new Matrix(3,4);
        Matrix m2 = new Matrix(5,3);
        System.out.println("The first matrix is:");
        m1.print();
        System.out.println("The second matrix is:");
        m2.print();
        System.out.println("The multiplied matrix is:");
        Matrix.printMatrix(Matrix.multiplyMatrices(m1,m2));
        System.out.println("The multiplied matrixV2 is:");
        Matrix.printMatrix(Matrix.multiplyMatricesV2(m1,m2));
    }

    private static void createSumAndPrint() {
        Matrix m1 = new Matrix(4,5);
        Matrix m2 = new Matrix(4,5);
        System.out.println("The first matrix is:");
        m1.print();
        System.out.println("The second matrix is:");
        m2.print();
        System.out.println("The summed matrix is:");
        Matrix.printMatrix(Matrix.addMatrices(m1,m2));
    }
}
