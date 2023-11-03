package Lesson17neu;

public class Aufgabe5neu {
    /*зашифровать вводную строку так, чтобы нельзя было прочитать изначальное сообщение,
    потом расшифровать строку и получить сообщение обратно
    */
    public static char[] encrypt(char[] str) {
        char[] res = new char[str.length];
        for (int i = 0; i < str.length; i++) {
            res[i] = (char) (str[i] + 3);

        }
        return res;
    }
    public static char[] decrypt(char[] str) {
        char[] res = new char[str.length];
        for (int i = 0; i < str.length; i++) {
            res[i] = (char) (str[i] - 3);
        }
        return res;
    }

    public static void main(String[] args) {
       // char letter = 97 + 6;
        String textStr="Hello world";

        char[]text=textStr.toCharArray();
        System.out.println(text);

        char[]encryptedText=encrypt(text);
        System.out.println(encryptedText);


        char[]decryptedText= decrypt(encryptedText);
        System.out.println(decryptedText);
    }
}
