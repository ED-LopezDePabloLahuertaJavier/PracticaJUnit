package dam;

public class MyCalculator {
    public int add(int a, int b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Negatiu no permès");
        }
        return a + b;
    }

    public int sub(int a, int b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Negatiu no permès");
        }
        return a - b;
    }

    public int mul(int a, int b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Negatiu no permès");
        }
        return a * b;
    }

    public int div(int a, int b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Negatiu no permès");
        }
        if (b == 0 || a == 0) {
            throw new ArithmeticException("Divisió per zero");
        }
        return a / b;
    }
}
