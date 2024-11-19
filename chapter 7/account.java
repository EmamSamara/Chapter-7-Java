package q1;

import java.util.Date;


public class account {

	private int id;
	private int balance;
	private Date dataCreated;
	
	
	public account(){

	}
	
	public account(int id , int balance , Date dataCreated){
		this.id=id;
		this.balance=balance;
		this.dataCreated=dataCreated;
		
	}

	public int getId(){
		return this.id;
	}
	public void setId(int id){
		this.id=id;
	}
	public int getBalance(){
		return this.balance;
	}
	public void setBalance(double d){
		this.balance=(int) d;
	}
	public Date gtDate(){
		return this.dataCreated;
	}
	public void setDate(Date dataCreated){
		this.dataCreated=dataCreated;
	}
	
	
	
	public void deposit(double amount) { 
		this.balance += amount; 
		}
	public String toString() {
		return "Account ID: " + id + ", Balance: " 
	+ balance + ", Date Created: " + dataCreated;
				}
	


	
	
	
	
	
	
}
