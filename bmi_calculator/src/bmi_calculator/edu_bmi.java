/*
 * This program serves as a solution to a task created to serve as a bootcamp question for students at a Bootcamp institution.
 * Basic instruction for students:
 * - Create a program that calculate the Body Mass Index (BMI) of the user.
 * - Ask the user to enter his/her height and weight.
 * - Any measurement system - Imperial (e.g. feet, inches and pounds) or Metric(e.g. meters and kilograms) can be used.
 * - Use your own initiative regarding the methods used to calculate the BMI.
 * - This program should however include at least 1 basic math method from the Java Math Class.
 * - Also create at least one method that determine whether the BMI of a person falls in a specific category.
 * - Call the method in the main method. 
 */

package bmi_calculator;

import java.util.Scanner;

public class edu_bmi {

	public static void main(String[] args) {
		
		// Declaring local variables.
		float weight;
		float height;
		float bmi;
	    float roundBmi;
			    
		Scanner input = new Scanner(System.in);
				
		// Getting user input
		System.out.print("Enter your weight(KG):  ");
	    weight = input.nextFloat();
				
		   System.out.print("Enter you height(CM): ");
		height = input.nextFloat();
		        
		// This is the BMI method to calculate the body mass index (BMI).
	    // The addition of "100*100" accounts for centimeter(cm) to meter(m) conversion.
		bmi = (100*100*weight)/(height*height);
		        
		// New variable "roundBmi: Method to round the bmi variable to 2 decimal places 
		roundBmi = (float) (Math.round(bmi * 100.0)/100.0);
		   System.out.println(roundBmi + "\n");
		
		//Calling Method
		Bmigrouping(bmi);
		        
		        
	    }
		// Method to determine in which category an user falls
    private static void Bmigrouping(float bmi) {
				
				
		if(bmi < 18.5) {
		   System.out.println("Underweight!");
		}else if (bmi < 25.0) {
		   System.out.println("Weight is normal");
		}else if (bmi < 30.0) {
		   System.out.println("Overweight");
	    }else {
			 System.out.println("Obese!");
				
		}

			
    }

		
}
 




	

	