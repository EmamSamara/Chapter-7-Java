package q1;

public class BankTest {

	public static void main(String[] args) {

		
		
		
		
		
		account checkAccount =new checking();
		account savingsAcccount =new savings();
		

	
		checkAccount.setBalance(1500);
		DoIt(checkAccount,1800);
		
		checkAccount.deposit(300);
		DoIt(checkAccount,900);

		DoIt(checkAccount,400);

		
		
		
		
		
	//	savingsAcccount.deposit(300);
		//savingsAcccount.withdraw(100);
		//System.out.println(savingsAcccount.toString());

	
	}

	public static void DoIt(account a,double amount){
		
	if(a instanceof checking){
		System.out.println("a is a checking account");
		((checking) a).withdraw1(amount);
System.out.println(a.toString());		
	}else if(a instanceof savings){
		System.out.println("a is a savings account");
((savings) a).withdraw2(amount);
System.out.println(a.toString());		
	}
		
	}
	
}
