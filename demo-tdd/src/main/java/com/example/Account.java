package com.example;

public class Account {
 
  private int balance ;

  public Account(int balance) {
    this.balance = balance;
  }

  public boolean credit (int amount){
    this.balance += amount;
    return false;
  }

  public boolean debit (int amount){
    if (this.balance < amount) {
      return false;
    }
    this.balance -= amount;
    return true;
  }

  public int getBalance (){
    return this.balance;
  }

}
