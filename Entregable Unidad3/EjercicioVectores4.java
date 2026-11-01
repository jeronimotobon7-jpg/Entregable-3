import java.util.Scanner;
public class EjercicioVectores4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] paises = {"Colombia", "Alemania", "Francia", "Italia", "Inglaterra", "Portugal", "Cabo Verde", "Brasil", "Argentina", "Noruega"};
        System.out.println(" Ingrese el nombre de un país para buscar su posición en el vector:");
        String paisBuscado = scanner.nextLine();

        boolean encontrado = false;
        int posicion = -1;

        for (int i = 0; i < paises.length; i++) {
            if (paises[i].equalsIgnoreCase(paisBuscado)) {
                encontrado = true;
                posicion = i;
                break;
            }
        }
        if (encontrado) {
            System.out.println("El país " + paisBuscado + " se encuentra en la posición: " + posicion);
        } else {
            System.out.println("El país " + paisBuscado + " no se encuentra en el vector.");
        }

        scanner.close();
    }
}
