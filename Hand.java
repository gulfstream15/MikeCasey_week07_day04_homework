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
    this.suit = suit;
    this.rank = rank;
    this.cardValue  = cardValue;
    this.handValue  = handValue;
    this.handSize = handSize;
  }

  public void buildHand() {
    System.out.println("*************About to add card to hand**************** ");
    this.handValue = 0;
    Card newCard = deck.dealRandomCard();
    this.cardsInHand.add(newCard); 
    // System.out.println("in buildHand method: ");
    for (Card card:cardsInHand) {
      this.suit = card.getSuit();
      System.out.println("suit in class is: " +this.suit);
      this.rank = card.getRank();
      System.out.println("rank in class is: " +this.rank);
      this.cardValue = card.getValue(rank);
      // System.out.println("cardValue in class is: " +this.cardValue);
      this.handValue = this.handValue + this.cardValue;
    }
    // System.out.println("handValue in class is: " +this.handValue);
    System.out.println("++++++++++++++++Card Added to Hand++++++++++++++++++");
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

  public int getHandSize() {
    this.handSize = cardsInHand.size();
    return this.handSize;
  }
  
}