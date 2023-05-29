package javaProject;

public class JRocket implements JSpaceShip {
	 private int cost;
	    protected int weight;
	    protected int maxWeight;
	    private double launchExplosionChance;
	    private double landingCrashChance;
		
	

	public JRocket(int cost, int weight, int maxWeight) {
		super();
		this.cost = cost;
		this.weight = weight;
		this.maxWeight = maxWeight;
	}
	@Override
	public boolean launch() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean land() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean canCarry(JItem jItem) {
		if( weight + jItem.getWeight() <= maxWeight) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void carry(JItem jItem) {
		weight += jItem.getWeight();
		
	}
	public int getCost() {
		return cost;
	}

}
