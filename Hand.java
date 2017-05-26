import java.util.ArrayList;

public class Hand {
  
  private ArrayList<Card> cardsInHand;
  private int cardValue;
  private Suit suit;
  private Rank rank;
  private int handValue;

  Deck deck = new Deck();
 
  public Hand() {
    this.cardsInHand = new ArrayList<Card>();
    this.cardValue  = cardValue;
    this.suit = suit;
    this.rank = rank;
    this.handValue  = handValue;
  }

  // // Model answer method to calculate number 
  // // of cards - for MVP only one needed
  // public int numberOfCards() {
  //   if (null == card) {
  //     return 0;
  //   } else {
  //     return 1;
  //   }
  // }

  public void addCardToHandFromDeck() {
    Card newCard = deck.dealRandomCard();
    cardsInHand.add(newCard); 
  }

  public int HandSize() {
    return cardsInHand.size();
  }

  public void setCardDetails() {
    for (Card card:cardsInHand) {
      this.suit = card.getSuit();
      this.rank = card.getRank();
      this.cardValue = card.getValue(rank);
    }
  }
 
  public Suit getCardSuit() {
    return this.suit;  
  }

  public Rank getCardRank() {
    return this.rank;  
  }

  public int getCardValue() {
    return this.cardValue;  
  }
  
}