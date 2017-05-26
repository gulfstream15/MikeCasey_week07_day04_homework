public class GameOutcome {

  private int cardValuePlayer1;
  private int cardValuePlayer2;

  Hand hand1 = new Hand();
  Hand hand2 = new Hand();

  Player player1  = new Player("Mike", hand1);
  Player player2  = new Player("Bob", hand2);

  public GameOutcome(Player player1, Player player2) {
     this.player1 = player1;
     this.player2 = player2;
  }

  public Player getPlayerOne() {
    return this.player1;
  }

  public Player getPlayerTwo() {
    return this.player2;
  }

  public Hand getPlayerOneHand() {
    return this.player1.getHand();
  }

  public Hand getPlayerTwoHand() {
    return this.player2.getHand();
  }

  public Player getWinner(Player player1, Player player2) {
    hand1 = player1.getHand();
    hand2 = player1.getHand();

    hand1.addCardToHandFromDeck();
    hand2.addCardToHandFromDeck(); 
    
    cardValuePlayer1 = hand1.getCardValue();
    cardValuePlayer2 = hand2.getCardValue();

    if (cardValuePlayer1 > cardValuePlayer2) {
      return player1;
    } else
      return player2;
  }

  public String getWinnersName(Player player1, Player player2) {
    Player playerwin = getWinner(player1, player2);
    return playerwin.getName();
  }

}

