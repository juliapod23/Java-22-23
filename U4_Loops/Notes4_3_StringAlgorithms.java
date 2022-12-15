package U4_Loops;

public class Notes4_3_StringAlgorithms {
    public static void main(String[] args) {
        // PART I
        String mySchool = "Fremd Vikings";

        // print every other character of mySchool on the same line
        for(int i = 0; i < mySchool.length(); i += 2){
            System.out.print(mySchool.substring(i, i + 1));
        }
        System.out.println();
        // print the String mySchool in reverse (all characters on the same line)
        for(int i = mySchool.length() -1; i >= 0; i --){
            System.out.println(mySchool.substring(i, i + 1));
        }




         /* PART II
           Given the String animal, print the output such that the first line shows
           the first character, the second line shows the second character, and so on

           Ex:  If animal = "monkey" then the output would be:
               m
               mo
               mon
               monk
               monke
               monkey
        */

        String animal = "monkey";

        for(int i = 0; i < animal.length() + 1; i++){
            System.out.println(animal.substring(0,i));
        }

        // PART III
        String phrase = "Mary had a little lamb, little lamb, little lamb, ";
        phrase += "Mary had a little lamb, its fleece was white as snow";

        int count = 0;
        int index = -1;
        int loc = -1;
        String findPhrase = "little";
        // Print the amount of times the word "little" appears within phrase?
        while(index < phrase.length()){
            phrase = phrase.substring(index + 1);
            loc = phrase.indexOf(findPhrase);
            if(loc != -1){ // if we found it
                count++;
                index = loc;
            } else{
                index++;
            }
        }


        // create a new String, or modify the existing String, that removes
        // the word "little" entirely
        phrase = "Mary had a little lamb, little lamb, little lamb, ";
        phrase += "Mary had a little lamb, its fleece was white as snow";

        boolean isDone = false;
        while(isDone == false){
            loc = phrase.indexOf("little");

            if(loc != -1){
                // if we found "little", then join the part before "little" with the part after
                // if we found one
                phrase = phrase.substring(0, loc) + phrase.substring(loc + 7);
            }
            else{
                // if we didn't find one
               isDone = true;
            }
        }
        System.out.println(phrase);


        // create a new String (based on phrase), or modify the existing String,
        // that replaces the word "little" with the word "BIG"
        phrase = "Mary had a little lamb, little lamb, little lamb,";
        phrase += " Mary had a little lamb, its fleece was white as snow";
        isDone = false;
        while(isDone == false){
            loc = phrase.indexOf("little");

            if(loc != -1){
                // if we found "little", then join the part before "little" with the part after
                // if we found one
                phrase = phrase.substring(0, loc) + "BIG " + phrase.substring(loc + 7);
            }
            else{
                // if we didn't find one
                isDone = true;
            }
        }
        System.out.println(phrase);





    }
}
