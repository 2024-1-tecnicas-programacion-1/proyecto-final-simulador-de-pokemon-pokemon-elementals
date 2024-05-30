package simulador;
import java.util.*;
import persistencia.ArchivosConexion;
import simulador.batalla.Batalla;
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
import java.util.HashMap;

public class Principal {
   static Scanner sc = new Scanner(System.in);
    static int entrenador1;
    static int entrenador2;
    static Pokemon pokeluchador1;
    static Pokemon pokeluchador2;
   static LinkedList<Entrenador> entrenadores = new LinkedList<>();
   static Pokemon base;
   static Entrenador nuevoEntrenador;
  
   
    public static void main(String[] args) {
        mostrarMenuPrincipal();
        
    }

    public static void registrarEntrenador(){


       
        
         String nombre = sc.next();
         nuevoEntrenador = new Entrenador(nombre);

        if(entrenadores.contains(nombre)){
            System.out.println("este entrenador ya esta en la base de datos");
        } else{
            entrenadores.add(nuevoEntrenador);
            System.out.println("El entrenador nuevo ha sido agregado");
           
        }

        

    }

    public static void listaEntrenadores(){
        for(int i=0; i<entrenadores.size(); i++){
            entrenadores.get(i);

        }


    }

    
        
    static Pokemon drowzee = new Drowzee();
        
    static Pokemon koffing = new Koffing();
        
    static Pokemon magnemite = new Magnemite();
        
    static Pokemon mankey = new Mankey();
    
    static Pokemon meowth = new Meowth();
        
    static Pokemon oddish = new Oddish();
        
    static Pokemon poliwag = new Poliwag();
        
    static Pokemon rhyhorn = new Rhyhorn();
        
    static Pokemon spearow = new Spearow();
        
    static Pokemon vulpix = new Vulpix();

    public static int mapa(int recepcion){

    HashMap<Integer, Pokemon> diccionarioPokemon = new HashMap<Integer, Pokemon>();

    diccionarioPokemon.put (1, drowzee);
    diccionarioPokemon.put (2, koffing);
    diccionarioPokemon.put (3, magnemite);
    diccionarioPokemon.put (4, mankey);
    diccionarioPokemon.put (5, meowth);
    diccionarioPokemon.put (6, oddish);
    diccionarioPokemon.put (7, poliwag);
    diccionarioPokemon.put (8, rhyhorn);
    diccionarioPokemon.put (9, spearow);
    diccionarioPokemon.put (10, vulpix);
       
    return recepcion;


    }
    
  

    

    public static void listaPokemon(){
     Pokemon[] lista = new Pokemon[10];
        lista[0] = drowzee;
        lista[1] = koffing;
        lista[2] = magnemite;
        lista[3] = mankey;
        lista[4] = meowth;
        lista[5] = oddish;
        lista[6] = poliwag;
        lista[7] = rhyhorn;
        lista[8] = spearow;
        lista[9] = vulpix;

        for (int i = 0; i < lista.length; i++) {
            System.out.println(lista[i]);
        }


    }
        
        
      
    


