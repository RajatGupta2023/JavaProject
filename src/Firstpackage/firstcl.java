package Firstpackage;

public class firstcl {
	
	String brandName;
	
	int modelNumber;
	
	String operatingSystem;
	
	int ram;
	
	int storageCapacity;
	
	boolean isCameraPresent;
	
	void makeCall() {
		System.out.println("making calls from "+ brandName +" mobile");
	}
	
	void sendText() {
		System.out.println("sending text from "+ brandName +" mobile");
	}
	
	void takePhoto() {
		System.out.println("Photo can be taken if camera is present. Camera is present: "+isCameraPresent);
	}
	
}

