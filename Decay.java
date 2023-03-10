import java.util.Scanner;

public class Decay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Final Amount");
        System.out.println("2. Initial Amount");
        System.out.println("3. Constant (half-life)");
        System.out.print("Find: ");
        int choice = sc.nextInt();

        double initialAmount = 0, finalAmount = 0, elapsedYears = 0, constant = 0;
        switch (choice) {
            case 1: 
                System.out.print("Enter initial amount: ");
                initialAmount = sc.nextDouble();
                System.out.print("Enter constant (half-life): ");
                constant = sc.nextDouble();
                System.out.print("Enter elapsed time in years: ");
                elapsedYears = sc.nextDouble();
                finalAmount = calculateFinalAmount(initialAmount, constant, elapsedYears);
                System.out.println("Final amount: " + finalAmount);
                break;
            case 2:
                System.out.print("Enter final amount: ");
                finalAmount = sc.nextDouble();
                System.out.print("Enter constant (half-life): ");
                constant = sc.nextDouble();
                System.out.print("Enter elapsed time in years: ");
                elapsedYears = sc.nextDouble();
                initialAmount = calculateInitialAmount(finalAmount, constant, elapsedYears);
                System.out.println("Initial amount: " + initialAmount);
                break;
            case 3:
                System.out.print("Enter initial amount: ");
                initialAmount = sc.nextDouble();
                System.out.print("Enter final amount: ");
                finalAmount = sc.nextDouble();
                System.out.print("Enter elapsed time in years: ");
                elapsedYears = sc.nextDouble();
                constant = calculateConstant(initialAmount, finalAmount, elapsedYears);
                System.out.println("Constant (half-life): " + constant);
                break;
            default:
                System.out.println("Invalid choice.");
        }   
        sc.close();
    }
    public static double calculateFinalAmount(double initialAmount, double constant, double elapsedYears) {
        return initialAmount * Math.exp(-constant * elapsedYears);
    }
    public static double calculateInitialAmount(double finalAmount, double constant, double elapsedYears) {
        return finalAmount / Math.exp(-constant * elapsedYears);
    }
    public static double calculateConstant(double initialAmount, double finalAmount, double elapsedYears) {
        return -(Math.log(finalAmount/initialAmount))/elapsedYears;
    }
    
}