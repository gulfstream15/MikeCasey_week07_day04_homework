package com.codeclan.example.cardgame;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
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
    private int player1HandOldValue;
    private int player1HandNewValue;
    private ArrayList<Card> player1Hand;
    private ArrayList<String> hand1Details;
    private String player1CardDetails;
    private String player1EachIcon;
    private ArrayList<String> Player1AllIcons;

    private Suit player2DealtCardSuit;
    private Rank player2DealtCardRank;
    private int player2HandOldValue;
    private int player2HandNewValue;
    private ArrayList<Card> player2Hand;
    private ArrayList<String> hand2Details;
    private String player2CardDetails;
    private String player2EachIcon;
    private ArrayList<String> Player2AllIcons;

    TextView textPlayer1LatestCard;
    Button buttonPlayer1;

    TextView textPlayer2LatestCard;
    Button buttonPlayer2;

    TextView textResult;
    Button buttonGameResult;

    Button buttonAnotherPlay;

    ImageView player1FirstCardImage;
    ImageView player1SecondCardImage;
    ImageView player1ThirdCardImage;
    ImageView player1FourthCardImage;

    ImageView player2FirstCardImage;
    ImageView player2SecondCardImage;
    ImageView player2ThirdCardImage;
    ImageView player2FourthCardImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonPlayer1 = (Button) findViewById(R.id.buttonPlayer1);
        textPlayer1LatestCard = (TextView) findViewById(R.id.player1Choice);

        player1FirstCardImage = (ImageView) findViewById(R.id.player1FirstCard);
        player1SecondCardImage = (ImageView) findViewById(R.id.player1SecondCard);
        player1ThirdCardImage = (ImageView) findViewById(R.id.player1ThirdCard);
        player1FourthCardImage = (ImageView) findViewById(R.id.player1FourthCard);

        buttonPlayer2 = (Button) findViewById(R.id.buttonPlayer2);
        textPlayer2LatestCard = (TextView) findViewById(R.id.player2Choice);

        player2FirstCardImage = (ImageView) findViewById(R.id.player2FirstCard);
        player2SecondCardImage = (ImageView) findViewById(R.id.player2SecondCard);
        player2ThirdCardImage = (ImageView) findViewById(R.id.player2ThirdCard);
        player2FourthCardImage = (ImageView) findViewById(R.id.player2FourthCard);

        buttonGameResult = (Button) findViewById(R.id.buttonResult);
        textResult = (TextView) findViewById(R.id.gameResult);

        buttonAnotherPlay = (Button) findViewById(R.id.buttonPlayAgain);

    }

    public void onPlayer1ButtonClick(View view) {
        hand1Details = new ArrayList<String>();
        Player1AllIcons = new ArrayList<String>();

        ArrayList<ImageView> player1CardIconImageViews = new ArrayList<>();
        player1CardIconImageViews.add(player1FirstCardImage);
        player1CardIconImageViews.add(player1SecondCardImage);
        player1CardIconImageViews.add(player1ThirdCardImage);
        player1CardIconImageViews.add(player1FourthCardImage);

        int imageViewIndex = 0;

        if(player1Hand != null && player1Hand.size() == 4) return;

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
            player1EachIcon = card.getCardIcon(player1CardDetails);

            setCardImage(player1EachIcon, player1CardIconImageViews.get(imageViewIndex));
            imageViewIndex++;

            Player1AllIcons.add(player1EachIcon);
            hand1Details.add(player1CardDetails);
        }

//        for (String player1Card: hand1Details) {
//            System.out.println("Player 1 card in hand is: "+player1Card);
//        }
//
//        for (String icon: Player1AllIcons) {
//            System.out.println("Player 1 icon in hand is: "+icon);
//        }

//        textPlayer1LatestCard.setText("Player1 Last Card was: " + player1DealtCardRank + " of " + player1DealtCardSuit);
//        textPlayer1LatestCard.setText("Player 1 hand details are: " + hand1Details);
    }

    public void onPlayer2ButtonClick(View view) {
        hand2Details = new ArrayList<String>();
        Player2AllIcons = new ArrayList<String>();

        ArrayList<ImageView> player2CardIconImageViews = new ArrayList<>();
        player2CardIconImageViews.add(player2FirstCardImage);
        player2CardIconImageViews.add(player2SecondCardImage);
        player2CardIconImageViews.add(player2ThirdCardImage);
        player2CardIconImageViews.add(player2FourthCardImage);

        int imageViewIndex = 0;

        if(player2Hand != null && player2Hand.size() == 4) return;

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
            player2EachIcon = card.getCardIcon(player2CardDetails);

            setCardImage(player2EachIcon, player2CardIconImageViews.get(imageViewIndex));
            imageViewIndex++;

            Player2AllIcons.add(player2EachIcon);
            hand2Details.add(player2CardDetails);
        }

//        for (String player2Card: hand2Details) {
//            System.out.println("Player 2 card in hand is: "+player2Card);
//        }
//
//        for (String icon: Player2AllIcons) {
//            System.out.println("Player 2 icon in hand is: "+icon);
//        }

//        textPlayer2LatestCard.setText("Player2 Last Card was: " + player2DealtCardRank + " of " + player2DealtCardSuit);
//        textPlayer2LatestCard.setText("Player 2 hand details are: " + hand2Details);

    }

    public void onResultButtonClick(View view) {
        player1HandNewValue = game.getPlayer1HandNewValue();
        player2HandNewValue = game.getPlayer2HandNewValue();
        String outcome = game.getResult(player1HandNewValue, player2HandNewValue);
        System.out.println("player1HandNewValue is: "+player1HandNewValue);
        System.out.println("player2HandNewValue is: "+player2HandNewValue);
        System.out.println("outcome is: "+outcome);

        // textResult.setText("Outcome: " + outcome + " Hand Value Player1: " + player1HandNewValue + " Hand Value Player2: " + player2HandNewValue);
        textResult.setText(outcome);

    }

    public void onPlayAgainButtonClick(View view) {
        ArrayList<Card> player1Hand = new ArrayList<Card>();
        ArrayList<Card> player2Hand = new ArrayList<Card>();
        ArrayList<ImageView> player1CardIconImageViews = new ArrayList<>();
        ArrayList<ImageView> player2CardIconImageViews = new ArrayList<>();
    }

    public void setCardImage(String card, ImageView imageView) {
        //card param example= "ace_of_spades"
        int imageId = getResources().getIdentifier(card, "drawable", getPackageName());
        imageView.setImageResource(imageId);
    }

}
