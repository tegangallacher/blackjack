package blackJackManagement;

public class Game {


  public static void main (String[] args) {

    System.out.println("Let's play Black Jack!");

    System.out.println("What is your name?");

    String name = System.console().readLine();

    Deck deck = new Deck();
    deck.createDeck();
    deck.shuffleDeck();

    Hand playerHand = new Hand();
    Hand dealerHand = new Hand();
    Player player = new Player(name, playerHand);
    Dealer dealer = new Dealer();

    System.out.println("Deal to " + name + ":");
    playerHand.addDealtCardToHand(deck.deal());
    System.out.println("Deal to Dealer: ");
    dealerHand.addDealtCardToHand(deck.deal());
    System.out.println("Deal to " + name + ":");
    playerHand.addDealtCardToHand(deck.deal());
    System.out.println("Deal to Dealer: ");
    dealerHand.addDealtCardToHand(deck.deal());

    System.out.println("You have a hand value of "+ playerHand.valueOfPlayerHand());

    System.out.println("The dealer has a hand value of "+ dealerHand.valueOfPlayerHand());


    if(playerHand.valueOfPlayerHand()>dealerHand.valueOfPlayerHand()){
      System.out.println("You win! Your hand is greater than the dealers' hand.");
    }
    else{
      System.out.println("Sorry, you lose! Your hand is lower than the dealers' hand.");
    }
  }
}



