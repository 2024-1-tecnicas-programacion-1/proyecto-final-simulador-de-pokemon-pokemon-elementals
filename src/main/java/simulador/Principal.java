package simulador;
import java.util.*;
import persistencia.ArchivosConexion;

import simulador.entrenador.Entrenador;
import simulador.pokemon.Drowzee;
import simulador.pokemon.Koffing;
import simulador.pokemon.Magnemite;
import simulador.pokemon.Mankey;
import simulador.pokemon.Meowth;
import simulador.pokemon.Oddish;
import simulador.pokemon.Pokemon;
import simulador.pokemon.Poliwag;
import simulador.pokemon.Rhyhorn;
import simulador.pokemon.Spearow;
import simulador.pokemon.TipoPokemon;
import simulador.pokemon.Vulpix;

public class Principal {
   static Scanner sc = new Scanner(System.in);

   static LinkedList<Entrenador> entrenadores = new LinkedList<>();
   
    public static void main(String[] args) {
        mostrarMenuPrincipal();
        
    }

    public static void registrarEntrenador(){
        
        String nombre = sc.nextLine();
        Entrenador nuevoEntrenador = new Entrenador(nombre);

        if(entrenadores.contains(nombre)){
            System.out.println("este entrenador ya esta en la base de datos");
        } else{(entrenadores.add(nombre));
            System.out.println("El entrenador nuevo ha sido agregado");
           
        }

        

    }

    public static void listaEntrenadores(){
        for(int i=0; i<entrenadores.size(); i++){
            entrenadores.get(i);

        }


    }

    public Pokemon[] ListaPokemon(){
        Pokemon drow = new Drowzee();
        Pokemon koffing = new Koffing();
        Pokemon magnemite = new Magnemite();
        Pokemon mankey = new Mankey();
        Pokemon meowth = new Meowth();
        Pokemon oddish = new Oddish();
        Pokemon poliwag = new Poliwag();
        Pokemon rhyhorn = new Rhyhorn();
        Pokemon spearow = new Spearow();
        Pokemon vulpix = new Vulpix();

        for (int i = 0; i < 10; i++) {
            
        }


    }

    public static void agregarPokemonEntrenador(Entrenador entrenador){
        String introducirNombrePokemon = sc.nextLine();
        switch (introducirNombrePokemon) {
            case "Drowzee":
            Pokemon drowzee = new Drowzee();
                entrenador.agregarPokemon(drowzee);


                break;
        
            default:
                break;
        }

    }

    public static void mostrarMenuPrincipal(){
        Scanner e= new Scanner(System.in);
        int opcion;
        do{ System.out.println("Menú principal: \n1: Gestionar Entrenadores \n2 Gestionar Pokémones \n3 Iniciar batalla \n4 Salir ");
        opcion = e.nextInt();
        switch(opcion){
            case 1:
            mostrarSubmenu1();
            break;
            case 2:
            mostrarSubmenu2();
            break;
            case 3:
            mostrarSubmenu3();
            break;
            case 4:
            System.out.println("Saliendo del programa");
            break;
            default:
            System.out.println("Opción incorrecta");
            }
        }while(opcion!=4);
        ArchivosConexion.guardar(entrenadores, );
    }

        public static void mostrarSubmenu1(){
            Scanner e= new Scanner(System.in);
            int opcion;
            do{ System.out.println("Submenú 1: \n1: Registar nuevo entrenador \n2: Ver lista de entrenadores \n3 Seleccionar un entrenador \n4 Volver al menu principal");
            opcion=e.nextInt();
            switch(opcion){
                case 1:
                registrarEntrenador();


                break;

                case 2:

                listaEntrenadores();


                break;

                case 3:

                System.out.println("seleccione un entrenador para usar");
                
                String seleccionEntrenador = e.nextLine();
                Entrenador entrenadorEncontrado = null;


                for (int i = 0; i < entrenadores.size(); i++) {
                    Entrenador entrenadorVisitado = entrenadores.get(i);
                    if(entrenadorVisitado.getNombre().equals(entrenadorVisitado)){
                        entrenadorEncontrado = entrenadorVisitado;
                    }
                }
                agregarPokemonEntrenador(entrenadorEncontrado);



                break;

                case 4:
                System.out.println("Volviendo al menu principal");
                break;
                default:
                System.out.println("Opción incorrecta");
                
            }
            }while(opcion!=4);
           
    }
    public static void mostrarSeleccionarEntrenador(Entrenador entrenador) {
        Scanner e= new Scanner(System.in);
        int opcion;
        do{ System.out.println("\n1: Ver equipo de Pókemones \n2: Agregar Pókemon al equipo \n3 Entrenar Pókemon \n4 Volver a gestionar entrenadores");
        opcion=e.nextInt();
        switch(opcion){
            case 1:
            System.out.println("Equipo de Pókemones");

            entrenador.mostrarPokemones();
         
            break;
            case 2:
            System.out.println("Agregar Pókemon al equipo");
            entrenador.agregarPokemon();


            }

            

            break;
            case 3:
            System.out.println("Entrenar Pókemon");



            break;
            case 4:
            System.out.println("Volviendo a gestionar entrenadores");
            break;
            default:
            System.out.println("Opción incorrecta");
            }
            }while(opcion!=4);
            }
            public static void mostrarSubmenu2() {
                Scanner e= new Scanner(System.in);
                int opcion;
                do{ System.out.println("\n1: Ver todos los  Pókemones registrados \n2: Registrar nuevo Pókemon \n3 Volver al menu principal");
                opcion=e.nextInt();
                switch(opcion){
                    case 1:
                    System.out.println("Ver todos los Pókemones registrados");
                    break;
                    case 2:
                    System.out.println("Registrar");
                    break;
                    case 3:
                    System.out.println("Volviendo al menu principal");
                    break;
                    default:
                    System.out.println("Opción incorrecta");
                    }
                    }while(opcion!=3);
                    }
                    public static void mostrarSubmenu3(){
                        Scanner e= new Scanner(System.in);
                        int opcion;
                        do{ System.out.println("\n1: Elegir entrenador 1 \n2: Elegir entrenador 2 \n3 Seleccionar Pokémon de entrenador 1 \n4 Seleccionar Pókemon de entrenador 2 \5 Comenzar batalla \n6 Volver al menú principal");
                            opcion=e.nextInt();
                            switch(opcion){
                                case 1:
                                System.out.println("Elegir entrenador 1");
                                break;
                                case 2:
                                System.out.println("Elegir entrenador 2");
                                break;
                                case 3:
                                System.out.println("Seleccionar Pókemon de entrenador 1");
                                break;
                                case 4:
                                System.out.println("Seleccionar Pókemon de entrenador 2");
                                break;
                                case 5:
                                System.out.println("Comenzar batalla");
                                break;
                                case 6:
                                System.out.println("Volviendo al menú principal");
                                break;
                            }
                        }while(opcion!=6);



                    }


    }


