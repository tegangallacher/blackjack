import static org.junit.Assert.*;
import org.junit.*;

import blackJackManagement.*;


public class PlayerTest {

  Player player;
  Hand hand;
  Card card;
  
  @Before 
  public void before() {
    hand = new Hand();
    player = new Player("Winnie", hand);
    card = new Card(ValueType.EIGHT, SuitType.HEARTS);
  }

  @Test
  public void hasName() {
    assertEquals("Winnie", player.getName());
  }

  @Test
  public void hasCard() {
    hand.addDealtCardToHand(card);
    assertEquals(1, player.handSize());
  }


}