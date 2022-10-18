package OOP.Interfaces;

public class Empleado {

    String nombre;
    int edad;
    double salario;
    boolean alta;

    public Empleado(){}

    public Empleado(String nombre, int edad, double salario, boolean alta){

    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", salario=" + salario +
                ", alta=" + alta +
                '}';
    }
}
