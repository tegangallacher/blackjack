package blackJackManagement;

public class Player {
  String name;
  Hand hand;

  public Player(String name, Hand hand) {
    this.name = name;
    this.hand = hand;

  }

  public String getName(){
    return this.name;
  }

  public int handSize(){
    return hand.getCardsInPlayerHand().size();
  }


}
