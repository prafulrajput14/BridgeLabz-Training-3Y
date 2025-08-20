import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take user inputs
        System.out.print("Enter weight (in kg): ");
        double weight = sc.nextDouble();

        System.out.print("Enter height (in cm): ");
        double heightCm = sc.nextDouble();

        double heightM = heightCm / 100.0;

        double bmi = weight / (heightM * heightM);

        System.out.printf("Your BMI is: %.2f\n", bmi);
        if (bmi < 18.4) {
            System.out.println("Status: Underweight");
        } else if (bmi >= 18.4 && bmi < 24.9) {
            System.out.println("Status: Normal weight");
        } else if (bmi >= 25 && bmi < 39.9) {
            System.out.println("Status: Overweight");
        } else {
            System.out.println("Status: Obese");
        }

        sc.close();
    }
}
