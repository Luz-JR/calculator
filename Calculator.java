import java.util.Scanner;

public class Calculator {
    public static double add(double a, double b){
        return a + b;
    }

    public static double substract(double a, double b){
        return a - b;
    }

    public static double multiply(double a, double b){
        return a * b;
    }

    public static double divide(double a, double b){
        if(b == 0){
            throw new IllegalArgumentException("Cannot divide by zero.");
        }
        return a / b;
    }

    public static double squareRoot(double number) {
        if (number < 0) {
            throw new IllegalArgumentException("Cannot calculate the square root of a negative number.");
        }
        return Math.sqrt(number);
    }

    public static double square(double number) {
        return number * number;
    }

    public static double sine(double number) {
        return Math.sin(Math.toRadians(number));
    }

    public static double cosine(double number) {
        return Math.cos(Math.toRadians(number));
    }

    public static double tangent(double number) {
        return Math.tan(Math.toRadians(number));
    }

    public static double naturalLog(double number) {
        if (number <= 0) {
            throw new IllegalArgumentException("Natural log requires a number greater than zero.");
        }
        return Math.log(number);
    }

    public static double exponential(double number) {
        return Math.exp(number);
    }

    private static double readNumber(Scanner scan, String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scan.nextLine().trim();
            try {
                return Double.parseDouble(input);
            } catch (NumberFormatException exception) {
                System.out.println("Please enter a valid number.");
            }
        }
    }

    private static int readChoice(Scanner scan) {
        while (true) {
            System.out.print("Choose an operation: ");
            String input = scan.nextLine().trim();
            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException exception) {
                System.out.println("Please enter a valid menu number.");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Square root");
            System.out.println("6. Square");
            System.out.println("7. Sin (degrees)");
            System.out.println("8. Cos (degrees)");
            System.out.println("9. Tan (degrees)");
            System.out.println("10. Natural log");
            System.out.println("11. Exponential (e^x)");
            System.out.println("0. Exit");

            int choice = readChoice(scan);
            if (choice == 0) {
                System.out.println("Goodbye.");
                break;
            }

            try {
                double result;
                if (choice >= 1 && choice <= 4) {
                    double first = readNumber(scan, "Enter first number: ");
                    double second = readNumber(scan, "Enter second number: ");
                    if (choice == 1) {
                        result = add(first, second);
                    } else if (choice == 2) {
                        result = substract(first, second);
                    } else if (choice == 3) {
                        result = multiply(first, second);
                    } else {
                        result = divide(first, second);
                    }
                } else if (choice >= 5 && choice <= 11) {
                    double number = readNumber(scan, "Enter a number: ");
                    if (choice == 5) {
                        result = squareRoot(number);
                    } else if (choice == 6) {
                        result = square(number);
                    } else if (choice == 7) {
                        result = sine(number);
                    } else if (choice == 8) {
                        result = cosine(number);
                    } else if (choice == 9) {
                        result = tangent(number);
                    } else if (choice == 10) {
                        result = naturalLog(number);
                    } else {
                        result = exponential(number);
                    }
                } else {
                    System.out.println("Invalid option.");
                    continue;
                }
                System.out.println("Result: " + result);
            } catch (IllegalArgumentException exception) {
                System.out.println("Error: " + exception.getMessage());
            }
        }
        scan.close();
    }
}
