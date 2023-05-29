package javaProject;

import java.util.Random;

public class JR2 extends JRocket {
	public JR2(int cost, int weight, int maxWeight) {
		super(cost, weight, maxWeight);
		// TODO Auto-generated constructor stub
	}
	@Override
	public boolean launch() {
		Random random = new Random();
		double randomProbablity = random.nextDouble(); // getting random number from 0.0 to 1.0 using .nextDouble
		double probablity = 0.04 * (double) weight / maxWeight;
		if(randomProbablity > probablity) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean land() {
		Random random = new Random();
		double randomProbablity = random.nextDouble(); // getting random number from 0.0 to 1.0 using .nextDouble
		double probablity = 0.08 * (double) weight / maxWeight;
		if(randomProbablity > probablity) {
			return true;
		} else {
			return false;
		}
	}



}
