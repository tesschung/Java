public class PokeDriver {
    public static void main(String[] args) {
        PokeBag pokeBag = new PokeBag();

        pokeBag.add(new Pokemon("마그마", 1024));
        pokeBag.add(new Pokemon("마그마그", 215));
        pokeBag.add(new Pokemon("마릴", 816));
        pokeBag.add(new Pokemon("마그마그", 136));
        pokeBag.add(new Pokemon("라프라스", 1822));
        pokeBag.add(new Pokemon("마릴", 215));
        pokeBag.add(new Pokemon("마릴", 185));
        pokeBag.add(new Pokemon("마릴", 110));
        pokeBag.add(new Pokemon("니드킹", 1709));
        pokeBag.add(new Pokemon("마릴", 39));
        pokeBag.add(new Pokemon("마자용", 12));

        System.out.println(pokeBag.getStrongest("마릴"));
        System.out.println(pokeBag.getStrongest());
        System.out.println(pokeBag.getStrongest("피카츄"));
    }
}

