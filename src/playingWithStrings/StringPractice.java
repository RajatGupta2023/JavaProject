package playingWithStrings;

public class StringPractice {
	String citiesName[]= {"Toronto", "Ottawa", "Brampton", "Hamilton", "London", "Mississauga",  "Burlington", "Kingston", "Kitchener"} ;
	boolean findingCityName(String enteredCity) {
		for(int i=0;i<citiesName.length;i++) {
			if(citiesName[i].equals(enteredCity)) {
				return true;
			}
		}
		return false;
	}
	void findingCityNameEndingWithTon() {
		for(int i=0;i<citiesName.length;i++) {
			if(citiesName[i].endsWith("ton")) {
				System.out.println(citiesName[i]+" is ending with ton");
//				citiesName[i].replace("ton", "fun");
//				System.out.println("After replacing ton with fun "+ citiesName);
			}
		}
	}
	String address="100 queen street,Toronto,M5V 3E3 ";
	void splitingAddress() {
		String[] split = address.split(",");
		for(int i=0;i<split.length;i++) {
		System.out.println(split[i]);
		}
	}

}
