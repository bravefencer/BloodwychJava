/**
 * Created by sascha on 17.03.2015.
 */
public class Tools {
    public static String replaceAt(String string, int index, char character) {
        StringBuilder newString = new StringBuilder(string);
        newString.setCharAt(index, character);
        return newString.toString();
    }

}
