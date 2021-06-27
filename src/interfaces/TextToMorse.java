package interfaces;

public interface TextToMorse {
    static String textToMorse(String par, char[] text, String[] morse) {
        par = par.toLowerCase();
        char[] chars = par.toCharArray();
        String str = "";
        for (int i = 0; i < chars.length; i++){
            for (int j = 0; j < text.length; j++){
                if (text[j] == chars[i]){
                    str = str + morse[j] + " ";
                    break;
                }
            }
        }
        return str;
    }
}
