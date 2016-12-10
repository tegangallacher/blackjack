package blackJackManagement;
import java.util.*;

public class Hand {

  private ArrayList<Card> playerHand;

public Hand() {

  this.playerHand = new ArrayList<Card>();
  
}

public ArrayList getCardsInPlayerHand(){
    return this.playerHand;
  }

  public void addDealtCardToHand(Card dealtCard){
    playerHand.add(dealtCard);
  }


  public int valueOfPlayerHand(){
    int count = 0;
    for (Card card : playerHand) {
      count = count + card.getValueInteger();
      }
    return count;
  }

}