package waterTankMechanism;

import java.util.Scanner;

public class WaterTankClass {
	Scanner sc = new Scanner(System.in);

	void fillingMechanism() {
		int presentWaterLevel;
		System.out.println("Enter Current Water of Level");
		presentWaterLevel = sc.nextInt();
		while (presentWaterLevel <= 100) {

			System.out.println("Current water level:- " + presentWaterLevel);
			int capacityRemaining = 100 - presentWaterLevel;
			System.out.println("Capcity Remaining:- " + capacityRemaining);
			//System.out.println("We can add one more 10L bucket");
			presentWaterLevel = presentWaterLevel+10;
		//	System.out.println("We can add one more 10L bucket");
		}
		System.out.println("Tank is full. Please stop adding water");
	}
}
