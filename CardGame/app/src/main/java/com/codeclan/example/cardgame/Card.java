package com.codeclan.example.cardgame;

/**
 * Created by user on 27/05/2017.
 */

public class Card {

    private int value;
    private String cardDetails;
    private String cardIcon;

    private Rule rule;
    private Suit suit;
    private Rank rank;

    public Card() {

    }

    public Card(Suit suit, Rank rank) {
        this.rank = rank;
        this.value = value;
        this.suit = suit;
        this.cardDetails = cardDetails;
        this.cardIcon = cardIcon;
    }

    public Rank getRank() {
        return this.rank;
    }

    public void setRank(Rank newRank) {
        this.rank = newRank;
    }

    public int getValue(Rank rank) {
        rule = new Rule(rank.toString());
        int value = rule.getValueFromRank(rank.toString());
        return value;
    }

    public void setValue(int newValue) {
        this.value = newValue;
    }

    public Suit getSuit() {
        return this.suit;
    }

    public void getSuit(Suit newSuit) {
        this.suit = newSuit;
    }

    public String getCardIcon(String cardDetails) {

        if (cardDetails.equals("ACE of SPADES")) {
            cardIcon = "ace_of_spades";
        } else if (cardDetails.equals("TWO of SPADES")) {
            cardIcon = "two_of_spades";
        } else if (cardDetails.equals("THREE of SPADES")) {
            cardIcon = "three_of_spades";
        } else if (cardDetails.equals("FOUR of SPADES")) {
            cardIcon = "four_of_spades";
        } else if (cardDetails.equals("FIVE of SPADES")) {
            cardIcon = "five_of_spades";
        } else if (cardDetails.equals("KING of SPADES")) {
            cardIcon = "king_of_spades";
        }
        return this.cardIcon;
    }

}
