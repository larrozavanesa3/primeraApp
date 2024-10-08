//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Bienvenido(a) a Screen Match");
        System.out.println("Pelicula Matrix");

    int fechaDeLanzamiento = 1999;
    boolean incluidoEnElPlan = true;
    double notaDeLaPelicula = 8.2;

    double media = 7.733333333333333;
        System.out.println(media);

        String sinopsis = """ 
                Es una película de ciencia ficción que plantea un mundo donde la realidad que conocemos es en realidad una simulación creada por máquinas inteligentes. 
                Los humanos están atrapados en esta simulación, llamada Matrix, y son utilizados como fuente de energía
                Fue lanzada en :
                """ + fechaDeLanzamiento;
        System.out.println(sinopsis);


        int clasificacion = (int) (media / 2);
        System.out.println(clasificacion);


    }
}
