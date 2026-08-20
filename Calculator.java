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
        double total = 0;
        int j = 0;
        double a = 0;
        double b = 0;
        while(true){
            System.out.println("Enter your operation: ");
            String res = scan.nextLine();
            String [] in = res.split(" ");    
        }
    }
}
