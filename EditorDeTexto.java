import java.util.Scanner;
import java.util.Stack;

public class EditorDeTexto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> pilaTexto = new Stack<>();
        Stack<String> pilaDeshecho = new Stack<>();
        String entrada;

        // Mostrar menú inicial
        System.out.println("Bienvenido al Editor de Texto Simple");
        System.out.println("Comandos disponibles:");
        System.out.println("  - Escriba una línea de texto para agregarla.");
        System.out.println("  - DESHACER: Revierte la última acción.");
        System.out.println("  - REHACER: Restaura la última acción deshecha.");
        System.out.println("  - MOSTRAR: Muestra el estado actual del texto.");
        System.out.println("  - SALIR: Finaliza el programa.");
        System.out.println("-------------------");

        while (true) {
            System.out.print("> ");
            entrada = scanner.nextLine();

            switch (entrada.toUpperCase()) {
                case "DESHACER":
                    if (!pilaTexto.isEmpty()) {
                        pilaDeshecho.push(pilaTexto.pop());
                        System.out.println("Última acción deshecha.");
                    } else {
                        System.out.println("No hay acciones para deshacer.");
                    }
                    break;

                case "REHACER":
                    if (!pilaDeshecho.isEmpty()) {
                        pilaTexto.push(pilaDeshecho.pop());
                        System.out.println("Última acción rehecha.");
                    } else {
                        System.out.println("No hay acciones para rehacer.");
                    }
                    break;

                case "MOSTRAR":
                    System.out.println("Texto actual:");
                    if (pilaTexto.isEmpty()) {
                        System.out.println("(Vacío)");
                    } else {
                        for (String linea : pilaTexto) {
                            System.out.println(linea);
                        }
                    }
                    break;

                case "SALIR":
                    System.out.println("Saliendo del editor de texto. ¡Hasta luego!");
                    scanner.close();
                    return;

                default:
                    pilaTexto.push(entrada);
                    pilaDeshecho.clear(); // Limpiar la pila de deshecho al agregar nueva entrada
                    System.out.println("Texto agregado: " + entrada);
                    break;
            }
        }
    }
}