package com.javahongkong.bootcamp.exercise;

import java.util.LinkedHashMap;

public class Bank implements BankInterface {
	private LinkedHashMap<Long, Account> accounts; // object reference
	

	public Bank() {
		// complete the function
		this.accounts = new LinkedHashMap<Long, Account>();
	}

	public Account getAccount(Long accountNumber) {
		// complete the function
		return accounts.get(accountNumber);
	}
	

	public Long openCommercialAccount(Company company, int pin, double startingDeposit) {
		// complete the function
		Long accountNumber = (long) (accounts.size() + 1);
		accounts.put(accountNumber, new CommercialAccount(company, accountNumber, pin, startingDeposit));
		return accountNumber;
		//return -1L;
	}

	public Long openConsumerAccount(Person person, int pin, double startingDeposit) {
		// complete the function
		Long accountNumber = (long) (accounts.size() + 1);
		accounts.put(accountNumber, new ConsumerAccount(person, accountNumber, pin, startingDeposit));
		return accountNumber;
		//return -1L;
	}

	public boolean authenticateUser(Long accountNumber, int pin) {
		// complete the function
		Account account = accounts.get(accountNumber);
		if (account != null) {
			return account.validatePin(pin);
		}
		return false;
	}

	public double getBalance(Long accountNumber) {
		// complete the function
		Account account = accounts.get(accountNumber);
		if (account != null) {
			return account.getBalance();
		}
		return -1.0;
	}

	public void credit(Long accountNumber, double amount) {
		// complete the function
		Account account = accounts.get(accountNumber);
		if (account != null) {
			account.creditAccount(amount);
		}
	}

	public boolean debit(Long accountNumber, double amount) {
		// complete the function
		Account account = accounts.get(accountNumber);
		if (account != null) {
			return account.debitAccount(amount);
		}
		return false;
	}
}
