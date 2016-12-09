import static org.junit.Assert.*;
import org.junit.*;

import blackJackManagement.*;


public class CardTest {

  Card card;
  
  @Before 
  public void before() {
    card = new Card(ValueType.THREE, SuitType.CLUBS);
  }

  @Test
  public void canGetValue() {
    assertEquals(ValueType.THREE, card.getValue());
  }

  @Test
  public void canGetSuit() {
    assertEquals(SuitType.CLUBS, card.getSuit());
  }


}