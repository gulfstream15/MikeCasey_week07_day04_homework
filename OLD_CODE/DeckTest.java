import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.*;

public class DeckTest {
  
  Deck deck;
  Card card;
  
  @Before 
  public void before() {
    deck = new Deck();
  }

  @Test
  public void canCreateDeck(){
    assertEquals(52, deck.deckSize());
  }

  @Test
  public void getDeckSize(){
    assertEquals(52, deck.deckSize());
  }

  @Test
  public void canDealRandomCard() {
    assertNotNull(deck.dealRandomCard());
  }

}