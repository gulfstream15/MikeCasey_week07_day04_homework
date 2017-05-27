public class GameOutcome {

  private int player1HandOldValue;
  private int player1HandNewValue;
  private int player2HandOldValue;
  private int player2HandNewValue;

  private String outcome;

  Hand hand1 = new Hand();
  Hand hand2 = new Hand();

  Player player1  = new Player("Mike", hand1);
  Player player2  = new Player("Bob", hand2);

  public GameOutcome(Player player1, Player player2) {
     this.player1 = player1;
     this.player2 = player2;
  }

  public Player getPlayer1() {
    return this.player1;
  }

  public Player getPlayer2() {
    return this.player2;
  }

  public Hand getPlayer1Hand() {
    return this.player1.getHand();
  }

  public Hand getPlayer2Hand() {
    return this.player2.getHand();
  }

  public int dealPlayer1Card() {
    hand1.buildHand();
    Player player1  = new Player("Mike", hand1);
    player1HandNewValue = player1HandOldValue + hand1.getCardValue();
    player1HandOldValue = player1HandNewValue;
    return player1HandNewValue;
  }

  public int dealPlayer2Card() {
    hand2.buildHand();
    Player player2 = new Player("Bob", hand2);
    player2HandNewValue = player2HandOldValue + hand2.getCardValue();
    player2HandOldValue = player2HandNewValue;
    return player2HandNewValue;
  }

  public String getOutcome(int player1HandNewValue, int player2HandNewValue) {
    if (player1HandNewValue > player2HandNewValue) {
      outcome = "Winner is: " + player1.getName();
      return outcome;
    } else if (player2HandNewValue > player1HandNewValue) {
      outcome = "Winner is: " + player2.getName();
      return outcome;
    } else {
      outcome = "It's a draw";
      return outcome;
    }
  }

}

