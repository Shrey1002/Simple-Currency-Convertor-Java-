package com.shrey.example;
import java.util.*; 

public class currency_convertor {

	public static void main(String[] args) {
		double inrValue, usdValue, cadValue;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("List of currency available ");
		System.out.println("INR - for indian currency ");
		System.out.println("USD - for United States currency ");
		System.out.println("CAD - for canadian currency ");
		System.out.println("Option 1 : INR to USD");
		System.out.println("Option 2 : INR to CAD");
		System.out.println("Option 3 : USD to INR");
		System.out.println("Option 4 : USD to CAD");
		System.out.println("Option 5 : CAD to INR");
		System.out.println("Option 6 : CAD to USD");
		System.out.print("Please select from above options : ");
		int input= sc.nextInt(); 
		System.out.println("You have selected " +input);
		
		if (input <= 0 || input >=7)
		{
			System.out.println("You have entered wrong input");
		}
		else {
			switch(input) {
			case 1:
				System.out.print("Enter INR value :");
				inrValue = sc.nextFloat();
				usdValue = inrValue/78;
				System.out.println(" The USD is " + usdValue);
				break;
			case 2:
				System.out.print("Enter INR value :");
				inrValue = sc.nextFloat();
				cadValue = inrValue/60;
				System.out.println(" The CAD is " + cadValue);
				break;
			case 3:
				System.out.print("Enter USD value :");
				usdValue = sc.nextFloat();
				inrValue = usdValue*78;
				System.out.println(" The INR is " + inrValue);
				break;
			case 4:
				System.out.print("Enter USD value :");
				usdValue = sc.nextFloat();
				cadValue = usdValue*1.29;
				System.out.println(" The CAD is " + cadValue);
				break;
			case 5:
				System.out.print("Enter CAD value :");
				cadValue = sc.nextFloat();
				inrValue = cadValue*60;
				System.out.println(" The INR is " + inrValue);
				break;
			case 6:
				System.out.print("Enter CAD value :");
				cadValue = sc.nextFloat();
				usdValue = cadValue/1.29;
				System.out.println(" The USD is " + usdValue);
				break;
			}
		}
	}
}
