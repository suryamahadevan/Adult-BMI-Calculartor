import java.util.Scanner;

public class BMI_Calculator {
	
	// Results method 
	public static void results(double BMI) {
		System.out.println("Your BMI is " + Math.round(BMI));
		if (BMI < 18.5) {
			System.out.println("You are underweight!");
		} else if (BMI >= 18.5 && BMI <= 24.9) {
			System.out.println("You are at a healthy weight!");
		} else if (BMI > 24.9 && BMI < 30) {
			System.out.println("You are overweight!");
		} else if (BMI > 30) {
			System.out.println("You are obese!");
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner BMIInputs = new Scanner(System.in);

		// Age
		System.out.println("Please enter your age"); 
		double a = BMIInputs.nextDouble();
		if (a < 18) {
			System.out.println("You are too young for this calculator");
			System.exit(0);
		} else {
			System.out.println("You are " + a + " years old");
		}
		
		// Metric/Imperial Selection
		
		System.out.println(
				"Enter \"1\" to use the Metric BMI calculator or enter \"2\" to use the Imperial BMI calculator");
		while (true) {
			String numberOne;
			int choice = BMIInputs.nextInt();
			if (choice == 1) {
				// Height Metric
				System.out.println("Please enter your height in centimeters");
				double h = BMIInputs.nextDouble();
				System.out.println("Your height is " + h + " centimeters");

				// Weight Metric
				System.out.println("Please enter your weight in kilograms");
				double w = BMIInputs.nextDouble();
				System.out.println("Your weight is " + w + " kilograms");

				// Calculating BMI Metric
				double hMeters = h / 100;
				double hExponet = Math.pow(hMeters, 2);
				double BMI = w / hExponet;

				// Results Metric
				results(BMI);
				
				System.out.println(
						"Press \"1\" to use the Metric BMI Calculator again or press \"2\" to use the Imperial BMI Calculator");

			} else if (choice == 2) {
				// Height Imperial
				System.out.println("Please enter your height in inches");
				double hImperial = BMIInputs.nextDouble();
				System.out.println("Your height is " + hImperial + " inches!");

				// Weight Imperial
				System.out.println("Please enter your weight in pounds");
				double wImperial = BMIInputs.nextDouble();
				System.out.println("Your weight is " + wImperial + " pounds!");

				// Calculating BMI Imperial
				double hImperialExponet = Math.pow(hImperial, 2);
				double ImperialBMIPart1 = wImperial / hImperialExponet;
				double ImperialBMIPart2 = 703 * ImperialBMIPart1;
				double BMI = ImperialBMIPart2;

				// Results Imperial
				
				results(BMI);
				
				System.out.println(
						"Press \"2\" to use the Imperial BMI Calculator again or press \"1\" to use the Metric BMI Calculator");

			} else if (choice != 1 && choice != 2) {
				System.out.println("\"" + choice
						+ "\" is not a valid response. Please enter either \"1\" for Metric or \"2\" for Imperial");
			}
		}
	}
}
