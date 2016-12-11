package blackJackManagement;
import java.util.*;

public class Runner {

  public static void main(String[] args) {

    System.out.println("Lets play Blackjack!");


    Player player = new Player("Tegan", new Hand());
    Dealer dealer = new Dealer(new Hand());
    Deck deck = new Deck();
    Game game = new Game(player, dealer, deck);

    game.play();

}
}