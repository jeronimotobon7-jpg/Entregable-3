import java.util.Scanner;
public class EjercicioVectores2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // declara un vector de dobles con capacidad para 8 elementos
        double[] numeros = new double[8];

        // llenar el vector por teclado mediante un ciclo for
        System.out.println("Por favor, ingrese 8 números decimales:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el número para la posición " + i + ": ");
            numeros[i] = scanner.nextDouble();
        }

        //Inicializar variables
        double mayor = numeros[0];
        double menor = numeros[0];
        int posicionMayor = 0;
        int posicionMenor = 0;

        // recorrer el arreglo para encontrar el mayor y menor número y sus posiciones
        for (int i = 1; i < numeros.length; i++) {
            // Evaluar si encontramos un nuevo número mayor
            if (numeros[i] > mayor) {
                mayor = numeros[i];
                posicionMayor = i; // guardamos en que indice estaba
            }
            // Evaluar si encontramos un nuevo número menor
            if (numeros[i] < menor) {
                menor = numeros[i];
                posicionMenor = i; // guardamos en que indice estaba
            }
        }

        // mostrar los resultados
        System.out.println("\n--- Resultados de la Búsqueda ---");
        System.out.println("El número mayor es: " + mayor + " y se encuentra en la posición " + posicionMayor);
        System.out.println("El número menor es: " + menor + " y se encuentra en la posición " + posicionMenor);

        scanner.close();
    }
}
