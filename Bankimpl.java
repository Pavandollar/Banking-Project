package Com;

public class Bankimpl implements Bank
{
     private int balance;
     
	public Bankimpl(int balance) 
	{
		
		this.balance = balance;
	}

	@Override
	public void deposit(int amt) 
	{
    System.out.println("depositing rs."+amt);		
		balance=balance+amt;
		System.out.println("amount deposited succesfully");
	}

	@Override
	public void withdraw(int amt) 
	{
		if(amt<=balance)
		{
		balance-=amt;
		System.out.println("amout withdrawn succesfully");
		}
		else 
		{
			try {
				throw new Exa1("insufficent balance");
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
	}

	@Override
	public int checkbal() 
	{
		return balance;
		
	}

}