import javax.xml.soap.Text;

/**
 * Created by Felix on 12/16/2015.
 */
public class TextAnalyzerMain {
    public static void main(String[] args) {

        String text = "Hej jag heter fe1ix och är 23 år gammal";
        TextAnalyzer ta = new TextAnalyzer(text);

        System.out.println("char count: "+ ta.charCount());
        System.out.println("Upper Case Count: "+ ta.upperCaseCount());
        System.out.println("Whitespace Count: "+ ta.spaceCount());
        System.out.println("Digit Count "+ ta.digitCount());

        if(ta.contailsChar('ö'))
            System.out.println("the text contains char \'x\'\"");

        if (ta.containsString("mmal"))
            System.out.println("the text contains substring" );


    }
}
