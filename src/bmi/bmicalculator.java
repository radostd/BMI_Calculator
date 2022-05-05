package bmi;

import java.util.Scanner;

public class bmicalculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		methods.printintro();
		double index = methods.getbmi(scan);
		String status = methods.getStatus(index);
		System.out.print("enter serial number: ");
		int sernum = Integer.parseInt(scan.nextLine());
		methods.reportresults(sernum, index, status);
		
	}
	

}
