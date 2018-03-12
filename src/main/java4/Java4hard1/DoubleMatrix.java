package Java4hard1;

import java.util.Arrays;
import java.util.Random;

public class DoubleMatrix implements Matrix {
    private final int rows;
    private final int columns;
    private final double[][] matrix;

    public DoubleMatrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.matrix = new double[rows][columns];
        initialize();
    }

    private void initialize() {
        for (int i = 0; i < this.rows; i++) {
            Arrays.fill(this.matrix[i], 0.0);
        }
    }

    @Override
    public void randomize() {
        Random random = new Random();
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++) {
                this.matrix[i][j] = random.nextDouble() * 100;
            }
        }
    }

    @Override
    public int rows() {
        return this.rows;
    }

    @Override
    public int columns() {
        return this.columns;
    }

    public void set(int row, int column, double value) {
        this.matrix[row][column] = value;
    }

    public double get(int row, int column) {
        return this.matrix[row][column];
    }

    @Override
    public Matrix sum(Matrix m) {
        if (this.rows != m.rows() || this.columns != m.columns()) {
            System.out.println("Rozmiary macierzy nie zgadzają się!");
            return null;
        }
        DoubleMatrix result = new DoubleMatrix(this.rows, this.columns);
        DoubleMatrix other = (DoubleMatrix)m;
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++) {
                result.set(i, j, this.get(i, j) + other.get(i, j));
            }
        }
        return result;
    }

    @Override
    public Matrix multiply(Matrix m) {
        if (this.columns != m.rows()) {
            System.out.println("Rozmiary macierzy nie zgadzają się!");
            return null;
        }
        DoubleMatrix result = new DoubleMatrix(this.rows, m.columns());
        DoubleMatrix other = (DoubleMatrix)m;
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < other.columns(); j++) {
                double res = 0.0;
                for (int k = 0; k < this.columns; k++) {
                    res += this.get(i, k) * other.get(k, j);
                }
                result.set(i, j, res);
            }
        }
        return result;
    }

    @Override
    public void print() {
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++) {
                System.out.print(this.matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
