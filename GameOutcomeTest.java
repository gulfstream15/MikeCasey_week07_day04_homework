import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.*;

public class GameOutcomeTest {

  Hand hand1 = new Hand();
  Hand hand2 = new Hand();

  Player player1  = new Player("Mike", hand1);
  Player player2  = new Player("Bob", hand2);

  @Test
  public void player1Exists() {
    GameOutcome gameOutcome = new GameOutcome(player1, player2);
    assertNotNull(gameOutcome.getPlayer1());
  }

  @Test 
  public void player2Exists() {
    GameOutcome gameOutcome = new GameOutcome(player1, player2);
    assertNotNull(gameOutcome.getPlayer2());
  }

  @Test @Ignore
  public void player1HandHasValue() {
    GameOutcome gameOutcome = new GameOutcome(player1, player2);
    int valuePlayer1Hand = gameOutcome.dealPlayer1Card();
    assertNotNull(valuePlayer1Hand);
  }

  @Test @Ignore
  public void player2HandHasValue() {
    GameOutcome gameOutcome = new GameOutcome(player1, player2);
    int valuePlayer2Hand = gameOutcome.dealPlayer2Card();
    assertNotNull(valuePlayer2Hand);
  }

  @Test
  public void gameHasOutcome() {
    GameOutcome gameOutcome = new GameOutcome(player1, player2);
    // Two players, two hands for test
    int valuePlayer1AfterHand1 = gameOutcome.dealPlayer1Card();
    int valuePlayer2AfterHand1 = gameOutcome.dealPlayer2Card();
    int valuePlayer1AfterHand2 = gameOutcome.dealPlayer1Card();
    int valuePlayer2AfterHand2 = gameOutcome.dealPlayer2Card();
    String outcome = gameOutcome.getOutcome(valuePlayer1AfterHand2, valuePlayer2AfterHand2);
    assertNotNull(outcome);
  }

}