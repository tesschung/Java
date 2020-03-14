import java.util.HashMap;

public class WordDictionary {
    private HashMap<String, String> dict = new HashMap<>();

    public void addWord(String key, String value) {
        // return할 필요 없음
        dict.put(key.toLowerCase(), value);
//        System.out.println(dict);
    }

    public String find(String key) {
//        System.out.println(key);
//        System.out.println(dict);
        // 인풋을 잘 보자
        String ans = dict.get(key.toLowerCase());
//        System.out.println(ans);
        return ans;
    }
}
