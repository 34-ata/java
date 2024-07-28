class Main
{
	public static void main(String[] args)
	{
		Account[] accs = new Account[50];

		for (int i = 0; i < 50; i++)
		{
			if (i % 2 == 0)
				accs[i] = new Manager("Manager" + i, i);
			else
				accs[i] = new Customer("Customer" + i, i);
		}
		Account.print_accounts(accs);
	}
}
