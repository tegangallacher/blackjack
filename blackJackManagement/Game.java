package blackJackManagement;

public class Game {

  private Player player;
  private Dealer dealer;
  private Deck deck;


  public Game(Player player, Dealer dealer, Deck deck) {
    this.player = player;
    this.deck = deck;
    this.dealer = dealer;
  }

  public void buildDeck(){
    deck.createDeck();
    deck.shuffleDeck();
  }

  public void dealCards() {
   // System.out.println("You've been dealt:");
    player.hand.addDealtCardToHand(deck.deal());
 //  System.out.println(player.printCard());
    dealer.hand.addDealtCardToHand(deck.deal());
   // System.out.println(this.value + " of " + this.suit);
    player.hand.addDealtCardToHand(deck.deal());
  //  System.out.println(this.value + " of " + this.suit);
    dealer.hand.addDealtCardToHand(deck.deal());
  //  System.out.println(this.value + " of " + this.suit);
  }

  public void gameStatus() {
    System.out.println("You have a hand value of "+ player.hand.valueOfPlayerHand());
    System.out.println("The dealer has a hand value of "+ dealer.hand.valueOfPlayerHand());
  }

  public void findWinner() {
    if(player.hand.valueOfPlayerHand()>dealer.hand.valueOfPlayerHand()){
      System.out.println("You win! Your hand is greater than the dealers' hand.");
    }
    else{
      System.out.println("Sorry, you lose! Your hand is lower than the dealers' hand.");
    }
  }

  public void play() {
    buildDeck();
    dealCards();
    gameStatus();
    findWinner();
  }

}