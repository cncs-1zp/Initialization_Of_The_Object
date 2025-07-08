
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mall m1 = new Mall();
		m1.mall_name = "DLF";
		m1.s2.name = "Gupta Shop";
		m1.s2.s1.brand = "ZARA";
		m1.s2.s1.size = 32;
		m1.s2.s1.price = 212.4;

		System.out.println("mall name:" + m1.mall_name);
		System.out.println("shop name:" + m1.s2.name);
		System.out.println("brand name:" + m1.s2.s1.brand);
		System.out.println("size of the shirt:" + m1.s2.s1.size);
		System.out.println("price os the shirt is:" + m1.s2.s1.price);
	}

}
