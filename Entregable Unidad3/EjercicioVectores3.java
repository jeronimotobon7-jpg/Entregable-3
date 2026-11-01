import java.util.Scanner;
public class EjercicioVectores3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // declara un vector de enteros con capacidad para 6 elementos
        int[] numeros = new int[6];
        System.out.println("Por favor, ingrese 6 números enteros:");

        // llenar el vector
        for (int i = 0; i < numeros.length; i++){
            System.out.print("Posicion " + i + ": ");
            numeros[i] = scanner.nextInt();
        }

        // mostrar el vector original
        System.out.print("\nVector original: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println(); // Salto de línea

        // invertir el vector
        for(int i = 0; i < numeros.length / 2; i++) {
            // Guardamos el número de la izquierda en la variable temporal
            int temp = numeros[i];

            // Pasamos el número de la derecha a la izquierda
            numeros[i] = numeros[numeros.length - 1 - i];

            // Pasamos el número de la variable temporal a la derecha
            numeros[numeros.length - 1 - i] = temp;
        }

        // 3. Mostrar el vector ya invertido
        System.out.print("Vector invertido: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();

        scanner.close();
    }
}
