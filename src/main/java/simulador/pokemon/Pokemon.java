package simulador.pokemon;

public abstract class Pokemon {

    private String nombre;
    private int salud;
    private int puntosDeAtaque;
    private String tipo;
    private String estado;

    public int atacar() {
        int ataque = puntosDeAtaque ;
        return ataque;
    }

    public int recibrirDaño() {
       int recibrirDaño = salud-atacar(); 
       
    }

    public entrenar(){


    }

}
