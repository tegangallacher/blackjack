package blackJackManagement;
import java.util.*;

public class Deck {
  private ArrayList<Card> cards;

  public Deck(ArrayList<Card> cards) {
    this.cards = cards;
    fillDeck();
  }

  public ArrayList getCards() {
    return cards;
  }

  public void shuffleDeck() {
    Collections.shuffle(cards);
  }

  private void fillDeck() {
    for (SuitType suit : SuitType.values()) {
      for (ValueType value : ValueType.values()) {
        int num = value.ordinal() + 1;
        if (num > 10) num = 10;
        cards.add(new Card(value, suit, num));
      }
    }
    shuffleDeck();
  }
}