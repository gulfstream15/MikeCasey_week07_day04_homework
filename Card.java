
public class Card {
    
  private int value;

  private Rule rule;
  private Suit suit;
  private Rank rank;

  public Card() {

  }

  public Card(Suit suit, Rank rank) {
    this.rank = rank; 
    this.value = value; 
    this.suit = suit;
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
 
}