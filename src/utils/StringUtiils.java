package utils;

public class StringUtiils {

    public static String getFirmattedText(String text) {

        if (text.length() < 10) {
            return text;
        } else {
            return text.substring(0, 7) + "...";
        }
    }
}
