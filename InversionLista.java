import java.util.Stack;

public class InversionLista {

    public static void invertirLista(String[] lista) {
        // Precondición: La lista no debe estar vacía.
        if (lista.length == 0) {
            System.out.println("La lista está vacía. No hay elementos para invertir.");
            return;
        }

        // Crear una pila vacía
        Stack<String> pila = new Stack<>();

        // Insertar todos los elementos de la lista en la pila
        for (String elemento : lista) {
            pila.push(elemento); // Insertar en la pila
        }

        // Extraer los elementos de la pila y sobrescribir la lista original
        for (int i = 0; i < lista.length; i++) {
            lista[i] = pila.pop(); // Extraer de la pila y asignar a la lista
        }

        // Postcondición: La lista original contiene los elementos en orden inverso.
    }

    public static void main(String[] args) {
        // Lista de ejemplo
        String[] lista = {"A", "B", "C", "D", "E"};

        System.out.println("Lista original: " + String.join(", ", lista));

        // Invertir la lista
        invertirLista(lista);

        System.out.println("Lista invertida: " + String.join(", ", lista));
    }
}