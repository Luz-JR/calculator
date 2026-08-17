import java.util.Scanner;
public class Calculator{
    public static double add(double a, double b){
        return a + b;
    }
    public static double substract(double a, double b){
        return a - b;
    }
    public static double multiply( double a, double b){
        return a * b;
    }
    public static double divide(double a, double b){
        if(b == 0){
            System.out.println("Error");
            return 0;
        }
        return a / b;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String r = "Result: ";
        while(true){
            System.out.println("Enter first number: ");
            double a = scan.nextDouble();
            System.out.println("Enter operator (+, -, *, /): ");
            String operator = scan.next();
            System.out.println("Enter second number: ");
            double b = scan.nextDouble();
            if (operator.equals("+")){
                System.out.println(r + add(a,b));
            } else if(operator.equals("-")){
                System.out.println(r + substract(a,b));
            } else if(operator.equals("*")){
                System.out.println(r + multiply(a,b));
            } else if(operator.equals("/")){
                System.out.println(r + divide(a,b));
            }else{ System.out.println("Invalid Operation");}
            System.out.println("Do you want to continue? (yes/no)");
            String ans = scan.next();
            if(ans.equals("no")){
                break;
            }

        }
        }
}