import modelo.Pelicula;
import modelo.Serie;

import java.util.Scanner;

public class Principal {

    public void muestraElMenu(){
        int opcion = 0;
        Scanner teclado = new Scanner(System.in);

        while(opcion != 9){

        String menu = """
        Bienvenido a Screenmatch
        1.- Registrar nueva pelicula
        2.- Registrar nueva seria
        
        9.- Para salir del menu
        """;

            System.out.println(menu);
            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion){
                case 1:
                    System.out.println("Ingresa el nombre de la pelicula");
                    String nombre = teclado.nextLine();
                    System.out.println("Ingresa el anio de lanzamiento");
                    int fechaDeLanzamiento = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Ingresa la duracion de la pelicula en minutos");
                    int duracionEnMinutos = teclado.nextInt();
                    teclado.nextLine();

                    Pelicula peliculaUsuario = new Pelicula();

                    peliculaUsuario.setNombre(nombre);
                    peliculaUsuario.setFechaDeLanzamiento(fechaDeLanzamiento);
                    peliculaUsuario.setTiempoDeDuracionEnMinutos(duracionEnMinutos);

                    peliculaUsuario.muestraFichaTecnica();
                    break;
                case 2:
                    System.out.println("Ingresa el nombre de la serie");
                    String nombreSerie = teclado.nextLine();
                    System.out.println("Ingresa el anio de lanzamiento");
                    int fechaDeLanzamientoSerie = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Ingresa las temporadas de la serie");
                    int temporadas = teclado.nextInt();
                    teclado.nextLine();

                    Serie serieUsuario = new Serie();

                    serieUsuario.setNombre(nombreSerie);
                    serieUsuario.setFechaDeLanzamiento(fechaDeLanzamientoSerie);
                    serieUsuario.setTemporadas(temporadas);
                    serieUsuario.muestraFichaTecnica();

                case 9:
                    System.out.println("Finalizando el programa");
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }

        }

    }

}
