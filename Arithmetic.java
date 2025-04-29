=public class Arithmetic{
    public static void main(String[] args) {
    
        double num1 = 10.0;
        double num2 = 0.0;

        double addition = num1 + num2;
        double multiplication = num1 * num2;
        double subtraction = num1 - num2;

       
        if (num2 != 0) {
            double division = num1 / num2;
            System.out.println("Division: " + division);
        } else {
            System.out.println("Division: Cannot divide by zero.");
        }

    
        System.out.println("Addition: " + addition);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Subtraction: " + subtraction);
    }
}
