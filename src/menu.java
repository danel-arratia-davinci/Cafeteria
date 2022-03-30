import java.util.Scanner;

public class menu {

    public static void mostrarMenu() {
        System.out.println("Bienvenido : ");
        String opcion;
        do {

            Scanner menu = new Scanner(System.in);

            System.out.println("-----------------------------------------");
            System.out.println("Bienvenido, este es el menù: ");

            System.out.println("_Productos Comestibles (A) \n.Facturas \n.Tortas \n.Galletas \n_Productos Bebidas (B) \n.Agua \n.Cafè \n.Jugos ");

            System.out.println("Opción E: Salir");

            System.out.println("-----------------------------------------");

              opcion = menu.nextLine();

            switch (opcion.toLowerCase()) {

                case "a":
                    System.out.println("1.Facturas \n2.Tortas \n3.Galletas" );


                    break;

                case "b":
                    System.out.println("1.Agua \n2.Cafè \nJugos");


                    break;


                case "c":

                    break;

                case "d":

                    break;

                case "e":
                    System.out.println("Adios");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opción inválida,intente de nuevo");
                    break;

            }
        }
        while (opcion != "e");
    }



}
