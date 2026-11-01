import java.util.Scanner;
public class EjercicioMatrices1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // declarar la matriz y la variable suma
        int[][] matriz = new int[3][3];
        int suma = 0;

        System.out.println("--- Ingreso de valores para la matriz 3x3 ---");

        // primer recorrido: Llenar la matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Ingrese el valor para la posición [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\n--- Matriz 3x3 ---");
        
        // Segundo recorrido: Mostrar la matriz y calcular la suma
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matriz[i][j] + "] "); // Imprime el elemento en la fila
                suma += matriz[i][j]; // Acumula el valor
            }
            System.out.println(); // Salto de línea al terminar cada fila para dar forma de cuadrícula
        }

        // Mostrar el resultado final
        System.out.println("\nLa suma total de los elementos de la matriz es: " + suma);

        scanner.close();
    }
}
