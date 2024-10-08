import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota = 0;
        double mediaEvaluaciones = 0;

        for (int i = 0; i < 3 ; i++) {
            System.out.println("¿Cual es tu valoración general de esta película Matrix?");
            nota = teclado.nextDouble();
            mediaEvaluaciones = mediaEvaluaciones + nota;
        }

        System.out.println("Los usuarios han calificado a Matrix con un promedio de:" + mediaEvaluaciones /3);


    }
}
