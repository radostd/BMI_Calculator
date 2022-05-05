package bmi;

import java.util.Scanner;

public class methods {
	public static void printintro() {
	System.out.println("this program measures your BMI(body mass index), based on  your weight & height");
}
	public static double getbmi(Scanner scan) {
		System.out.println("please enter your height in inches: ");
		double inches = Double.parseDouble(scan.nextLine());
		System.out.println("please enter your weight in pounds: ");
		double pounds = Double.parseDouble(scan.nextLine());
		return bmiFor(inches, pounds);
	}
	private static double bmiFor(double height, double weight) {
		// TODO Auto-generated method stub
		return (weight*703/(height*height));
	}

public static String getStatus (double index) {
	String status = "";
	if (index<=18.5) {
		status = "underweight";
	}else if (index <= 25) {
		status = "normal";
	}else if (index <=30) {
		status = "overweight";
	}else {
		status = "obese";
	}
	return status;
	}

public static void reportresults (int setnum, double bmiindex, String status) {
	System.out.printf("the person with %d number has bmi = %.2f and is %s", setnum, bmiindex, status);
}
}