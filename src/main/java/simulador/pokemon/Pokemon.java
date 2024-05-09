package simulador.pokemon;

public abstract class Pokemon {

    private String nombre;
    private int Salud;
    private int puntosDeAtaque;
    private String tipo;
    private String estado;

    public Pokemon atacar() {
        int[][] dannos = new int[17][17];
        dannos[0][0] = 1;
        dannos[0][1] = 2;
        dannos[2][15] = 3;

        int tipoPokemonAtaque = TipoPokemon.ELECTRICO;
        int tipoPokemonDefensor = TipoPokemon.AGUA;
        int multiplicadorDeDaño = dannos[tipoPokemonAtaque - 1][tipoPokemonDefensor - 1];
    }

    public int recibrirDaño() {

    }

    public entrenar(){


    }

}
