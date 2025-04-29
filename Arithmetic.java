public class Arithmetic {
    public static void main(String[] args) {
        double num1 = 10.0;
        double num2 = 0.0;

        double addition = num1 + num2;
        double multiplication = num1 * num2;
        double subtraction = num1 - num2;

        // Calculate division safely
        if (num2 != 0) {
            double division = num1 / num2;
            System.out.println("Division: " + division);
        } else {
            System.out.println("Division: Cannot divide by zero.");
        }

        // Calculate square root, power, and cube root
        double squareRootNum1 = Math.sqrt(num1);
        double squareRootNum2 = Math.sqrt(num2); // Will work even if num2 is zero
        double power = Math.pow(num1, num2);     // num1 raised to the power of num2
        double cubeRootNum1 = Math.cbrt(num1);
        double cubeRootNum2 = Math.cbrt(num2);   // Will work even if num2 is zero

        // Display results
        System.out.println("Addition: " + addition);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Square Root of num1: " + squareRootNum1);
        System.out.println("Square Root of num2: " + squareRootNum2);
        System.out.println("num1 raised to the power of num2: " + power);
        System.out.println("Cube Root of num1: " + cubeRootNum1);
        System.out.println("Cube Root of num2: " + cubeRootNum2);
    }
}
