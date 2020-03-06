import java.util.ArrayList;
import java.util.HashMap;

public class PokeBag {
    // PokeBag은 포켓몬들을 담을 수 있는 가방
    // 추가하려는 포켓몬의 종류가 있으면, ArrayList에 저장 == 종류별로 저장한다.

    private final HashMap<String, ArrayList<Pokemon>> pokemons = new HashMap<>();

    public ArrayList<Pokemon> getPokemons(String name) {
        // ArrayList 반환
        return pokemons.get(name);

    }

    public void add(Pokemon pokemon) {


        // 반환 값 없음
    }

    public Pokemon getStrongest(String name) {


        // 객체 반환
        for (int num :)

    }

    public Pokemon getStrongest() {


        // 객체 반환
    }
}