package simulador.entrenador;

import java.util.ArrayList;
import java.util.List;

import simulador.pokemon.Pokemon;

public class Entrenador {

    private String entrenador;
    private List<Pokemon> pokemones;

    public Entrenador(String nombre) {
        this.entrenador = entrenador;
        this.pokemones = new ArrayList<>();
    }


    public void agregarPokemon (Pokemon pokemon){
        pokemones.add(pokemon);
        
    }


    public void entrenarPokemon (int indicePokemon){
        if (indicePokemon<0 || indicePokemon>=pokemones.size()) {
            System.out.println("Pokémon no encontrado");
            return;

        }
        Pokemon pokemonSeleccionado = pokemones.get(indicePokemon);
        System.out.println("Entrenando a " + pokemonSeleccionado);

    }
    
    public void mostrarPokemones() {
        for (Pokemon pokemon : pokemones) {
            System.out.println(pokemon);
        }
    }

    public void prepararBatalla (int indicePokemon){
        if (indicePokemon<0 || indicePokemon>=pokemones.size()) {
            System.out.println("Pokémon no encontrado");
            return;

        }
        Pokemon pokemonSeleccionado = pokemones.get(indicePokemon);
        System.out.println("Preparando a " + pokemonSeleccionado + " para la batalla");
       
}
}

