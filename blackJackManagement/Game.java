package blackJackManagement;

public class Game {

    Deck deck = new Deck();
    Hand playerHand = new Hand();
    Hand dealerHand = new Hand();
    Player player = new Player("Tegan", playerHand);
    Dealer dealer = new Dealer();

private void buildDeck(){
    deck.createDeck();
    deck.shuffleDeck();
}

private void dealCards() {
    playerHand.addDealtCardToHand(deck.deal());
    dealerHand.addDealtCardToHand(deck.deal());
    playerHand.addDealtCardToHand(deck.deal());
    dealerHand.addDealtCardToHand(deck.deal());
}

private void gameStatus() {
    System.out.println("You have a hand value of "+ playerHand.valueOfPlayerHand());
    System.out.println("The dealer has a hand value of "+ dealerHand.valueOfPlayerHand());
}

private void findWinner() {
    if(playerHand.valueOfPlayerHand()>dealerHand.valueOfPlayerHand()){
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