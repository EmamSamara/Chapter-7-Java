package q1;

import java.util.Date;

public class checking extends account{
	
	private static double overDraft=500;
	
	public  void withdraw1(double amount){
		if (getBalance()+overDraft >= amount){
			setBalance(getBalance()-amount);
		}else{
			System.out.println("over draft WITHDRAW Failed");
		}
	}
	public void overDraftLimit(){
		System.out.println("over Draft Limit is :"+overDraft);
	}
}