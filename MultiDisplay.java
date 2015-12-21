/**
 * Created by Felix on 12/16/2015.
 */
public class MultiDisplay {

    private String displayMessage;              //fields
    private int count;

    public MultiDisplay(){displayMessage = ""; count = 0;  }                //constructor
    public MultiDisplay(String d, int c){ displayMessage = d; count = c; }


    //methods
    public void setDisplayMessage(String d){           //sets message
        displayMessage = d;
    }
    public void setDisplayCount(int c){                // sets number of repeats
        count = c;
    }
    public void display(){                             //prints out message x times
        for(int i = 0; i < count; i++){
            System.out.println(displayMessage);
        }
    }
    public void display(String d, int c){              // direct access to display
        setDisplayMessage(d);
        for(int i = 0; i < c; i++){
            System.out.println(displayMessage);
        }
    }
    public String getDisplayMessage(){                 // returns message
        return displayMessage;
    }
    public int getDisplayCount(){                       // returns repeats
        return count;
    }

}
