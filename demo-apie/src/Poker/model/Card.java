package Poker.model;

public class Card {
  
  //想係俾人new  / like enum 特性
  //每次派5隻牌 from random ()
  //arrayList 裝5隻牌
  //花式 + 2- 10 / A / K / Q / J < - creat enum

  private Rank rank;
  private Suit suit;

  public Card (Rank rank, Suit suit) {
    this.rank = rank;
    this.suit = suit;
  }

  public Rank getRank() {
    return this.rank;
  }

  public void setRank(Rank rank) {
    this.rank = rank;
  }

  public Suit getSuit() {
    return this.suit;
  }

  public void setSuit(Suit suit) {
    this.suit = suit;
  }

  
}
