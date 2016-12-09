package blackJackManagement;

public class Card {

  private ValueType value;
  private SuitType suit;
  private int num;

  public Card(ValueType value, SuitType suit, int num) {
  this.value = value;
  this.suit = suit;
  this.num = num;
}

  public ValueType getValue() {
  return this.value;
}

  public SuitType getSuit() {
  return this.suit;
}

public int getNum() {
  return this.num;
}
}