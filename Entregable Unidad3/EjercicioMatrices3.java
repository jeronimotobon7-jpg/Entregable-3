import java.util.Scanner;
public class EjercicioMatrices3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declarar la matriz de 3x4
        int[][] matriz = new int[3][4];

        System.out.println("--- Ingreso de valores para la matriz 3x4 ---");

        // Llenar la matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Ingrese el valor [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Mostrar la matriz para visualizarla mejor
        System.out.println("\n--- Matriz ingresada ---");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("[" + matriz[i][j] + "] ");
            }
            System.out.println(); 
        }

        System.out.println("\n--- Sumatoria ---");

        // Calcular e imprimir la suma de cada fila
        for (int i = 0; i < 3; i++) {
            int sumaFila = 0; // Se reinicia a 0 en cada nueva fila
            for (int j = 0; j < 4; j++) {
                sumaFila += matriz[i][j];
            }
            System.out.println("La suma de la fila " + i + " es: " + sumaFila);
        }

        // Calcular e imprimir la suma de cada columna
        // El truco aquí es invertir los ciclos: primero avanzamos por columnas (j) y luego por filas (i)
        for (int j = 0; j < 4; j++) {
            int sumaColumna = 0; // Se reinicia a 0 en cada nueva columna
            for (int i = 0; i < 3; i++) {
                sumaColumna += matriz[i][j];
            }
            System.out.println("La suma de la columna " + j + " es: " + sumaColumna);
        }

        scanner.close();
    }
}
