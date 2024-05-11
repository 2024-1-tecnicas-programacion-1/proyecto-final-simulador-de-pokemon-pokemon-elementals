package simulador.pokemon;

public class TipoPokemon {
   
public static final int BICHO = 1;
public static final int DRAGON = 2;
public static final int ELECTRICO = 3;
public static final int HADA = 4;
public static final int LUCHA = 5;
public static final int FUEGO = 6;
public static final int VOLADOR = 7;
public static final int FANTASMA = 8;
public static final int PLANTA = 9;
public static final int TIERRA = 10;
public static final int HIELO = 11;
public static final int NORMAL = 12;
public static final int VENENO = 13;
public static final int PSIQUICO = 14;
public static final int ROCA = 15;
public static final int ACERO = 16;
public static final int AGUA = 17;
public static final int SINIESTRO = 18;
// esto no es necesariamente el funcionamiento real de el codigo solo se tiene de referencia y se puede cambiar para quedar mas compacto
public double multiplicadorDeDaño(TipoPokemon atacante, TipoPokemon defensor){

  double  multiplicador = 1;

  switch (atacante) {
    case TipoPokemon.BICHO:
    if(defensor.equals(PLANTA)|| defensor.equals(PSIQUICO)|| defensor.equals(SINIESTRO)){
        multiplicador = 2;

    }else if (defensor.equals(VOLADOR)|| defensor.equals(FUEGO)|| defensor.equals(LUCHA)|| defensor.equals(HADA)|| defensor.equals(VENENO)|| defensor.equals(FANTASMA)|| defensor.equals(ACERO)) {
        multiplicador = 0.5; 
    }  
        break;
        case TipoPokemon.DRAGON:
        if (defensor.equals(DRAGON)) {
            multiplicador = 2;
        }else if (defensor.equals(ACERO)) {
            multiplicador = 0.5;
        }else if(defensor.equals(HADA)){
            multiplicador = 0;

        }
        break;
        case TipoPokemon.ELECTRICO:
        if (defensor.equals(VOLADOR)|| defensor.equals(AGUA)) {
            multiplicador = 2;
        }else if (defensor.equals(PLANTA)|| defensor.equals(ELECTRICO)|| defensor.equals(DRAGON)) {
           multiplicador = 0.5; 
        }else if(defensor.equals(TIERRA)){
            multiplicador = 0;
        }
        break;
        case TipoPokemon.HADA:
        if(defensor.equals(LUCHA)|| defensor.equals(DRAGON)|| defensor.equals(SINIESTRO)){
            multiplicador = 2;
        }else if (defensor.equals(FUEGO)|| defensor.equals(VENENO)|| defensor.equals(ACERO)) {
            multiplicador = 0.5;
        }
        break;
        case TipoPokemon.LUCHA:
        if (defensor.equals(HIELO)|| defensor.equals(NORMAL)|| defensor.equals(ROCA)|| defensor.equals(SINIESTRO)|| defensor.equals(ACERO)) {
            multiplicador = 2;
        }else if (defensor.equals(VOLADOR)|| defensor.equals(BICHO)|| defensor.equals(HADA)|| defensor.equals(PSIQUICO)|| defensor.equals(VENENO)) {
            multiplicador = 0.5;
        }else if (defensor.equals(FANTASMA)) {
            multiplicador = 0;
        }
        break;
        
        case TipoPokemon.FUEGO:
        if (defensor.equals(HIELO)|| defensor.equals(PLANTA)|| defensor.equals(BICHO)|| defensor.equals(ACERO)) {
            multiplicador = 2;
        }else if (defensor.equals(AGUA)|| defensor.equals(ROCA)|| defensor.equals(FUEGO)|| defensor.equals(DRAGON)) {
            multiplicador = 0.5;
        }
        break;
        case TipoPokemon.VOLADOR:
        if (defensor.equals(PLANTA)|| defensor.equals(BICHO)|| defensor.equals(LUCHA)) {
            multiplicador = 2;
        }else if (defensor.equals(ELECTRICO)|| defensor.equals(ROCA)||defensor.equals(ACERO)) {
            multiplicador = 0.5;
        }
        break;
        case TipoPokemon.FANTASMA:
        if (defensor.equals(PSIQUICO)|| defensor.equals(FANTASMA)) {
            multiplicador = 2;
        }else if (defensor.equals(SINIESTRO)) {
            multiplicador = 0.5;
        }else if(defensor.equals(NORMAL)){
            multiplicador = 0;
        }
        break;
        case TipoPokemon.PLANTA:
        if (defensor.equals(AGUA)|| defensor.equals(ROCA)|| defensor.equals(TIERRA)) {
            multiplicador = 2;
        }else if (defensor.equals(VOLADOR)|| defensor.equals(PLANTA)|| defensor.equals(BICHO)|| defensor.equals(FUEGO)|| defensor.equals(VENENO)|| defensor.equals(DRAGON)|| defensor.equals(ACERO)) {
            multiplicador = 0.5;
        }
        break;
        case TipoPokemon.TIERRA:
        if (defensor.equals(ELECTRICO)|| defensor.equals(ROCA)|| defensor.equals(FUEGO)|| defensor.equals(VENENO)|| defensor.equals(ACERO)) {
            multiplicador = 2;
        }else if (defensor.equals(PLANTA)|| defensor.equals(BICHO)) {
            multiplicador = 0.5;
        }else if (defensor.equals(VOLADOR)) {
            multiplicador = 0;
        }
        break;
        case TipoPokemon.HIELO:
        if (defensor.equals(VOLADOR)|| defensor.equals(PLANTA)|| defensor.equals(TIERRA)|| defensor.equals(DRAGON)) {
            multiplicador = 2;
        }else if (defensor.equals(HIELO)|| defensor.equals(AGUA)||defensor.equals(FUEGO)||defensor.equals(ACERO)) {
            multiplicador = 0.5;
        }
        break;
        case TipoPokemon.NORMAL:
        if (defensor.equals(ROCA)|| defensor.equals(ACERO)) {
            multiplicador = 0.5;
        }else if (defensor.equals(FANTASMA)) {
            multiplicador = 0;
        }
        break;
        case TipoPokemon.VENENO:
        if (defensor.equals(PLANTA)|| defensor.equals(PSIQUICO)) {
            multiplicador = 2;
        }else if (defensor.equals(ROCA)|| defensor.equals(TIERRA)|| defensor.equals(VENENO)|| defensor.equals(FANTASMA)) {
            multiplicador = 0.5;
        }else if (defensor.equals(ACERO)) {
            multiplicador = 0;
        }
        break;
        case TipoPokemon.PSIQUICO:
        if (defensor.equals(LUCHA)|| defensor.equals(VENENO)) {
            multiplicador = 2;
        }else if (defensor.equals(ACERO)|| defensor.equals(PSIQUICO)) {
            multiplicador = 0.5;
        }else if (defensor.equals(SINIESTRO)) {
            multiplicador = 0;
        }
        break;
        case TipoPokemon.ROCA:
        if (defensor.equals(HIELO)|| defensor.equals(VOLADOR)|| defensor.equals(BICHO)|| defensor.equals(FUEGO)) {
            multiplicador = 2;
        }else if (defensor.equals(TIERRA)|| defensor.equals(LUCHA)|| defensor.equals(ACERO)) {
            multiplicador = 0.5;
        }
        break;
        case TipoPokemon.ACERO:
        if (defensor.equals(HIELO)|| defensor.equals(ROCA)|| defensor.equals(HADA)) {
            multiplicador = 2;
        }else if (defensor.equals(AGUA)|| defensor.equals(ELECTRICO)|| defensor.equals(FUEGO)|| defensor.equals(ACERO)) {
            multiplicador = 0.5;
        }
        break;
        case TipoPokemon.AGUA:
        if (defensor.equals(ROCA)|| defensor.equals(TIERRA)|| defensor.equals(FUEGO)) {
            multiplicador = 2;
        }else if (defensor.equals(AGUA)|| defensor.equals(PLANTA)|| defensor.equals(DRAGON)) {
            multiplicador = 0.5;
        }
        break;
        case TipoPokemon.SINIESTRO:
        if (defensor.equals(PSIQUICO)|| defensor.equals(FANTASMA)) {
            multiplicador = 2;
        }else if (defensor.equals(LUCHA)|| defensor.equals(HADA)|| defensor.equals(SINIESTRO)) {
            multiplicador = 0.5;
        }
        break;

  
    default:
        break;
  }

            
        }
        
    }
    

