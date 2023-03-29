package findGreaterNumber;

public class GreaterNumber {
	int n1, n2, n3;

	void findGreaterNumber() {
		if (n1 > n2) {
			if (n1 > n3) {
				System.out.println("Greater number is: " + n1);
			} else {
				System.out.println("Greater number is: " + n3);
			}

		} else {
			if (n2 > n3) {
				System.out.println("Greater number is: " + n2);

			} else {
				System.out.println("Greater number is: " + n3);
			}
		}
	}
}
