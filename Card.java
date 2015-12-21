/**
 * Created by Felix on 12/16/2015.
 */
public class Card {

    private String color;                           //fields
    private String value;

    public Card(String color, String value){        //constructor
        this.color = color;
        this.value = value;
    }

    public String toString() {                      // return card
        return value + " of " + color;
    }
}





