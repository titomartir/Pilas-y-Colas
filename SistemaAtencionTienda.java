import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SistemaAtencionTienda {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<String> colaClientes = new LinkedList<>();
        String entrada;

        // Menú inicial
        System.out.println("Bienvenido al Sistema de Atención de la Tienda");
        System.out.println("Comandos disponibles:");
        System.out.println("  - LLEGAR [nombre]: Agrega un cliente a la fila.");
        System.out.println("  - ATENDER: Atiende al primer cliente en la fila.");
        System.out.println("  - MOSTRAR: Muestra el estado actual de la fila.");
        System.out.println("  - SALIR: Finaliza el programa.");
        System.out.println("---------------------------------------------");

        while (true) {
            System.out.print("> ");
            entrada = scanner.nextLine();

            if (entrada.toUpperCase().startsWith("LLEGAR")) {
                // Agregar cliente a la cola
                String nombre = entrada.substring(7).trim(); // Extraer el nombre
                if (!nombre.isEmpty()) {
                    colaClientes.add(nombre);
                    System.out.println(nombre + " ha sido agregado a la fila.");
                } else {
                    System.out.println("Error: Debes ingresar un nombre después de 'LLEGAR'.");
                }
            } else if (entrada.equalsIgnoreCase("ATENDER")) {
                // Atender al primer cliente
                if (!colaClientes.isEmpty()) {
                    String clienteAtendido = colaClientes.poll();
                    System.out.println("Atendiendo a: " + clienteAtendido);
                } else {
                    System.out.println("No hay clientes en la fila.");
                }
            } else if (entrada.equalsIgnoreCase("MOSTRAR")) {
                // Mostrar la fila actual
                if (colaClientes.isEmpty()) {
                    System.out.println("Fila actual: (Vacía)");
                } else {
                    System.out.println("Fila actual: " + String.join(", ", colaClientes));
                }
            } else if (entrada.equalsIgnoreCase("SALIR")) {
                // Salir del programa
                System.out.println("Saliendo del sistema. ¡Hasta luego!");
                scanner.close();
                return;
            } else {
                // Comando no reconocido
                System.out.println("Comando no válido. Intenta de nuevo.");
            }
        }
    }
}