import java.util.ArrayList;
import java.util.HashMap;

public class PokeBag {
    // HashMap<String, Pokemon>은 key와 value가 1:1 대응

    // key 하나에 여러 마리의 포켓몬을 넣는 것
    // PokeBag은 포켓몬들을 담을 수 있는 가방
    // 추가하려는 포켓몬의 종류가 있으면, ArrayList에 저장 == 종류별로 저장한다.

    // String이라는 키에, ArrayList안에 Pokemon이라는 객체를 원소로 하는 pokemons라는 HashMap생성
    private final HashMap<String, ArrayList<Pokemon>> pokemons = new HashMap<>();


    public ArrayList<Pokemon> getPokemons(String name) {
        // ArrayList 반환
        // name이라는 이름의 포켓몬을 모두 가져오는 메소드
        return pokemons.get(name);
    }

    public void add(Pokemon pokemon) {
        // 반환 값 없음
        // pokemon이라는 객체를 받고,
        // pokemon.name을 해서 name정보를 가져오는데,
//        System.out.println(pokemon);
        String name = pokemon.name;
//        System.out.println(name);

        // 해당 이름에 해당하는 ArrayList가 없으면 생성
        if (getPokemons(name) == null) {
            // null 이면, Hashmap 생성
            pokemons.put(name, new ArrayList<Pokemon>());
        }

        // 포켓몬이 존재하는 경우에는 그냥 해당 name이라는 키에 값으로 pokemon을 추가해주면 된다.
        // {name:[(pokemon.name, pokemon.cp), ...]}
        getPokemons(name).add(pokemon);

    }


    // 특정 포켓몬중 가장 강한 포켓몬을 가져오는 메소드
    public Pokemon getStrongest(String name) {

        // 객체 반환
        ArrayList<Pokemon> pokemonList = getPokemons(name);
        // [마릴(816), 마릴(215), 마릴(185), 마릴(110), 마릴(39)]
//        System.out.println(pokemonList);

        if (pokemonList == null ){
            return null;
        }

        Pokemon strongest = null;
        for (Pokemon pokemon : pokemonList) {
            // 숏 연산을 생각해보면 앞이 true면 뒤 연산을 진행하지 않음
            if (strongest == null || pokemon.cp > strongest.cp) {
                strongest = pokemon;
            }
        }
        return strongest;
    }

    // 모든 포켓몬 중 가장 강한 포켓몬을 가져오는 메소드
    public Pokemon getStrongest() {
        // return할 포켓몬(가장 센 포켓몬)을 담을 변수.
        Pokemon strongest = null;

        // HashMap 전체를 탐색 (keySet을 통해 얻은 key로 탐색)
        // keySet()은 value가 아닌 key를 순회해준다.
        for (String key : pokemons.keySet()) {
            // key에 해당하는 가장 센 포켓몬을 가져오기
            Pokemon p = getStrongest(key);

            // strongest를 가장 센 포켓몬으로 교체
            if (strongest == null || p.cp > strongest.cp) {
                strongest = p;
            }
        }
        return strongest;
    }

}