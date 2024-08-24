import java.lang.*;
import java.util.*;

public class Scramble {
    public static String scrambleWord(String word) {
        String out = "";

        for (int i = 0; i < word.length()-1; i++) {
            if (word.charAt(i) == 'A' && word.charAt(i+1) != 'A') {
                out += word.charAt(i+1) + "A";
                i += 1;
            } else out += word.charAt(i);
        }

        if (word.length() != out.length()) out += word.charAt(word.length()-1);

        return out;
    }
    public static List<String> scrambleOrRemove(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            if (scrambleWord(list.get(i)).equals(list.get(i))) {
                list.remove(list.get(i));
                i--;
            }
            else list.set(i, scrambleWord(list.get(i)));
        }

        return list;
    }
}
