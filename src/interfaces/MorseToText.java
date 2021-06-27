package interfaces;

public interface MorseToText {
    static String morseToText(String par, char[] text, String[] morse) {
        String[] letters = par.split(" ");
        String str = "";
        for (int i = 0; i < letters.length; i++){
            for (int j = 0; j < morse.length; j++){
                if (morse[j].equals(letters[i])){
                    str = str + text[j];
                    break;
                }
            }
        }
        return str;
    }
}
