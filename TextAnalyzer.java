/**
 * Created by Felix on 12/16/2015.
 */
public class TextAnalyzer {

    private String text;                        //fields
    private int cCount = 0;
    private int uCount = 0;
    private int sCount = 0;
    private int dCount = 0;
    private char c;
    private String subStr;

    public TextAnalyzer(){text = "";}           //constructors
    public TextAnalyzer(String t){text = t;}

    //methods
    public int charCount(){
        for(int i = 0; i<text.length(); i++){
            cCount++;
        }
        return cCount;
    }

    public int upperCaseCount(){
        for(int i = 0; i<text.length(); i++){
            if (Character.isUpperCase(text.charAt(i))){
                uCount++;
            }
        }
        return uCount;
    }

    public int spaceCount(){
        for(int i = 0; i<text.length(); i++){
            if (text.charAt(i) == ' '){
                sCount++;
            }
        }
        return  sCount;
    }

    public int digitCount(){
        for(int i = 0; i<text.length(); i++){
            if (Character.isDigit(text.charAt(i))){
                dCount++;
            }
        }
        return dCount;
    }

    public boolean contailsChar(char c){
        for(int i = 0; i<text.length(); i++) {
            if (text.charAt(i) == c) {
            return true;
            }
        }
        return false;
    }

    public boolean containsString(String subStr){
        return text.contains(subStr);
    }
}
