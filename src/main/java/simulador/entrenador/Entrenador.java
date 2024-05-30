package simulador.entrenador;

import java.util.ArrayList;
import java.util.List;
import simulador.Principal;
import simulador.pokemon.Pokemon;

public class Entrenador {

    private String nombre;
    static private List<Pokemon> pokemones;

    

    public Entrenador(String nombre) {
        this.nombre = nombre;
        this.pokemones = new ArrayList<>();
    }

    public String getNombre(){

        return this.nombre;
    }


    public void agregarPokemon (Pokemon pokemon){
        pokemones.add(pokemon);
        
    }


    public static void entrenarPokemon (int indicePokemon){
        if (indicePokemon<0 || indicePokemon>=pokemones.size()) {
            System.out.println("Pokémon no encontrado");
            return;
        }

       


        Pokemon pokemonSeleccionado = pokemones.get(indicePokemon);
        
        System.out.println("Entrenando a " + pokemonSeleccionado);
        pokemonSeleccionado.entrenar();

    }
    
 
        public static Pokemon prepararBatalla (int indicePokemon){
            if (indicePokemon<0 || indicePokemon>=pokemones.size()) {
                System.out.println("Pokémon no encontrado");
                
    
            }
            Pokemon pokemonSeleccionado = pokemones.get(indicePokemon);
            System.out.println("Preparando a " + pokemonSeleccionado + " para la batalla");
            return pokemonSeleccionado;

}

public static Pokemon mostrarPokemon(Pokemon seleccion){
    for (int i = 0; i < pokemones.size(); i++) {
        
    
    seleccion = pokemones.get(i);
    
    }
    return seleccion;
}	
}

