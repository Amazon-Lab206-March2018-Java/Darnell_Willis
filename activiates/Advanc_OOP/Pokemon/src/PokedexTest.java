
public class PokedexTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pokedex pokdex = new Pokedex ();
        Pokemon d = pokdex.createPokemon ("D", 110, "Plants");
        Pokemon v = pokdex.createPokemon ("V", 100, "Water");
        Pokemon m = pokdex.createPokemon ("M", 95, "Fire");
        
        System.out.println(pokdex.pokemonInfo(d));
        System.out.println(pokdex.pokemonInfo(v));
        System.out.println(pokdex.pokemonInfo(m));

        pokdex.attackPokemon(d);
        
	}

}
