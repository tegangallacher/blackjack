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

  private void buildDeck(){
    deck.createDeck();
    deck.shuffleDeck();
}

private void dealCards() {
    player.hand.addDealtCardToHand(deck.deal());
    dealer.hand.addDealtCardToHand(deck.deal());
    player.hand.addDealtCardToHand(deck.deal());
    dealer.hand.addDealtCardToHand(deck.deal());
}

private void gameStatus() {
    System.out.println("You have a hand value of "+ player.hand.valueOfPlayerHand());
    System.out.println("The dealer has a hand value of "+ dealer.hand.valueOfPlayerHand());
}

private void findWinner() {
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