    public static void agregarPokemonEntrenador(Entrenador entrenador){
       
       

        System.out.println("Esta es la lista de pokemon disponibles");
        System.out.println("El numero que aparece al lado del pokemon corresponde a su Id");
        System.out.println("Para introducir un pokemon al entrenador introduce la Id del pokemon");
        System.out.println("");
        System.out.println("1: Drowzee");
        System.out.println("2: Koffing");
        System.out.println("3: Magnemite");
        System.out.println("4: Mankey");
        System.out.println("5: Meowth");
        System.out.println("6: Oddish");
        System.out.println("7: Poliwag");
        System.out.println("8: rhyhorn");
        System.out.println("9: spearow");
        System.out.println("10: vulpix");

        System.out.println("");
        System.out.println("a continuacion introduce la Id del pokemon que quieres integrar al equipo:");


      
  
        String introducirIdPokemon = sc.next();
        switch (introducirIdPokemon) {
            case "1":
            
                entrenador.agregarPokemon(drowzee);
                break;
            case "2":
                entrenador.agregarPokemon(koffing);
                break;
             case "3":
                entrenador.agregarPokemon(magnemite);
             break;
             case "4":
                entrenador.agregarPokemon(mankey);
             break;
             case "5":
                entrenador.agregarPokemon(meowth);
             break;
             case "6":
                entrenador.agregarPokemon(oddish);
             break;
             case "7":
                entrenador.agregarPokemon(poliwag);
             break;
             case "8":
                entrenador.agregarPokemon(rhyhorn);
             break;
             case "9":
                entrenador.agregarPokemon(spearow);
             break;
             case "10":
                entrenador.agregarPokemon(vulpix);
             break;
        
            default:
            System.out.println("Esta Id no se encuentra en la base de datos");
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
           //ArchivosConexion.guardar(entrenadores );
    }

        public static void mostrarSubmenu1(){
            int opcion;
            do{ System.out.println("Submenú 1: \n1: Registar nuevo entrenador \n2: Ver lista de entrenadores \n3 Seleccionar un pokemon \n4 Volver al menu principal");
            opcion=sc.nextInt();
            switch(opcion){
                case 1:
                registrarEntrenador();


                break;

                case 2:

                listaEntrenadores();


                break;

                case 3:

                System.out.println("seleccione un pokemon para usar");
                Entrenador entrenadorEncontrado = nuevoEntrenador;

                agregarPokemonEntrenador(entrenadorEncontrado);
                
                String seleccionEntrenador = sc.nextLine();
               


                for (int i = 0; i < entrenadores.size(); i++) {
                    Entrenador entrenadorVisitado = entrenadores.get(i);
                    if(entrenadorVisitado.getNombre().equals(entrenadorVisitado)){
                        entrenadorEncontrado = entrenadorVisitado;
                    }
                }
                



mostrarSeleccionarEntrenador(nuevoEntrenador);

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
    
        
        int opcion;
        do{ System.out.println("\n1: Ver equipo de Pókemones \n2: Agregar Pókemon al equipo \n3 Entrenar Pókemon \n4 Volver a gestionar entrenadores");
        opcion=sc.nextInt();
        switch(opcion){
            case 1:
            System.out.println("Equipo de Pókemones");
            Entrenador.mostrarPokemon(base);
         
            break;
            case 2:
            System.out.println("Agregar Pókemon al equipo");
            agregarPokemonEntrenador(entrenador);  
            break;
            case 3:
            System.out.println("Entrenar Pókemon");
            

            System.out.println("selecciona al pokemon que quieres entrenar");
            String seleccionPokemon = sc.nextLine();

            
            switch (seleccionPokemon) {
                case "1":
                
                    Entrenador.entrenarPokemon(1);
                    break;
                case "2":
                    Entrenador.entrenarPokemon(2);
                    break;
                 case "3":
                 Entrenador.entrenarPokemon(3);
                 break;
                 case "4":
                 Entrenador.entrenarPokemon(4);
                 break;
                 case "5":
                 Entrenador.entrenarPokemon(5);
                 break;
                 case "6":
                 Entrenador.entrenarPokemon(6);
                 break;
                 case "7":
                 Entrenador.entrenarPokemon(7);
                 break;
                 case "8":
                 Entrenador.entrenarPokemon(8);
                 break;
                 case "9":
                 Entrenador.entrenarPokemon(9);
                 break;
                 case "10":
                 Entrenador.entrenarPokemon(10);
                 break;
            
                default:
                System.out.println("Esta Id no se encuentra en la base de datos");
                    break;
            }
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
                
                int opcion;
                do{ System.out.println("\n1: Ver todos los  Pókemones registrados \n2 Volver al menu principal");
                opcion=sc.nextInt();
                switch(opcion){
                    case 1:
                    System.out.println("Ver todos los Pókemones registrados");

                   
                    listaPokemon();
                    break;

                    case 2:
                    System.out.println("Volviendo al menu principal");
                    break;
                    default:
                    System.out.println("Opción incorrecta");
                    }
                    }while(opcion!=3);
                    }



                    public static void mostrarSubmenu3(){
                  
                        int opcion;
                        do{ System.out.println("\n1: Elegir entrenador 1 \n2: Elegir entrenador 2 \n3 Seleccionar Pokémon de entrenador 1 \n4 Seleccionar Pókemon de entrenador 2 \n5 Comenzar batalla \n6 Volver al menú principal");
                            opcion=sc.nextInt();
                            switch(opcion){
                                case 1:
                                System.out.println("Elegir entrenador 1");
                                    for (int i = 0; i < entrenadores.size(); i++) {
                                        String nombre1 = entrenadores.get(i).getNombre();
                                        System.out.println((i+1) + nombre1);
                                    }
                                 entrenador1 = sc.nextInt();
                                //elegir entrenador
                                break;
                                case 2:
                                System.out.println("Elegir entrenador 2");
                                //elegir entrenador
                                    for (int i = 0; i < entrenadores.size(); i++) {
                                        String nombre2 = entrenadores.get(i).getNombre();
                                        System.out.println((i+1) + nombre2);
                                    }
                                    entrenador2 = sc.nextInt();
                                break;
                                case 3:
                                System.out.println("Seleccionar Pókemon de entrenador 1");
                                 
                                 
                                  
                                 int seleccion1 = sc.nextInt();
                                 
                                
                                pokeluchador1 = entrenadores.get(entrenador1).prepararBatalla(mapa(seleccion1));
                                break;
                                case 4:
                               
                                System.out.println("Seleccionar Pókemon de entrenador 2");
                                int seleccion2 = sc.nextInt();
                                pokeluchador2 = entrenadores.get(entrenador2).prepararBatalla(mapa(seleccion2));

                                
                                break;
                                case 5:
                                System.out.println("Comenzar batalla");
                                  
                                 Batalla.IniciarBatalla(pokeluchador1, pokeluchador2);
                                
                                break;
                                case 6:
                                System.out.println("Volviendo al menú principal");
                                break;
                            }
                        }while(opcion!=6);



                    }

    


    }


