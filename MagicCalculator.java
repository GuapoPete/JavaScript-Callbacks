public class MagicCalculator extends Calculator {
    public double squareRoot(double num) {
        if (num < 0) {
            throw new IllegalArgumentException("Cannot find square root of a negative number.");
        }
        return Math.sqrt(num);
    }

    public double sin(double num) {
        return Math.sin(num);
    }

    public double cos(double num) {
        return Math.cos(num);
    }

    public double tan(double num) {
        return Math.tan(num);
    }

    public int factorial(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("Cannot find factorial of a negative number.");
        }
        if (num == 0 || num == 1) {
            return 1;
        }
        int result = 1;
        for (int i = 2; i <= num; i++) {
            result *= i;
        }
        return result;
    }
}
