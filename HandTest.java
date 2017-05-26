import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.*;

public class HandTest {

  Hand hand;
  Deck deck;
  Card card;

  @Before
  public void before() {
    hand = new Hand ("Mike"); 
    deck = new Deck();
    card = new Card(); 
  }

  // An empty test is worth having here
  // @Test
  //   public void handStartsEmpty() {
  //   assertEquals(0, hand.numberOfCards());
  // }

  @Test
  public void playerName() {
    assertEquals("Mike", hand.getPlayerName());
  }

  @Test
  public void handHasSize() {
    deck = new Deck();
    hand.addCardToHandFromDeck();
    int handSize = hand.HandSize();
    assertNotNull(handSize); 
  }

  @Test
  public void cardHasSuit() {
    hand.addCardToHandFromDeck();
    hand.setCardDetails();
    String cardSuit = hand.getCardSuit();
    assertNotNull(cardSuit);
  }

  @Test
  public void cardHasRank() {
    hand.addCardToHandFromDeck();
    hand.setCardDetails();
    String cardRank = hand.getCardRank();
    assertNotNull(cardRank);
  }

  @Test
  public void cardHasValue() {
    hand.addCardToHandFromDeck();
    hand.setCardDetails();
    int cardValue = hand.getCardValue();
    assertNotNull(cardValue); 
  }

}
