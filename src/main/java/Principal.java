import gestion.Veterinaria;
import mascotas.Perro;
import mascotas.Gato;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Veterinaria veterinaria = new Veterinaria();
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\n --- Veterinaria ___ ---");
            System.out.println("1. Añadir perro");
            System.out.println("2. Añadir gato");
            System.out.println("3. Eliminar mascota");
            System.out.println("4. Listar mascotas");
            System.out.println("5. Salir");
            System.out.println("Elige una opción:");

            opcion = sc.nextInt();
            sc.nextLine();  //limpiamos el buffer

            switch (opcion) {
                case 1 -> añadirPerro(veterinaria, sc);
                case 2 -> añadirGato(veterinaria, sc);
                case 3 -> eliminarMascota(veterinaria, sc);
                case 4 -> veterinaria.listarMascotas();
                case 5 -> System.out.println("Saliendo");
                default -> System.out.println("Opción inválida");
            }
        } while (opcion != 5);
    }

    private static void eliminarMascota(Veterinaria veterinaria, Scanner sc) {
        System.out.println("ID de mascota: ");
        int id = sc.nextInt();
        veterinaria.eliminarMascota(id);
    }

    private static void añadirGato(Veterinaria veterinaria, Scanner sc) {
        System.out.println("Nombre del gato: ");
        String nombre = sc.nextLine();
        System.out.println("Nombre del dueño: ");
        String dueño = sc.nextLine();
        System.out.println("Edad: ");
        int edad = sc.nextInt();
        sc.nextLine();
        System.out.println("Fecha registro:");
        String fechaRegistro = sc.nextLine();
        System.out.println("¿Es peludo?: ");
        boolean esPeludo = sc.nextBoolean();

        veterinaria.añadirMascota(new Gato(nombre,dueño,edad,fechaRegistro,esPeludo));
    }

    private static void añadirPerro(Veterinaria veterinaria, Scanner sc) {

        System.out.println("Nombre del perro: ");
        String nombre = sc.nextLine();
        System.out.println("Nombre del dueño: ");
        String dueño = sc.nextLine();
        System.out.println("Edad: ");
        int edad = sc.nextInt();
        sc.nextLine();
        System.out.println("Fecha registro:");
        String fechaRegistro = sc.nextLine();
        System.out.println("Raza: ");
        String raza = sc.nextLine();

        veterinaria.añadirMascota(new Perro(nombre,dueño,edad,fechaRegistro,raza));
    }


}
