package Poker.model;

public class Card {
  
  //想係俾人new  / like enum 特性
  //每次派5隻牌 from random ()
  //arrayList 裝5隻牌
  //花式 + 2- 10 / A / K / Q / J < - creat enum

  private Rank rank;
  private Deck deck;
  private Suit suit;

  private Suit (Rank rank, Deck deck, Suit suit) {
    this.rank = rank;
    this.deck = deck;
    this.suit = suit;
  }

  
}
