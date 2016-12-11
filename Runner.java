package blackJackManagement;
import java.util.*;

public class Runner {

  public static void main(String[] args) {
    
    System.out.println("Lets play Blackjack! Enter your name: ");
    String name = System.console().readLine();
    System.out.println();

    Player player = new Player(name, new Hand());
    Dealer dealer = new Dealer();
    Deck deck = new Deck();
    Game game = new Game(player, dealer, deck);

    game.play();

  }
}