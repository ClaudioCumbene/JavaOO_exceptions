package entities;

import exceptions.BusinessException;

public class Account {
	
	private Integer number;
	private String hold;
	private Double balance;
	private Double WithdrawLimit;
	
	public Account() {
		
	}

	public Account(Integer number, String hold, Double balance, Double withdrawLimit) {
		this.number = number;
		this.hold = hold;
		this.balance = balance;
		WithdrawLimit = withdrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHold() {
		return hold;
	}

	public void setHold(String hold) {
		this.hold = hold;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getWithdrawLimit() {
		return WithdrawLimit;
	}

	public void deposit(Double amount) {
		balance+=amount;
	}
	
	public void withdraw(Double amount) {
		validatWithdraw(amount);
		balance-= amount;
	}
	
	private void validatWithdraw(double amount) {
		if (amount > getWithdrawLimit()) {
			throw new BusinessException("Withdraw error: The amount exceeds withdraw limit");
		}
		
		if(amount > getBalance()) {
			throw new BusinessException("Withdraw error: Not enough balance");
		}
	}
	
	
	
	

}
