package com.example;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.is;

public class AccountTest {
  
  private Account account;

  @BeforeEach
  void init () {
    account = new Account(0);
  }

  @Test
  void testCredit(){
    
    // 20 -30 -> return false - > 唔可以扣錢
    //credit -> 10 
    assertThat(account.credit(10), is(true));
    assertThat(account.getBalance(), is(10));
    //credit -> 10 + 20
    assertThat(account.credit(20), is(true));
    assertThat(account.getBalance(), is(30));
  }

  @Test
  void testDebit(){
    //credit -> 12 - 10 
    assertThat(account.credit(12), is(true));
    assertThat(account.debit(10), is(true));
    assertThat(account.getBalance(), is(2));
    //credit -> 2 -3 
    assertThat(account.debit(3), is(false));
    assertThat(account.getBalance(), is(2));
  }
}
