class Runner {  

  private static int firstPlayerHandValue;
  private static int secondPlayerHandValue;
  private static String firstPlayerName;
  private static String secondPlayerName;
  private static int dealCount;
  private static int maxValue;

  public static void main(String[] args) {

    // Deck constructor builds a 52 card deck
    Deck deck = new Deck();
    Card card = new Card();
 
    // Hands are players
    Hand firstPlayerHand  = new Hand("Mike");
    Hand secondPlayerHand = new Hand("Bob");

    firstPlayerHandValue = 0;
    secondPlayerHandValue = 0;
    dealCount = 0;
    maxValue = 21;
 
    firstPlayerName  = firstPlayerHand.getPlayerName();
    secondPlayerName = secondPlayerHand.getPlayerName();

    // Dealing starts 
    System.out.println("");
    System.out.println("***** Let's Start Dealing *****");
    System.out.println("");

    // First player - first deal

    System.out.println("First Player: " + firstPlayerName);

    firstPlayerHand.addCardToHandFromDeck();
    firstPlayerHand.setCardDetails();

    System.out.print("Card:");
    System.out.println(firstPlayerHand.getCardRank() + " of " + firstPlayerHand.getCardSuit());
 
    firstPlayerHandValue = firstPlayerHandValue + firstPlayerHand.getCardValue();

    System.out.println("Card value is: " + firstPlayerHand.getCardValue());
 
    System.out.println(firstPlayerName + "'s current hand value is: " + firstPlayerHandValue);
    System.out.println("");

    // Second player first deal

    System.out.println("Second Player: " + secondPlayerName);

    secondPlayerHand.addCardToHandFromDeck();
    secondPlayerHand.setCardDetails();

    System.out.print("Card:");
    System.out.println(secondPlayerHand.getCardRank() + " of " + secondPlayerHand.getCardSuit());
     
    secondPlayerHandValue = secondPlayerHandValue + secondPlayerHand.getCardValue();

    System.out.println("Card value is: " + secondPlayerHand.getCardValue());
     
    System.out.println(secondPlayerName + "'s current hand value is: " + secondPlayerHandValue); 
    System.out.println("");

    dealCount += 1;

    System.out.println("");
    System.out.println("***** End of Deal Number " + dealCount + " *****");
    System.out.println("");

    // First player - second deal

    System.out.println("First Player: " + firstPlayerName);

    firstPlayerHand.addCardToHandFromDeck();
    firstPlayerHand.setCardDetails();

    System.out.print("Card:");
    System.out.println(firstPlayerHand.getCardRank() + " of " + firstPlayerHand.getCardSuit());
     
    firstPlayerHandValue = firstPlayerHandValue + firstPlayerHand.getCardValue();

    System.out.println("Card value is: " + firstPlayerHand.getCardValue());
     
    System.out.println(firstPlayerName + "'s current hand value is: " + firstPlayerHandValue);
    System.out.println("");

    // Second player second deal

    System.out.println("Second Player: " + secondPlayerName);

    secondPlayerHand.addCardToHandFromDeck();
      secondPlayerHand.setCardDetails();

    System.out.print("Card:");
    System.out.println(secondPlayerHand.getCardRank() + " of " + secondPlayerHand.getCardSuit());
      
      secondPlayerHandValue = secondPlayerHandValue + secondPlayerHand.getCardValue();

    System.out.println("Card value is: " + secondPlayerHand.getCardValue());
       
    System.out.println(secondPlayerName + "'s current hand value is: " + secondPlayerHandValue); 
    System.out.println("");

    dealCount += 1;

    System.out.println("");
    System.out.println("***** End of Deal Number " + dealCount + " *****");
    System.out.println("");

    // First player - third deal

    System.out.println("First Player: " + firstPlayerName);

    firstPlayerHand.addCardToHandFromDeck();
    firstPlayerHand.setCardDetails();

    System.out.print("Card:");
    System.out.println(firstPlayerHand.getCardRank() + " of " + firstPlayerHand.getCardSuit());
      
    firstPlayerHandValue = firstPlayerHandValue + firstPlayerHand.getCardValue();

    System.out.println("Card value is: " + firstPlayerHand.getCardValue());
      
    System.out.println(firstPlayerName + "'s current hand value is: " + firstPlayerHandValue);
    System.out.println("");

    if (firstPlayerHandValue > maxValue) {
      System.out.println(firstPlayerName + " - you are busted!!!");
    }

    // Second player third deal

    System.out.println("Second Player: " + secondPlayerName);

    secondPlayerHand.addCardToHandFromDeck();
    secondPlayerHand.setCardDetails();

    System.out.print("Card:");
    System.out.println(secondPlayerHand.getCardRank() + " of " + secondPlayerHand.getCardSuit());
       
    secondPlayerHandValue = secondPlayerHandValue +secondPlayerHand.getCardValue();

    System.out.println("Card value is: " + secondPlayerHand.getCardValue());
       
    System.out.println(secondPlayerName + "'s current hand value is: " + secondPlayerHandValue);
    System.out.println("");

    if (secondPlayerHandValue > maxValue) {
      System.out.println(secondPlayerName + " - you are busted!!!");
    }

    dealCount += 1;

    System.out.println("");
    System.out.println("***** End of Deal Number " + dealCount + " *****");
    System.out.println("");

  }
}

