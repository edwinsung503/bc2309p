package Poker.model;

public class Deck {
  // 1個deck 有幾多牌
  //牌睇下有幾多張牌
  private Card [] cards;

  public Deck (boolean withJoker) {
    int size = withJoker ? 54 : 52;
    cards = new Card[size] ;//create card size to 52/54
    int i = 0;
    for (Rank rank: Rank.values()){
      if (rank != rank.JOKER_1 && rank !=rank.JOKER_2) {
        for (Suit suit: Suit.values()) {
          cards[i++] =  new Card (rank,suit);
        }
      }
    }
    if (withJoker) {
      cards[i++] = new Card (Rank.JOKER_1,null);
      cards[i++] = new Card (Rank.JOKER_2,null);
    }
  }


  public static Deck of(boolean withJoker){
    return new Deck(withJoker);
  }

  public static Deck withJoker() {
    return of(true);
  }

  public static Deck withoutJoker() {
    return of(false);
  }
}
