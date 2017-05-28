import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.*;

public class GameTest {

  Hand hand1 = new Hand();
  Hand hand2 = new Hand();

  Player player1  = new Player("Mike", hand1);
  Player player2  = new Player("Bob", hand2);

  @Test
  public void player1Exists() {
    Game game = new Game(player1, player2);
    assertNotNull(game.getPlayer1());
  }

  @Test
  public void player2Exists() {
    Game game = new Game(player1, player2);
    assertNotNull(game.getPlayer2());
  }

  @Test @Ignore
  public void player1HandHasValue() {
    Game game = new Game(player1, player2);
    int valuePlayer1Hand = game.dealPlayer1Card();
    assertNotNull(valuePlayer1Hand);
  }

  @Test @Ignore
  public void player2HandHasValue() {
    Game game = new Game(player1, player2);
    int valuePlayer2Hand = game.dealPlayer2Card();
    assertNotNull(valuePlayer2Hand);
  }

  @Test
  public void gameHasResult() {
    Game game = new Game(player1, player2);
    // Two players, two hands for test
    int valuePlayer1AfterHand1 = game.dealPlayer1Card();
    int valuePlayer2AfterHand1 = game.dealPlayer2Card();
    int valuePlayer1AfterHand2 = game.dealPlayer1Card();
    int valuePlayer2AfterHand2 = game.dealPlayer2Card();
    String result = game.getResult(valuePlayer1AfterHand2, valuePlayer2AfterHand2);
    System.out.println("Outcome: " +result);
    assertNotNull(result);
  }

}