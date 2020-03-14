import java.util.ArrayList;
import java.util.HashMap;

public class HashMapPrac {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("이상해꽃");

        // HashMap
        // Key -> Value

        HashMap<String, String> pokedex = new HashMap<String, String>();
        pokedex.put("피카츄","피카츄");
        pokedex.put("라이츄", "라이츄");

        pokedex.remove("이상해풀");

        // 찾고자 하는 value에 해당하는 key를 파라미터로 넘겨준다.
        String poke003 = pokedex.get("이상해꽃");
        System.out.println(poke003);

        // 같은 key에 여러 value를 저장하면 가장 마지막에 저장된 value로 덮어씌워진다.
        pokedex.put("피카츄", "피카츄3");

        for (String key:pokedex.keySet()) {
            System.out.println(key + pokedex);
        }

    }
}
