import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.*;

public class GameTest {

  Hand hand1 = new Hand();
  Hand hand2 = new Hand();

  Suit lastCardSuitPlayer1;
  Suit lastCardSuitPlayer2;

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

  @Test @Ignore
  public void player1HandHasSize() {
    // One player, three hands
    Game game = new Game(player1, player2);
    int valuePlayer1AfterHand1 = game.dealPlayer1Card();
    int valuePlayer1AfterHand2 = game.dealPlayer1Card();
    int valuePlayer1AfterHand3 = game.dealPlayer1Card();
    int getPlayer1HandSize = game.getPlayer1HandSize();
    System.out.println("Player1 hand size is: " +game.getPlayer1HandSize());
    assertEquals(3, getPlayer1HandSize);
  }

  @Test 
  public void gameHasResult() {
    // Two players, two hands
    Game game = new Game(player1, player2);
    int valuePlayer1AfterHand1 = game.dealPlayer1Card();
    int valuePlayer2AfterHand1 = game.dealPlayer2Card();
    int valuePlayer1AfterHand2 = game.dealPlayer1Card();
    int valuePlayer2AfterHand2 = game.dealPlayer2Card();

    lastCardSuitPlayer1 = game.getplayer1DealtCardSuit();
    lastCardSuitPlayer2 = game.getplayer2DealtCardSuit();

    System.out.println("Last card suit dealt to Player1: " +lastCardSuitPlayer1);
    System.out.println("Last card suit dealt to Player2: " +lastCardSuitPlayer2);

    String resultMessage = game.getResult(valuePlayer1AfterHand2, valuePlayer2AfterHand2);
    int getPlayer1HandSize = game.getPlayer1HandSize();
    System.out.println("Player1 hand size is: " +game.getPlayer1HandSize());
    System.out.println("Outcome: " +resultMessage);
    assertNotNull(resultMessage);
  }

}