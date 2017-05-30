package com.codeclan.example.cardgame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Hand hand1 = new Hand();
    Hand hand2 = new Hand();

    Player player1 = new Player("Player1", hand1);
    Player player2 = new Player("Player2", hand2);

    Game game = new Game(player1, player2);

    private Suit player1DealtCardSuit;
    private Rank player1DealtCardRank;
    private Suit player2DealtCardSuit;
    private Rank player2DealtCardRank;

    private int player1HandOldValue;
    private int player1HandNewValue;
    private int player2HandOldValue;
    private int player2HandNewValue;

    private ArrayList<Card> player1Hand;
    private ArrayList<Card> player2Hand;

    private ArrayList<String> hand1Details;
    private ArrayList<String> hand2Details;

    private String player1CardDetails;
    private String player2CardDetails;

    TextView textPlayer1LatestCard;
    Button buttonPlayer1;

    TextView textPlayer2LatestCard;
    Button buttonPlayer2;

    TextView textResult;
    Button buttonGameResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonPlayer1 = (Button) findViewById(R.id.buttonPlayer1);
        textPlayer1LatestCard = (TextView) findViewById(R.id.player1Choice);

        buttonPlayer2 = (Button) findViewById(R.id.buttonPlayer2);
        textPlayer2LatestCard = (TextView) findViewById(R.id.player2Choice);

        buttonGameResult = (Button) findViewById(R.id.buttonResult);
        textResult = (TextView) findViewById(R.id.gameResult);

    }

    public void onPlayer1ButtonClick(View view) {
        hand1Details = new ArrayList<String>();
        player1Hand = game.dealPlayer1Card();
        player1DealtCardRank = game.getplayer1DealtCardRank();
        player1DealtCardSuit = game.getplayer1DealtCardSuit();

        for (Card card:player1Hand) {
            Suit suit = card.getSuit();
            // System.out.println("Suit of card already in hand is: "+suit);
            Rank rank = card.getRank();
            // System.out.println("Rank of card already in hand is: "+rank);
            int cardValue = card.getValue(rank);
            // System.out.println("Value of card already in hand is: "+ cardValue);

            player1CardDetails = rank + " of " + suit;
            hand1Details.add(player1CardDetails);
        }

        for (String player1Card: hand1Details) {
            System.out.println("Player 1 card in hand is: "+player1Card);
        }

        textPlayer1LatestCard.setText("Player1 Last Card was: " + player1DealtCardRank + " of " + player1DealtCardSuit);
        textPlayer1LatestCard.setText("Player 1 hand details are: " + hand1Details);
    }

    public void onPlayer2ButtonClick(View view) {
        hand2Details = new ArrayList<String>();
        player2Hand = game.dealPlayer2Card();
        player2DealtCardRank = game.getplayer2DealtCardRank();
        player2DealtCardSuit = game.getplayer2DealtCardSuit();

        for (Card card:player2Hand) {
            Suit suit = card.getSuit();
            // System.out.println("Suit of card already in hand is: "+suit);
            Rank rank = card.getRank();
            // System.out.println("Rank of card already in hand is: "+rank);
            int cardValue = card.getValue(rank);
            // System.out.println("Value of card already in hand is: "+ cardValue);

            player2CardDetails = rank + " of " + suit;

            hand2Details.add(player2CardDetails);
        }

        for (String player2Card: hand2Details) {
            System.out.println("Player 2 card in hand is: "+player2Card);
        }

        // textPlayer2LatestCard.setText("Player2 Last Card was: " + player2DealtCardRank + " of " + player2DealtCardSuit);
        textPlayer2LatestCard.setText("Player 2 hand details are: " + hand2Details);

    }

    public void onResultButtonClick(View view) {
        player1HandNewValue = game.getPlayer1HandNewValue();
        player2HandNewValue = game.getPlayer2HandNewValue();
        String outcome = game.getResult(player1HandNewValue, player2HandNewValue);
        textResult.setText("Outcome: " + outcome + " Hand Value Player1: " + player1HandNewValue + " Hand Value Player2: " + player2HandNewValue);
    }

}
