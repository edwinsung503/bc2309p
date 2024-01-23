package com.javahongkong.bootcamp.exercise;

import java.math.BigDecimal;

public abstract class Account implements AccountInterface {
	private AccountHolder accountHolder;
	private Long accountNumber;
	private int pin;
	private double balance;

	protected Account(AccountHolder accountHolder, Long accountNumber, int pin, double startingDeposit) {
		// complete the constructor
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
		this.pin = pin;
		this.balance = startingDeposit;
	}

	public AccountHolder getAccountHolder() {
		// complete the function
		return this.accountHolder;
		//return null;
	}
	
	public boolean validatePin(int attemptedPin) {
		// complete the function
		if (attemptedPin == pin) {
			return true;
		} else {
				return false;
		}
	}

	public double getBalance() {
		// complete the function
		return this.balance;
		//return -1.0;
	}

	public double getPin() {
		// complete the function
		return this.pin;
		//return -1.0;
	}

	public Long getAccountNumber() {
		// complete the function
		return this.accountNumber;
	}

	public void creditAccount(double amount) {
		// complete the function
		// BigDecimal
		this.balance += BigDecimal.valueOf(amount).doubleValue();
	}

	public boolean debitAccount(double amount) {
		// complete the function
		if (this.balance < amount){
			return false ;
		}
		this.balance -= BigDecimal.valueOf(amount).doubleValue();
		return true;
	}
}
