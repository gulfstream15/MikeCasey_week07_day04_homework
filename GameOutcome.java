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

  // Logic needs redoing here!!!
  public String getOutcome(Player player1, Player player2) {

    // give player a hand first??
    // or generate a hand in hand class and give to player??
    // get the hand for a player?

      // ⁃ public void player1HasHigherScore_returnsPlayer1() {
      //                  PlayerComparison playerComparison = new PlayerComparison();
      //                         Player player1  = new Player(“1”, new Hand());
      //                         Player player2  = new Player(“2”, new Hand());
      //                         player1.getHand().addCard(new Card(Suit.SPADES, Value.TWO);
      //                         player2.getHand().addCard(new Card(Suit.CLUBS, Value.ACE);
      //                         Player winner = playerComparison.compare(player1, player2);
      //                         assertEquals(player1, player2);
      //                     }


    hand1 = hand.buildHand();
    Player player1  = new Player(“Mike”, hand1);

    hand2 = hand.buildHand();
    Player player2  = new Player(“Bob”, hand2);

    hand1 = player1.getHand();
    hand2 = player1.getHand(); 
    
    cardValuePlayer1 = hand1.getCardValue();
    cardValuePlayer2 = hand2.getCardValue();

    if (cardValuePlayer1 > cardValuePlayer2) {
      return player1.getName();
    } else if ()
      return player2.getName();
  }

  // Outcome here not winner OR draw
  public String getWinnersName(Player player1, Player player2) {
    Player playerwin = getWinner(player1, player2);
    return playerwin.getName();
  }

}

