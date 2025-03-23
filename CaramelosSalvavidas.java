import java.util.Stack;
import java.util.Scanner;

public class CaramelosSalvavidas {

    public static void main(String[] args) {
        Stack<String> paquete = new Stack<>();
        Stack<String> temporal = new Stack<>();
        Scanner scanner = new Scanner(System.in);

        // Llenar el paquete con caramelos de diferentes colores
        paquete.push("Rojo");
        paquete.push("Amarillo");
        paquete.push("Verde");
        paquete.push("Amarillo");
        paquete.push("Azul");
        paquete.push("Amarillo");

        System.out.println("Paquete inicial: " + paquete);

        // Proceso de selección de caramelos
        while (!paquete.isEmpty()) {
            // Precondición: La pila no debe estar vacía.
            String caramelo = paquete.pop(); // Sacar un caramelo
            if (caramelo.equals("Amarillo")) {
                System.out.println("¡Caramelo amarillo encontrado! El niño se lo come.");
            } else {
                System.out.println("Caramelo " + caramelo + " guardado para devolver.");
                temporal.push(caramelo); // Guardar en la pila temporal
            }
            // Postcondición: El caramelo se elimina de la pila original y se procesa según su color.
        }

        // Devolver los caramelos no deseados al paquete
        while (!temporal.isEmpty()) {
            // Precondición: La pila temporal no debe estar vacía.
            paquete.push(temporal.pop()); // Devolver a la pila original
            // Postcondición: Los caramelos no deseados se restauran en la pila original en el orden correcto.
        }

        System.out.println("Paquete final después de devolver los caramelos: " + paquete);
    }
}