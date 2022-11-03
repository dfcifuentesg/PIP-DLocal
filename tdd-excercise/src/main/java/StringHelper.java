public class StringHelper {

    public String swapLastTwoCharacters(String word){

        if(word == null || word.length() < 2){
            return word;
        }

        char secondLastChar = word.charAt(word.length() - 2);
        char lastChar = word.charAt(word.length() - 1);
        return "" + word.substring(0,word.length() - 2) + lastChar + secondLastChar;
    }
}
