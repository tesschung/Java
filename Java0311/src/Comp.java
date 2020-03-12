import java.util.Comparator;

// Comparator을 제공해줌
public class Comp implements Comparator<String> {
    public int compare(String first, String second) {
     return first.length() - second.length();
    }
}
