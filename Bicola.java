import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Bicola {

    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        String comando;

        System.out.println("Bienvenido al Sistema de Bicola (Deque)");
        System.out.println("Comandos disponibles:");
        System.out.println("  - ADD_FIRST [nombre]: Agrega un elemento al frente.");
        System.out.println("  - ADD_LAST [nombre]: Agrega un elemento al final.");
        System.out.println("  - REMOVE_FIRST: Elimina el elemento del frente.");
        System.out.println("  - REMOVE_LAST: Elimina el elemento del final.");
        System.out.println("  - PEEK_FIRST: Muestra el elemento del frente.");
        System.out.println("  - PEEK_LAST: Muestra el elemento del final.");
        System.out.println("  - MOSTRAR: Muestra todos los elementos.");
        System.out.println("  - SALIR: Finaliza el programa.");
        System.out.println("---------------------------------------------");

        while (true) {
            System.out.print("> ");
            comando = scanner.nextLine();

            if (comando.toUpperCase().startsWith("ADD_FIRST")) {
                // Precondición: Ninguna
                String elemento = comando.substring(10).trim();
                if (!elemento.isEmpty()) {
                    deque.addFirst(elemento);
                    System.out.println("Elemento agregado al frente: " + elemento);
                } else {
                    System.out.println("Error: Debes ingresar un nombre después de 'ADD_FIRST'.");
                }
                // Postcondición: El tamaño de la bicola aumenta en 1, y el nuevo elemento es el primero.
            } else if (comando.toUpperCase().startsWith("ADD_LAST")) {
                // Precondición: Ninguna
                String elemento = comando.substring(9).trim();
                if (!elemento.isEmpty()) {
                    deque.addLast(elemento);
                    System.out.println("Elemento agregado al final: " + elemento);
                } else {
                    System.out.println("Error: Debes ingresar un nombre después de 'ADD_LAST'.");
                }
                // Postcondición: El tamaño de la bicola aumenta en 1, y el nuevo elemento es el último.
            } else if (comando.equalsIgnoreCase("REMOVE_FIRST")) {
                // Precondición: La bicola no debe estar vacía.
                if (!deque.isEmpty()) {
                    System.out.println("Elemento eliminado del frente: " + deque.removeFirst());
                } else {
                    System.out.println("La bicola está vacía.");
                }
                // Postcondición: El tamaño de la bicola disminuye en 1, y el primer elemento es eliminado.
            } else if (comando.equalsIgnoreCase("REMOVE_LAST")) {
                // Precondición: La bicola no debe estar vacía.
                if (!deque.isEmpty()) {
                    System.out.println("Elemento eliminado del final: " + deque.removeLast());
                } else {
                    System.out.println("La bicola está vacía.");
                }
                // Postcondición: El tamaño de la bicola disminuye en 1, y el último elemento es eliminado.
            } else if (comando.equalsIgnoreCase("PEEK_FIRST")) {
                // Precondición: La bicola no debe estar vacía.
                if (!deque.isEmpty()) {
                    System.out.println("Elemento en el frente: " + deque.peekFirst());
                } else {
                    System.out.println("La bicola está vacía.");
                }
                // Postcondición: La bicola permanece sin cambios.
            } else if (comando.equalsIgnoreCase("PEEK_LAST")) {
                // Precondición: La bicola no debe estar vacía.
                if (!deque.isEmpty()) {
                    System.out.println("Elemento en el final: " + deque.peekLast());
                } else {
                    System.out.println("La bicola está vacía.");
                }
                // Postcondición: La bicola permanece sin cambios.
            } else if (comando.equalsIgnoreCase("MOSTRAR")) {
                // Precondición: Ninguna.
                if (!deque.isEmpty()) {
                    System.out.println("Elementos en la bicola: " + deque);
                } else {
                    System.out.println("La bicola está vacía.");
                }
                // Postcondición: Ninguna.
            } else if (comando.equalsIgnoreCase("SALIR")) {
                System.out.println("Saliendo del sistema. ¡Hasta luego!");
                scanner.close();
                return;
            } else {
                System.out.println("Comando no válido. Intenta de nuevo.");
            }
        }
    }
}