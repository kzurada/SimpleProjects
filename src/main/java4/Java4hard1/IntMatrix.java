package Java4hard1;

import java.util.Arrays;
import java.util.Random;

public class IntMatrix implements Matrix {
    private final int rows;
    private final int columns;
    private final int[][] matrix;

    public IntMatrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.matrix = new int[rows][columns];
        initialize();
    }

    private void initialize() {
        for (int i = 0; i < this.rows; i++) {
            Arrays.fill(this.matrix[i], 0);
        }
    }

    @Override
    public void randomize() {
        Random random = new Random();
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++) {
                this.matrix[i][j] = random.nextInt();
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

    public void set(int row, int column, int value) {
        this.matrix[row][column] = value;
    }

    public int get(int row, int column) {
        return this.matrix[row][column];
    }

    @Override
    public Matrix sum(Matrix m) {
        if (this.rows != m.rows() || this.columns != m.columns()) {
            System.out.println("Rozmiary macierzy nie zgadzają się!");
            return null;
        }
        IntMatrix result = new IntMatrix(this.rows, this.columns);
        IntMatrix other = (IntMatrix)m;
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
        IntMatrix result = new IntMatrix(this.rows, m.columns());
        IntMatrix other = (IntMatrix)m;
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < other.columns(); j++) {
                int res = 0;
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
