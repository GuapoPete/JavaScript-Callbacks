public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        MagicCalculator magicCalculator = new MagicCalculator();

        int sum = calculator.add(10, 5);
        int difference = calculator.subtract(20, 8);
        int product = calculator.multiply(6, 4);
        int quotient = calculator.divide(15, 3);
        int squared = calculator.square(7);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Squared: " + squared);

        double sqrt = magicCalculator.squareRoot(25);
        double sine = magicCalculator.sin(Math.PI / 6);
        double cosine = magicCalculator.cos(Math.PI / 3);
        double tangent = magicCalculator.tan(Math.PI / 4);
        int factorial = magicCalculator.factorial(5);

        System.out.println("Square Root: " + sqrt);
        System.out.println("Sine: " + sine);
        System.out.println("Cosine: " + cosine);
        System.out.println("Tangent: " + tangent);
        System.out.println("Factorial: " + factorial);
    }
}
