import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.*;

public class GameOutcomeTest {

  Hand hand1 = new Hand();
  Hand hand2 = new Hand();

  Player player1  = new Player("Mike", hand1);
  Player player2  = new Player("Bob", hand2);

  @Test
  public void playerOneExists() {
    GameOutcome outcome = new GameOutcome(player1, player2);
    assertNotNull(outcome.getPlayerOne());
  }

  @Test
  public void playerTwoExists() {
    GameOutcome outcome = new GameOutcome(player1, player2);
    assertNotNull(outcome.getPlayerTwo());
  }

  @Test
  public void playerOneHandExists() {
    GameOutcome outcome = new GameOutcome(player1, player2);
    assertNotNull(outcome.getPlayerOneHand());
  }

  @Test
  public void playerTwoHandExists() {
    GameOutcome outcome = new GameOutcome(player1, player2);
    assertNotNull(outcome.getPlayerTwoHand());
  }

  @Test
  public void hasWinningPlayer() {

  }

}