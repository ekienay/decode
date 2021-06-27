import interfaces.MorseToText;
import interfaces.TextToMorse;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {

        final char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
                'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x',
                'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0',
                ',', '.', '?'};
        final String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
                ".---", "-.-", ".-..", "--", "-.", "---", ".---.", "--.-", ".-.",
                "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
                "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.", "-----",
                "--..--", ".-.-.-", "..--.."};

        boolean loop;

        while (loop = true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input method: m or t");
            String method = scanner.nextLine();
            if (method.equals("m")) {
                System.out.println("Input morse code: ");
                String code = scanner.nextLine();
                System.out.println("Text: " + MorseToText.morseToText(code, letters, morse) + "\n");
                loop = false;
            } else {
                System.out.println("Input text in eng: ");
                String text = scanner.nextLine();
                System.out.println("Code: " + TextToMorse.textToMorse(text, letters, morse) + "\n");
                loop = false;
            }
        }
    }
}
