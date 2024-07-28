public class Customer extends Account {
	float wallet;
	String[] wishlist = {"Iphone", "T-Shirt", "Laptop"};

	Customer()
	{

	}
	Customer(String name, int age)
	{
		super(name, age);
	}
}
