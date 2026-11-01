import java.util.InputMismatchException;
import java.util.Scanner;

public class EjemplosExcepciones {
    public static void main(String[] args) {
        
        System.out.println("--- 1. ArithmeticException ---");
        try {
            int resultado = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Error capturado: No es posible dividir un número entre cero.");
        }

        System.out.println("\n--- 2. ArrayIndexOutOfBoundsException ---");
        try {
            int[] numeros = {1, 2, 3};
            int valorInvalido = numeros[5]; // El índice 5 no existe
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error capturado: Intentaste acceder a una posición fuera de los límites del vector.");
        }

        System.out.println("\n--- 3. NullPointerException ---");
        try {
            String texto = null;
            int longitud = texto.length(); // No se puede medir la longitud de un objeto nulo
        } catch (NullPointerException e) {
            System.out.println("Error capturado: El objeto no ha sido inicializado (es null).");
        }

        System.out.println("\n--- 4. NumberFormatException ---");
        try {
            String letras = "CientoVeinte";
            int numeroConvertido = Integer.parseInt(letras); // Intenta convertir letras a entero
        } catch (NumberFormatException e) {
            System.out.println("Error capturado: La cadena de texto no tiene un formato numérico válido.");
        }

        System.out.println("\n--- 5. InputMismatchException ---");
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Simulación - Ingresa una letra en lugar de un número: ");
            // Si el usuario teclea una letra, nextInt() fallará
            int entrada = scanner.nextInt(); 
        } catch (InputMismatchException e) {
            System.out.println("Error capturado: El tipo de dato ingresado por teclado no coincide con el esperado.");
        } finally {
            scanner.close(); // El bloque finally siempre se ejecuta, ideal para cerrar recursos
        }
        
        System.out.println("\nEjecución finalizada con éxito. El programa no se cerró abruptamente.");
    }
}