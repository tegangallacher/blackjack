package blackJackManagement;

public class Card {

  private ValueType value;
  private SuitType suit;

  public Card(ValueType value, SuitType suit) {
  this.value = value;
  this.suit = suit;
}

  public ValueType getValue() {
  return this.value;
}

  public SuitType getSuit() {
  return this.suit;
}
}