public class CalculateWinner {

  Hand hand1 = new Hand();
  Hand hand2 = new Hand();

  Player player1  = new Player("Mike", hand1);
  Player player2  = new Player("Bob", hand2);

  public CalculateWinner(Player player1, Player player2) {
     this.player1 = player1;
     this.player2 = player2;
  }

  public Player getPlayerOne() {
    return this.player1;
  }

  public Player getPlayerTwo() {
    return this.player2;
  }

  

}
