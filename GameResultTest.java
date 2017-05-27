import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.*;

public class GameResultTest {

  Hand hand1 = new Hand();
  Hand hand2 = new Hand();

  Player player1  = new Player("Mike", hand1);
  Player player2  = new Player("Bob", hand2);

  @Test
  public void player1Exists() {
    GameResult result = new GameResult(player1, player2);
    assertNotNull(result.getPlayer1());
  }

  @Test
  public void player2Exists() {
    GameResult result = new GameResult(player1, player2);
    assertNotNull(result.getPlayer2());
  }

  @Test @Ignore
  public void player1HandHasValue() {
    GameResult result = new GameResult(player1, player2);
    int valuePlayer1Hand = result.dealPlayer1Card();
    assertNotNull(valuePlayer1Hand);
  }

  @Test @Ignore
  public void player2HandHasValue() {
    GameResult result = new GameResult(player1, player2);
    int valuePlayer2Hand = result.dealPlayer2Card();
    assertNotNull(valuePlayer2Hand);
  }

  @Test
  public void gameHasOutcome() {
    GameResult result = new GameResult(player1, player2);
    // Two players, two hands for test
    int valuePlayer1AfterHand1 = result.dealPlayer1Card();
    int valuePlayer2AfterHand1 = result.dealPlayer2Card();
    int valuePlayer1AfterHand2 = result.dealPlayer1Card();
    int valuePlayer2AfterHand2 = result.dealPlayer2Card();
    String outcome = result.getResult(valuePlayer1AfterHand2, valuePlayer2AfterHand2);
    System.out.println("Outcome: " +outcome);
    assertNotNull(outcome);
  }

}