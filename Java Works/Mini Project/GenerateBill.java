package factory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Abstract class representing a plan
abstract class Plan {
	protected double rate; // Rate for the plan

	// Abstract method to get the rate of the plan
	abstract void getRate();

	// Method to calculate the bill based on the number of units
	public void calculateBill(int units) {
		System.out.println(units * rate);
	}
}

// Concrete subclass representing a Domestic plan
class DomesticPlan extends Plan {
	// Method to set the rate for a Domestic plan
	public void getRate() {
		rate = 3.50; // Setting the rate for a Domestic plan
	}
}

// Concrete subclass representing a Commercial plan
class CommercialPlan extends Plan {
	// Method to set the rate for a Commercial plan
	public void getRate() {
		rate = 7.50; // Setting the rate for a Commercial plan
	}
}

// Concrete subclass representing an Institutional plan
class InstitutionalPlan extends Plan {
	// Method to set the rate for an Institutional plan
	public void getRate() {
		rate = 5.50; // Setting the rate for an Institutional plan
	}
}

// Factory class to get instances of different plans
class GetPlanFactory {
	// Method to get an instance of a plan based on the plan type
	public Plan getPlan(String planType) {
		if (planType == null) {
			return null;
		}
		if (planType.equalsIgnoreCase("DOMESTICPLAN")) {
			return new DomesticPlan(); // Returning an instance of DomesticPlan
		} else if (planType.equalsIgnoreCase("COMMERCIALPLAN")) {
			return new CommercialPlan(); // Returning an instance of CommercialPlan
		} else if (planType.equalsIgnoreCase("INSTITUTIONALPLAN")) {
			return new InstitutionalPlan(); // Returning an instance of InstitutionalPlan
		}
		return null;
	}
}

public class GenerateBill {
	public static void main(String[] args) throws IOException {
		GetPlanFactory planFactory = new GetPlanFactory(); // Creating an instance of GetPlanFactory

		// Getting user input for plan name and number of units
		System.out.print("Enter the name of plan for which the bill will be generated: ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String planName = br.readLine();
		System.out.print("Enter the number of units for bill will be calculated: ");
		int units = Integer.parseInt(br.readLine());

		// Getting the appropriate plan instance from the factory
		Plan p = planFactory.getPlan(planName);

		// Calculating and printing the bill amount
		System.out.print("Bill amount for " + planName + " of " + units + " units is: ");
		p.getRate(); // Setting the rate for the plan
		p.calculateBill(units); // Calculating the bill amount
	}
}
