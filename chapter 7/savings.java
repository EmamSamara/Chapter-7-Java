package q1;

public class savings extends account {
	public void withdraw2(double amount ){
		if(getBalance()>=amount){
			setBalance(getBalance() - amount);
		}
		else{
			System.out.println("there is no enough money in youre savings account WITHDRAW Failed");
		}
	}
}
