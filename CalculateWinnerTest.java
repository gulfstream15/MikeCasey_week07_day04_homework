import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.*;

public class CalculateWinnerTest {

  Hand hand1 = new Hand();
  Hand hand2 = new Hand();

  Player player1  = new Player("Mike", hand1);
  Player player2  = new Player("Bob", hand2);

  @Test
  public void playerOneExists() {
    CalculateWinner calcwin = new CalculateWinner(player1, player2);
    assertNotNull(calcwin.getPlayerOne());
  }

  @Test
  public void playerTwoExists() {
    CalculateWinner calcwin = new CalculateWinner(player1, player2);
    assertNotNull(calcwin.getPlayerTwo());
  }

  @Test
  public void playerOneHandExists() {
    CalculateWinner calcwin = new CalculateWinner(player1, player2);
    assertNotNull(calcwin.getPlayerOneHand());
  }

  @Test
  public void playerTwoHandExists() {
    CalculateWinner calcwin = new CalculateWinner(player1, player2);
    assertNotNull(calcwin.getPlayerTwoHand());
  }

}