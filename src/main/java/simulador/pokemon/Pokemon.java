package simulador.pokemon;

public abstract class Pokemon {

    private String nombre;
    private int salud;
    private int puntosDeAtaque;
    private TipoPokemon tipo;
    private Estado estado;

    public Pokemon(String nombre, int salud, int puntosDeAtaque, TipoPokemon tipo){
        this.nombre = nombre;
        this.salud = salud;
        this.puntosDeAtaque = puntosDeAtaque;
        this.tipo = tipo;
        this.estado = estado; 
    }


    public void atacar(Pokemon oponente) {
        int ataque = (int)(puntosDeAtaque* TipoPokemon.multiplicadorDeDaño(this.tipo, oponente.tipo));
        oponente.recibrirDaño(ataque);
    }

    public void recibrirDaño(int danio) {
        salud-=danio;
    }

    public void entrenar(){
        salud+=20;
        puntosDeAtaque+=5;

    }

}
