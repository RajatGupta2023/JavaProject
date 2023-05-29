package javaProject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import marsProject.Item;
import marsProject.R1;

public class JSimulationClass {
	public List<JItem> loadItems() {

		List<JItem> items = new ArrayList<>();

		try (BufferedReader reader = new BufferedReader(new FileReader("C:/Users/16477/Desktop/Java/phase1.txt"))) {
			String line;
			while ((line = reader.readLine()) != null) {
				String[] string = line.split("=");

				String name = string[0];
				int weight = Integer.parseInt(string[1]);
				items.add(new JItem(name, weight));

			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		return items;
	}

	List<JRocket> loadU1(List<JItem> items) {
		List<JRocket> rockets = new ArrayList<JRocket>();
		JR1 rocket = new JR1(100, 10000, 18000);
		for (JItem item : items) {
			if (!rocket.canCarry(item)) {
				rockets.add(rocket);
				rocket = new JR1(100, 10000, 18000);
			} else {
				rocket.carry(item);
			}
		}
		rockets.add(rocket);
		return rockets;

	}

	List<JRocket> loadU2(List<JItem> items) {
		List<JRocket> rockets = new ArrayList<JRocket>();
		JR2 rocket = new JR2(120, 18000, 29000);
		for (JItem item : items) {
			if (!rocket.canCarry(item)) {
				rockets.add(rocket);
				rocket = new JR2(120, 18000, 29000);
			} else {
				rocket.carry(item);
			}
		}
		rockets.add(rocket);
		return rockets;
	}

	int runSimulation(List<JRocket> rockets) {
		int totalPrice = 0;
		for (JRocket rocket : rockets ) {
			totalPrice += rocket.getCost();
			while(! rocket.land() || ! rocket.launch()) { //if land or launch is unsuccessful 
				totalPrice += rocket.getCost();
			}
		}
		return totalPrice;
	}
}
