import java.util.Scanner;

public class FormulaHarrisBenedict {

    public static void main(String[] args) {

    /* Formula Harris - Benedict
        MB hombre: (10x peso en kg)+ (6.25 x altura en cm ) – (5 x edad en años) + 5
        MB mujer : (10 x peso en kg) + ( 6.25 x altura en cm ) – (5 x edad en años) – 161
     */

      Scanner scanner = new Scanner(System.in);
      System.out.println("Introduce el sexo: \nH si es hombres o M si es mujer");
      String sexo = String.valueOf(scanner.nextLine());

      if (sexo.toUpperCase() == "H") {
          System.out.println("Introduce el peso en kg:");
           double peso = scanner.nextDouble();
           double pesof = peso * 10;

          System.out.println("Introduce la altura en cm:");
           double altura = scanner.nextDouble();
           double alturaf = altura * 6.25;

          System.out.println("Introduce la edad en año:");
           double years = scanner.nextDouble();
           double yearsf = years * 5;

          System.out.println("Asigna la actividad estimada, introduce el número que corresponda \n<<usa el punto como en los ejemplos>>: \n1.2 -> Poco o ningún ejercicio" +
          "\n1.375 -> Ejercicio ligero (1-3 días a la semana)\n1.55 -> Ejercicio moderado (3-5 días a la semana)\n1.725 -> Ejercicio fuerte (6-7 días a la semana)" +
          "\n1.9 -> Ejercicio muy fuerte (dos veces al día, entrenamientos muy duros)");
          double actividad = scanner.nextDouble();

          double calculo = (pesof + alturaf - yearsf + 5) * actividad;

          System.out.println("Las calorías que necesita este hombre son: " + calculo);
      }
      else  {
          System.out.println("Introduce el peso en kg:");
          double peso = scanner.nextDouble();
          double pesof = peso * 10;

          System.out.println("Introduce la altura en cm:");
          double altura = scanner.nextDouble();
          double alturaf = altura * 6.25;

          System.out.println("Introduce la edad en año:");
          double years = scanner.nextDouble();
          double yearsf = years * 5;

          System.out.println("Asigna la actividad estimada, introduce el número que corresponda\n<<usa el punto como en los ejemplos>>: \n1.2 -> Poco o ningún ejercicio" +
          "\n1.375 -> Ejercicio ligero (1-3 días a la semana)\n1.55 -> Ejercicio moderado (3-5 días a la semana)\n1.725 -> Ejercicio fuerte (6-7 días a la semana)" +
          "\n1.9 -> Ejercicio muy fuerte (dos veces al día, entrenamientos muy duros)");
          double actividad = scanner.nextDouble();

          double calculo = (pesof + alturaf - yearsf - 161) * actividad;

          System.out.println("Las calorías que necesita esta mujer son: " + calculo);
      }
    }
}
