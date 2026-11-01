import java.util.Scanner;
public class EjercicioMatrices4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tamaño (n) para la matriz cuadrada: ");
        int n = scanner.nextInt();

        // Crear una matriz cuadrada de tamaño n x n
        int[][] matriz = new int[n][n];
        int sumaDiagonal = 0;

        System.out.println("\n--- Matriz " + n + "x" + n + " Generada ---");

        // Rellenar con números enteros aleatorios entre 1 y 50
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Math.random() genera un decimal entre 0.0 y 0.99. 
                // Al multiplicarlo por 50, sumar 1 y convertir a int, obtenemos el rango de 1 a 50.
                matriz[i][j] = (int) (Math.random() * 50) + 1;
                
                System.out.print("[" + matriz[i][j] + "]\t");

                // Calcular la suma donde el índice de la fila es igual al de la columna
                if (i == j) {
                    sumaDiagonal += matriz[i][j];
                }
            }
            System.out.println(); // Salto de línea para la siguiente fila
        }

        // Mostrar el resultado
        System.out.println("\nLa suma de la diagonal principal es: " + sumaDiagonal);

        scanner.close();
    }
    
}
