package simulador.entrenador;

import java.util.ArrayList;
import java.util.List;

public class Entrenador {

    private String entrenador;
    private List<String> pokemones;

    public Entrenador(String nombre) {
        this.entrenador = entrenador;
        this.pokemones = new ArrayList<>();
    }


    public void agregarPokemon (String pokemon){
        pokemones.add(pokemon);
        
    }


    public void entrenarPokemon (int indicePokemon){
        if (indicePokemon<0 || indicePokemon>=pokemones.size()) {
            System.out.println("Pokémon no encontrado");
            return;

        }
        String pokemonSeleccionado = pokemones.get(indicePokemon);
        System.out.println("Entrenando a " + pokemonSeleccionado);

    }
    
    public void mostrarPokemones() {
        for (String pokemon : pokemones) {
            System.out.println(pokemon);
        }
    }

    public void prepararBatalla (int indicePokemon){
        if (indicePokemon<0 || indicePokemon>=pokemones.size()) {
            System.out.println("Pokémon no encontrado");
            return;

        }
        String pokemonSeleccionado = pokemones.get(indicePokemon);
        System.out.println("Preparando a " + pokemonSeleccionado + " para la batalla");
       
}
}

