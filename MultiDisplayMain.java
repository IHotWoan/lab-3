/**
 * Created by Felix on 12/16/2015.
 */
public class MultiDisplayMain {
    public static void main(String[] args) {


        //tests MultiDisplay class

        MultiDisplay md = new MultiDisplay();

        md.setDisplayMessage("Felix kommer klara denna lab!");
        md.setDisplayCount(5);
        md.display();

        md.display("tror jag inte...", 2);

        System.out.println("Current message: " + md.getDisplayMessage());

    }
}
