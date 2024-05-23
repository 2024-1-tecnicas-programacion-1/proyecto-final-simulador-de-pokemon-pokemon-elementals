package simulador;
import java.util.*;

import simulador.entrenador.Entrenador;
import simulador.pokemon.TipoPokemon;

public class Principal {

   LinkedList<Entrenador> entrenadores = new LinkedList<>();
   
    public static void main(String[] args) {
        mostrarMenuPrincipal();
        
    }

    public static void registrarEntrenador(){
        Scanner sc = new Scanner(System.in);
        String nombre = sc.nextLine();
        Entrenador nuevoEntrenador = new Entrenador(nombre);

        if(entrenador es.contains(nombre)){
            System.out.println("este entrenador ya esta en la base de datos");
        }else{
            entrenadores.add(nuevoEntrenador);
            System.out.println("El entrenador nuevo ha sido agregado");
           
        }

        

    }

    public static void listaEntrenadores(){
        for(int i=0; i>entrenadores.lenght; i++){
            entrenadores.get(i);

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


                break;

                case 3:


                break;

                case 4:
                System.out.println("Volviendo al menu principal");
                break;
                default:
                System.out.println("Opción incorrecta");
                
            }
            }while(opcion!=4);
           
    }
    public static void mostrarSeleccionarEntrenador() {
        Scanner e= new Scanner(System.in);
        int opcion;
        do{ System.out.println("\n1: Ver equipo de Pókemones \n2: Agregar Pókemon al equipo \n3 Entrenar Pókemon \n4 Volver a gestionar entrenadores");
        opcion=e.nextInt();
        switch(opcion){
            case 1:
            System.out.println("Equipo de Pókemones");
            break;
            case 2:
            System.out.println("Agregar Pókemon al equipo");
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


