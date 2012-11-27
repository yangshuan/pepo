package com.olol.nn;

public class ActivationFunctions {
	//TANH 

	public static double tanh(double weighted_sum) {
		double output = (Math.exp(weighted_sum*2.0)-1.0)/(Math.exp(weighted_sum*2.0)+1.0);
		return output;
	}


	//SIGMOID or called Logistic in Model Builder
	public static double logistic(double weighted_sum) {
		double output = 1.0 / (1.0 + Math.exp(-1.0 * weighted_sum));
		return output;
	}


	//testing
	public static void main(String[] args){
		for(double i=-3;i<=3;i+=0.5){
			System.out.println("TANH for "+i+": "+ActivationFunctions.tanh(i));
			//System.out.println("java's TANH for "+i+": "+Math.tanh(i));
		}
			System.out.println("TANH for 0: "+ActivationFunctions.tanh(0));


		for(double i=-3;i<=3;i+=0.5){
			System.out.println("SIGMOID for "+i+": "+ActivationFunctions.logistic(i));
		}

			System.out.println("SIGMOID for 0:" +ActivationFunctions.logistic(0));
	}
}
