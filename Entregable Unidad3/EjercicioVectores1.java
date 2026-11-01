import java.util.Scanner;
public class EjercicioVectores1{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // 1. Declarar un vector de enteros con capacidad para 10 elementos
        int[] numeros = new int[10];
        
        // Variable para acumular la suma
        int suma = 0;
        
        System.out.println("Por favor, ingrese 10 números enteros:");

        // 2. Llenar el vector por teclado mediante un ciclo for
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el valor para la posición " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
            
            // 3. Calcular la suma total acumulando en cada iteración
            suma += numeros[i];
        }

        // 4. Calcular el promedio
        // Convertimos la suma a double para no perder los decimales en la división
        double promedio = (double) suma / numeros.length;
        
        // 5. Mostrar los resultados
        System.out.println("\n--- Resultados ---");
        System.out.println("Suma total de los elementos: " + suma);
        System.out.println("Promedio de los elementos: " + promedio);
        
        scanner.close();
    }
}