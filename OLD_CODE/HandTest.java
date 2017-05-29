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

  @Test @Ignore
  public void handHasSize() {
    deck = new Deck();
    hand.buildHand();
    int handSize = hand.getHandSize();
    assertNotNull(handSize); 
  }

  @Test @Ignore
  public void cardHasSuit() {
    hand.buildHand();
    Suit suit = hand.getCardSuit();
    assertNotNull(suit);
  }

  @Test @Ignore
  public void cardHasRank() {
    hand.buildHand();
    Rank rank = hand.getCardRank();
    assertNotNull(rank);
  }

  @Test @Ignore
  public void cardHasValue() {
    hand.buildHand();
    int cardValue = hand.getCardValue();
    assertNotNull(cardValue); 
  }

  @Test @Ignore
  public void handHasValue() {
    hand.buildHand();
    hand.buildHand();
    int handSize = hand.getHandSize();
    int handValue = hand.getHandValue();
    assertNotNull(handValue); 
  }

}
