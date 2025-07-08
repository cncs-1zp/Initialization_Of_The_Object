package Initialization_by_Constructor;

public class Fruit {
String fruit_name;
double price;

Fruit(String name,double price){
this.fruit_name=name;
this.price=price;

}
public void test() {
	System.out.println("this is a test method ");
}

public void displayDetails() {
	System.out.println("fruit name is:"+fruit_name);
	System.out.println("price of fruit is:"+price);
}
}
