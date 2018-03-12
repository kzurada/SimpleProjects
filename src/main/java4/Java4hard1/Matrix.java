package Java4hard1;

public interface Matrix {
    int rows();
    int columns();
    void randomize();
    Matrix sum(Matrix m);
    Matrix multiply(Matrix m);
    void print();
}
