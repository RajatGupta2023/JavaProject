package Firstpackage;

public class Firstclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		firstcl iPhone = new firstcl();
		//iPhone.brandName = "IPhone";
		//iPhone.modelNumber = 13;
		//iPhone.operatingSystem = "iOS";
		//iPhone.ram = 16;
		//iPhone.isCameraPresent = true;
		//iPhone.storageCapacity = 128;
		iPhone.makeCall();
		iPhone.sendText();
		iPhone.takePhoto();
		System.out.println("***************Aleena**********************************");
		firstcl samsung = new firstcl();
		samsung.brandName = "Samsung";
		samsung.modelNumber = 21;
		samsung.operatingSystem = "Android";
		samsung.ram = 16;
		samsung.isCameraPresent = true;
		samsung.storageCapacity = 256;
		samsung.makeCall();
		samsung.sendText();
		samsung.takePhoto();
		
	}

}
