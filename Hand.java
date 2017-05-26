import java.util.ArrayList;

public class Hand {
  
  private ArrayList<Card> cardsInHand;
  private String playerName;  
  private int cardValue;
  private String cardSuit;
  private String cardRank;
  private int handValue;

  Deck deck = new Deck();

  public Hand() {

  }

  // It is better to seperate out the playerName
  // into a seperate class
 
  public Hand(String playerName) {
    this.cardsInHand = new ArrayList<Card>();
    this.playerName =  playerName; 
    this.cardValue  = cardValue;
    this.cardSuit   = cardSuit;
    this.cardRank   = cardRank;
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
      this.cardSuit = card.getSuit();
      this.cardRank = card.getRank();
      this.cardValue = card.getValue(cardRank);
    }
  }

  public void setPlayerName(String newPlayer) {
     this.playerName = playerName;
  }
 
  public String getCardSuit() {
    return this.cardSuit;  
  }

  public String getCardRank() {
    return this.cardRank;  
  }

  public int getCardValue() {
    return this.cardValue;  
  }
  
  public String getPlayerName() {
    return this.playerName;  
  }
  
}