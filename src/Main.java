import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Zoologico zoologico = new Zoologico();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nMenú del Zoológico");
            System.out.println("1. Agregar León");
            System.out.println("2. Agregar Elefante");
            System.out.println("3. Agregar Pájaro");
            System.out.println("4. Mostrar Animales");
            System.out.println("5. Realizar Acciones");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();  // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del león: ");
                    String nombreLeon = scanner.nextLine();
                    System.out.print("Ingrese la comida del león: ");
                    String comidaLeon = scanner.nextLine();
                    scanner.nextLine();  // Limpiar buffer
                    zoologico.agregarAnimal(new Leon(nombreLeon, comidaLeon));
                    break;
                case 2:
                    System.out.print("Ingrese el nombre del elefante: ");
                    String nombreElefante = scanner.nextLine();
                    System.out.print("Ingrese la comida del elefante: ");
                    String comidaElefante = scanner.nextLine();
                    scanner.nextLine();  // Limpiar buffer
                    zoologico.agregarAnimal(new Elefante(nombreElefante, comidaElefante));
                    break;
                case 3:
                    System.out.print("Ingrese el nombre del pájaro: ");
                    String nombrePajaro = scanner.nextLine();
                    System.out.print("Ingrese la comida del pájaro: ");
                    String comidaPajaro = scanner.nextLine();
                    scanner.nextLine();  // Limpiar buffer
                    zoologico.agregarAnimal(new Pajaro(nombrePajaro, comidaPajaro));
                    break;
                case 4:
                    zoologico.mostrarAnimales();
                    break;
                case 5:
                    zoologico.realizarAcciones();
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 6);

        scanner.close();
    }
}
