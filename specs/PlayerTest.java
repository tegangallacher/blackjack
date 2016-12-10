import static org.junit.Assert.*;
import org.junit.*;

import blackJackManagement.*;


public class PlayerTest {

  Player player;
  Hand hand;
  
  @Before 
  public void before() {
    player = new Player("Winnie", hand);
    hand = new Hand();
  }

  @Test
  public void hasName() {
    assertEquals("Winnie", player.getName());
  }


}