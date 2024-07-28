public class Account {
	int	id;
	int	age;
	String name;
	
	Account()
	{
		this.id = (int)(Math.random() * 10000);
		this.name = "NULL";
		this.age = 0;
	}

	Account(String name, int age)
	{
		this.id = (int)(Math.random() * 10000);
		this.name = name;
		this.age = age;
	}

	static void print_accounts(Account[] accs)
	{
		for (Account acc : accs)
			System.out.println("id: " + acc.id + "\tname: " + acc.name + "\tage: " + acc.age);
	}
}
