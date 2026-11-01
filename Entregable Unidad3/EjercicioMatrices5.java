import java.util.Scanner;

public class EjercicioMatrices5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Inicializar la matriz de 4x4[cite: 1]
        int[][] matriz = new int[4][4];

        System.out.println("--- Matriz 4x4 Generada ---");
        
        // Rellenar la matriz con números aleatorios (ej. del 1 al 20)[cite: 1]
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = (int) (Math.random() * 20) + 1;
                System.out.print("[" + matriz[i][j] + "]\t");
            }
            System.out.println(); // Salto de línea para formato de tabla
        }

        // Solicitar el número a buscar[cite: 1]
        System.out.print("\nIngrese el número entero que desea buscar en la matriz: ");
        int numeroBuscado = scanner.nextInt();

        boolean encontrado = false;

        System.out.println("\n--- Resultados de la búsqueda ---");
        
        // Recorrer la matriz para encontrar coincidencias[cite: 1]
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (matriz[i][j] == numeroBuscado) {
                    // Sumamos 1 a 'i' y a 'j' para que la coordenada sea visualmente del 1 al 4
                    System.out.println("- Encontrado en la coordenada: Fila " + (i + 1) + ", Columna " + (j + 1));
                    encontrado = true;
                }
            }
        }

        // Si la bandera no cambió a true, el número no existe en la matriz[cite: 1]
        if (!encontrado) {
            System.out.println("El número " + numeroBuscado + " no se encuentra en ninguna posición.");
        }

        scanner.close();
    }
}