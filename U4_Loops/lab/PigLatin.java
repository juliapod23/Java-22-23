package U4_Loops.lab;

public class PigLatin {
    /**
     * Translates a single word to Pig Latin using the established rules and utilizing the isConsonant method
     * @param word A single word in English
     * @return Returns parameter word translated to Pig Latin
     */

    public static String translateWordToPigLatin(String word){
        String temp = "";
        if(isConsonant(word)){
            // either cat or black
            if (isConsonant(word.substring(1))){
                //black
                temp = word.substring(0,2);
                word = word.substring(2);
            }
            else{
                // cat
                temp = word.substring(0,1);
                word = word.substring(1);
            }
            word.replaceFirst(temp, "");
            word += temp + "ay";
        } else if(!isConsonant(word)){
            word += "yay";
        }
        return word;
    }

    /**
     * Translates the entire phrase to Pig Latin by utilizing the translateWordToPigLatin method
     * @param phrase A group of words separated by spaces
     * @return Returns parameter phrase translated to Pig Latin
     */
    public static String toPigLatin(String phrase){
        phrase = phrase.toLowerCase();
        String output = "";
        String word = "";
        boolean isDone = false;

        while(!isDone){
            int loc = phrase.indexOf(" ");
            if(loc != -1){
                    word = phrase.substring(0,loc);
                    output += translateWordToPigLatin(word) + " ";
                    phrase = phrase.substring(phrase.indexOf(" ")+1);
                } else{
                output += translateWordToPigLatin(phrase);
                isDone = true;
            }
        }
        String firstOut = output.substring(0,1);
        firstOut = firstOut.toUpperCase();
        return(firstOut + output.substring(1));
    }

    /**
     * Checks if the first letter of a word is a consonant. If it is, continues to check if second letter is a consonant and adds to a
     * variable that contains a substring of the consonants
     * @param word A single word in English
     * @return Returns true or false if word starts with consonant(s)
     */
    public static boolean isConsonant(String word){
            String firstLetter = word.substring(0, 1);
            if (!(firstLetter.equalsIgnoreCase("a") || firstLetter.equalsIgnoreCase("e") || firstLetter.equalsIgnoreCase("i") || firstLetter.equalsIgnoreCase("o") || firstLetter.equalsIgnoreCase("u"))) {
                return true;
            } else {
                return false;
            }
        }
//output = PigLatin.toPigLatin("hi");
}
