package discount;

public class TotalDiscount {
	String promoCode;

	void discount() {
		if (promoCode == "Promo5") {
			System.out.println("Total discount is 55%");
		} else if (promoCode == "Promo10") {
			System.out.println("Total discount is 60%");
		} else if (promoCode == "Promo20") {
			System.out.println("Total discount is 70%");

		} else
			System.out.println("Total discount is 50%");

	}
}