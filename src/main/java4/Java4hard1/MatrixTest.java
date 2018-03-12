package Java4hard1;

public class MatrixTest {
    public static void main(String[] args) {
        Matrix m1 = new DoubleMatrix(3, 4);
        m1.randomize();
        Matrix m2 = new DoubleMatrix(3, 4);
        m2.randomize();
        Matrix m3 = new DoubleMatrix(4, 3);
        m3.randomize();

        System.out.println("M1=");
        m1.print();
        System.out.println("M2=");
        m2.print();
        System.out.println("M3=");
        m3.print();
        System.out.println("M1+M2=");
        Matrix m4 = m1.sum(m2);
        if (m4 != null) {
            m4.print();
        } else {
            System.out.println("Nie dało się zsumować :(");
        }
        System.out.println("M1*M3=");
        Matrix m5 = m1.multiply(m3);
        if (m5 != null) {
            m5.print();
        } else {
            System.out.println("Nie dało się przemnożyć :(");
        }

        Matrix m6 = new IntMatrix(2, 3);
        m6.randomize();
        Matrix m7 = new IntMatrix(2, 3);
        m7.randomize();
        Matrix m8 = new IntMatrix(3, 2);
        m8.randomize();

        System.out.println("==============");
        System.out.println("M6=");
        m6.print();
        System.out.println("M7=");
        m7.print();
        System.out.println("M8=");
        m8.print();
        System.out.println("M6+M7=");
        Matrix m9 = m6.sum(m7);
        if (m9 != null) {
            m9.print();
        } else {
            System.out.println("Nie dało się zsumować :(");
        }
        System.out.println("M6*M8=");
        Matrix m10 = m6.multiply(m8);
        if (m10 != null) {
            m10.print();
        } else {
            System.out.println("Nie dało się przemnożyć :(");
        }
    }
}
