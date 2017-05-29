import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.*;

public class PlayerTest {

  @Test
  public void canGetPlayerName() {
    Hand hand = new Hand();
    Player player = new Player("Mike", hand);
    assertEquals("Mike", player.getName());
  }  

  @Test
  public void playerHasHand() {
    Hand hand = new Hand();
    Player player = new Player("Mike", hand);
    assertNotNull(hand);
  }

}