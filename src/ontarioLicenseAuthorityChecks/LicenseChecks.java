package ontarioLicenseAuthorityChecks;

public class LicenseChecks {
	String licenseType;
	int age;
	void license() {
		if(age<16) {
			System.out.println("License will not be issued");
		}else
		{
			if(licenseType=="G1") {
				System.out.println("Person will get G2 license");
			}else
			{
				if(licenseType=="G2") {
					System.out.println("Person will get G license");
				}else
				{// if person has no license
					if(licenseType=="null") {
						
					}
					System.out.println("Person will get G1 license");
				}
			}
		}
	}
}
