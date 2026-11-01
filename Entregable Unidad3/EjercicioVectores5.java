import java.util.Scanner;
public class EjercicioVectores5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // declarar los vectores
        String[] nombres = new String[5];
        double[] notas = new double[5];
        
        double suma = 0;

        System.out.println("--- Ingreso de Estudiantes y Notas ---");

        // llenar ambos vectores y sumar las notas
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese el nombre del estudiante " + (i + 1) + ": ");
            nombres[i] = scanner.nextLine(); // Lee el nombre completo
            
            System.out.print("Ingrese la calificación de " + nombres[i] + ": ");
            notas[i] = scanner.nextDouble(); // Lee la nota
            
            // Limpieza del buffer del teclado ("enter" residual) para que el próximo nextLine() no falle
            scanner.nextLine();
            
            // Acumular la suma para el promedio
            suma += notas[i];
        }

        // calcular el promedio general del grupo
        double promedio = suma / 5;

        System.out.println("\n--- Resultados ---");
        System.out.println("El promedio general del grupo es: " + promedio);
        System.out.println("\nEstudiantes con calificación mayor o igual al promedio:");

        // mostrar los alumnos que superan o igualan el promedio
        for (int i = 0; i < 5; i++) {
            if (notas[i] >= promedio) {
                System.out.println("- " + nombres[i] + " (Nota: " + notas[i] + ")");
            }
        }

        scanner.close();
    }
}
