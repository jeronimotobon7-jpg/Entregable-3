import java.util.Scanner;
public class EjercicioMatrices2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declarar la matriz original y la transpuesta de 4x4
        int[][] matrizOriginal = new int[4][4];
        int[][] matrizTranspuesta = new int[4][4];

        System.out.println("--- Ingreso de valores para la matriz 4x4 ---");
        
        // Llenar la matriz original y calcular la transpuesta simultáneamente
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Ingrese el valor [" + i + "][" + j + "]: ");
                matrizOriginal[i][j] = scanner.nextInt();
                
                // La magia de la transpuesta: invertir los índices
                matrizTranspuesta[j][i] = matrizOriginal[i][j];
            }
        }

        // Mostrar la matriz original
        System.out.println("\n--- Matriz Original ---");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("[" + matrizOriginal[i][j] + "] ");
            }
            System.out.println(); // Salto de línea para dar formato de tabla
        }

        // Mostrar la matriz transpuesta[cite: 1]
        System.out.println("\n--- Matriz Transpuesta ---");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("[" + matrizTranspuesta[i][j] + "] ");
            }
            System.out.println(); // Salto de línea para dar formato de tabla
        }

        scanner.close();
    }
        
}
