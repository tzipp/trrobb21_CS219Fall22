package HW5;

public class Exercise66 {
    /*
    Tzipporah Robbins
    Homework 5
    Scrabble word checker
     */


    public static boolean canSpell(String word, String tiles){
        boolean isCorrect = false;
        for (int i = 0; i < tiles.length(); i++) {
            char tile_char = tiles.charAt(i);
            for(int j = 0; j < word.length(); j++){
                char word_char = word.charAt(j);
                if (word_char == tile_char){
                    word = word.substring(0, word.indexOf(word_char))
                            + word.substring(word.indexOf(word_char) + 1);
                }
            } // for loop
                } // big for loop
        if (word.length() == 0){
            isCorrect = true;
        }
        return isCorrect;
        }


    public static void main(String [] args){
        System.out.println(canSpell("boot", "axobasrto"));
        System.out.println(!canSpell("hippo", "haxobapsrito"));
        System.out.println(canSpell("zip", "tzipporah"));
        System.out.println(canSpell("blub", "oshfdhboieuillsahdb"));
    }
}
