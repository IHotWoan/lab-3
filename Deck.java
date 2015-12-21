/**
 * Created by Felix on 12/16/2015.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {

    //color and value for when creating cards
    private enum Color {HEARTS, SPADES, CLUBS, DIAMONDS}
    private enum Value {ACE, DEUCE, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING}

    ArrayList<Card> deck;       //list for cards

    public Deck() {
        deck = new ArrayList<>();

        for (Color c : Color.values()) {            //adding all cards of heart then spades etc, to list
            for (Value v : Value.values()) {
                Card card = new Card(c.toString(), v.toString());
                deck.add(card);
            }
        }

    }

    public int getSize() {return deck.size();}     //gives deck size

    public void printAll(){                         //prints out all cards
        for(Card c : deck) {
            System.out.println(c.toString());
        }
    }

    public Card deal() {
        Card cardToDeal = deck.get(0);
        deck.remove(0);
        return cardToDeal;
    }

    public void shuffle(){                          //shuffle our deck
        Random rand = new Random();
        for(int i = 0; i < deck.size(); i++){
            int r = rand.nextInt(51);
            Collections.swap(deck, 0, deck.size() -1 - r  );
        }
    }


}


