import static org.junit.Assert.*;
import org.junit.*;

import blackJackManagement.*;


public class DeckTest {

  Deck deck;
  
  @Before
  public void before() {
    deck = new Deck();
    deck.createDeck();
  }

  @Test
  public void deckHasBeenCreated() {
    assertEquals(52, deck.sizeOfDeck());
  }

  @Test
  public void printOutDeck() {
    deck.printDeck();
  }
}