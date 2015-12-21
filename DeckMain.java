/**
 * Created by Felix on 12/16/2015.
 */
public class DeckMain {
    public static void main(String[] args) {

        //control our methods
        Deck deck = new Deck();
        deck.printAll();
        System.out.println(deck.getSize());
        deck.shuffle();
        deck.printAll();
    }
}
