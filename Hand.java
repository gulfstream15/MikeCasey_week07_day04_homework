import java.util.ArrayList;

public class Hand {
  
  private ArrayList<Card> cardsInHand;
  private Suit suit;
  private Rank rank;
  private int cardValue;
  private int handValue;
  private int handSize;

  Deck deck = new Deck();
 
  public Hand() {
    this.cardsInHand = new ArrayList<Card>();
    this.cardValue  = cardValue;
    this.suit = suit;
    this.rank = rank;
    this.handValue  = handValue;
    this.handSize = handSize;
  }

  public void addCardToHandFromDeck() {
    Card newCard = deck.dealRandomCard();
    this.cardsInHand.add(newCard); 
  }

  public int getHandSize() {
    this.handSize = cardsInHand.size();
    // System.out.println("handsize in class is: " +this.handSize);
    return this.handSize;
  }

  public void SetHandDetails() {
    System.out.println("in calcHandValue method: ");
    for (Card card:cardsInHand) {
      this.suit = card.getSuit();
      // System.out.println("suit in class is: " +this.suit);
      this.rank = card.getRank();
      // System.out.println("rank in class is: " +this.rank);
      this.cardValue = card.getValue(rank);
      // System.out.println("cardValue in class is: " +this.cardValue);
      this.handValue = this.handValue + this.cardValue;
    }
    // System.out.println("handValue in class is: " +this.handValue);
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

  public int getHandValue() {
    return this.handValue;
  }
  
}