import java.util.ArrayList;

class BankAccountPlus
{
	private double amount;
	private ArrayList<String> 
	transactionLog = new ArrayList<String>();
	
	public void deposit(double x){
		amount += x;
		transactionLog.add("Deposit of "+x+ " euros");
	}
	
	public double withdraw(double x){
		if (x > amount){
			return 0;
		}else{
			amount -= x;
			transactionLog.add("Withdrawal of "+x+ " euros");
			return x;
		}
	}
	
	/*
	public void addInterest(){
		double interest = amount*0.05;
		amount += interest;
		transactionLog.add("Added interest "+interest+ " euros");
	}
	*/
	
	public void printStatement(){
		for (String transaction: transactionLog){
			System.out.println(transaction);
		}
		System.out.println("The balance in the account is "+amount);
	}
}

class TestBankAccountPlus
{
	public static void main(String[] args){
		BankAccountPlus myAccount = new BankAccountPlus();
		myAccount.deposit(100);
		double pocketMoney = myAccount.withdraw(50);
		myAccount.deposit(100);
		pocketMoney += myAccount.withdraw(200);
		myAccount.printStatement();
		System.out.println("Pocket money is "+pocketMoney);
	}
}