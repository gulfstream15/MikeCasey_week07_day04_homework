import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.*;

public class HandTest {

  Hand hand;
  Deck deck;
  Card card;

  @Before
  public void before() {
    hand = new Hand (); 
    deck = new Deck();
    card = new Card(); 
  }

  @Test
    public void handStartsEmpty() {
    assertEquals(0, hand.getHandSize());
  }

  // @Test
  // public void handHasSize() {
  //   deck = new Deck();
  //   hand.buildHand();
  //   //hand.addCardToHandFromDeck();
  //   //hand.SetHandDetails();
  //   int handSize = hand.getHandSize();
  //   assertNotNull(handSize); 
  // }

  // @Test
  // public void cardHasSuit() {
  //   hand.buildHand();
  //   // hand.addCardToHandFromDeck();
  //   // hand.SetHandDetails();
  //   Suit suit = hand.getCardSuit();
  //   assertNotNull(suit);
  // }

  // @Test
  // public void cardHasRank() {
  //   hand.buildHand();
  //   // hand.addCardToHandFromDeck();
  //   // hand.SetHandDetails();
  //   Rank rank = hand.getCardRank();
  //   assertNotNull(rank);
  // }

  // @Test
  // public void cardHasValue() {
  //   hand.buildHand();
  //   // hand.addCardToHandFromDeck();
  //   // hand.SetHandDetails();
  //   int cardValue = hand.getCardValue();
  //   assertNotNull(cardValue); 
  // }

  @Test
  public void handHasValue() {
    System.out.println("+++++++++++++Game Starts++++++++++++++");
    hand.buildHand();
    hand.buildHand();
    hand.buildHand();
    hand.buildHand();
    // hand.buildHand();
    // hand.buildHand();
    // hand.addCardToHandFromDeck();
    // hand.addCardToHandFromDeck();
    // hand.addCardToHandFromDeck();
    // hand.SetHandDetails();
    int handSize = hand.getHandSize();
    int handValue = hand.getHandValue();
    assertNotNull(handValue); 
  }


}
