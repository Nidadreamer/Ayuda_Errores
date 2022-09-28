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

      if (sexo == "H") {
          System.out.println("Introduce el peso en kg:");
           double peso = scanner.nextInt();

          System.out.println("Introduce la altura en cm:");
           int altura = scanner.nextInt();

          System.out.println("Introduce la edad en año:");
           int years = scanner.nextInt();

          double calculo = (10 * peso) + (6.25 * altura) - (5 * years) + 5;

      System.out.println("Las calorías que necesita este hombre son: " + calculo);
      }
      else  {
        System.out.println("Introduce el peso en kg:");
        double peso = scanner.nextInt();

        System.out.println("Introduce la altura en cm:");
        int altura = scanner.nextInt();

        System.out.println("Introduce la edad en año:");
        int years = scanner.nextInt();

        double calculo = (10 * peso) + (6.25 * altura) - (5 * years) - 161;

        System.out.println("Las calorías que necesita este hombre son: " + calculo);
      }
    }
}
