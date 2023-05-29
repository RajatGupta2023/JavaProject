package javaProject;

import java.util.List;

public class JProjectMainClass {

	public static void main(String[] args) {
		JSimulationClass simulation = new JSimulationClass();
		//Load Items
		List<JItem> jItems = simulation.loadItems();
		
	List<JRocket>R1Rockets =	simulation.loadU1(jItems);
	List<JRocket>R2Rockets=	simulation.loadU2(jItems);
	int r1Cost = simulation.runSimulation(R1Rockets);
	int r2Cost = simulation.runSimulation(R2Rockets);
	
	System.out.println("Cost for using rockets R1 in Million $"+ r1Cost);
	System.out.println("Cost for using rockets R2 in Million $"+ r2Cost);
//	int numberOfR1Rockets = R1Rockets.size();
//	int numberOfR2Rockets = R2Rockets.size();
//	System.out.println(numberOfR1Rockets +"\n" + numberOfR2Rockets);
		
	}

}
