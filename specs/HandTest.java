import blackJackManagement.*;
import static org.junit.Assert.*;
import org.junit.*;

public class HandTest {

  Player player;
  Hand hand;
  Card card1; 
  Card card2; 

  @Before
  public void before(){
    hand = new Hand();
    card1 = new Card (ValueType.JACK, SuitType.DIAMONDS);
    card2 = new Card (ValueType.EIGHT, SuitType.HEARTS);
    player = new Player ("Tegan", hand);
  }
  @Test
  public void getValueOfPlayerHand() {
    hand.addDealtCardToHand(card1);
    hand.addDealtCardToHand(card2);
    assertEquals(18, hand.valueOfPlayerHand());
  }


}