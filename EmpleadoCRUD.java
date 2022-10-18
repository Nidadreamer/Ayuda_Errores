package OOP.Interfaces;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoCRUD {

    // Creamos una base de datos dinamica, para poder aumentar los datos
    // Array list
    public static List<Empleado>trabajador = new ArrayList<>();

    // OPERACIONES CRUD
    // Método para guardar / crear empleados "por ejemplo, en base de datos SQL
    public void guardar(Empleado empleado){
        trabajador.add(empleado);}

    // Buscar empleados
    public static List<Empleado> verTrabajadores(){
        return trabajador;
    }



}
