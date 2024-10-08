import java.util.Scanner;

public class Lectura {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Qué clásico del cine te gustaría volver a ver?");
        String pelicula = teclado.nextLine();
        System.out.println("¿Cuándo se estrenó esta película?");
        int fechaDeLanzamiento = teclado.nextInt();
        System.out.println("¿Qué calificación le darías a esta película?");
        double nota = teclado.nextDouble();

        System.out.println(pelicula);
        System.out.println(fechaDeLanzamiento);
        System.out.println(nota);


    }
}
