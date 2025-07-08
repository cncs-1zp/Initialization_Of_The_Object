package Initialization_by_Non_Static_Method;

public class Mall {
	String mall_name;
	Shop s2 = new Shop();

	public void initialize() {
		this.mall_name = "DLF Noida";
		this.s2.name = "Gupta Shop";
		this.s2.s1.brand = "ZARA";
		this.s2.s1.size = 32;
		this.s2.s1.price = 212.4;
	}

	public void displayDetails() {
		System.out.println("mall name:" + mall_name);
		System.out.println("shop name:" + s2.name);
		System.out.println("brand name:" + s2.s1.brand);
		System.out.println("size of the shirt:" + s2.s1.size);
		System.out.println("price os the shirt is:" + s2.s1.price);
	}
}
