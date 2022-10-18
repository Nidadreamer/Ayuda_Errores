package OOP.Interfaces;

import java.util.List;

public class MainInterfaces {

    public static void main(String[] args) {

        EmpleadoCRUD newEmpleadoC = new EmpleadoCRUD();

        Empleado Marcos = new Empleado("Marcos", 32, 1300, true);
        Empleado Patricia = new Empleado("Patricia", 26, 1300, true);
        Empleado Francisco = new Empleado("Francisco", 45, 1500, true);

        System.out.println("estos son los datos de un empleado ->" + Marcos);

        // Guardar empleados
        newEmpleadoC.guardar(Marcos);
        newEmpleadoC.guardar(Patricia);
        newEmpleadoC.guardar(Francisco);

        // Consultar empleados
        List<Empleado> empleados = EmpleadoCRUD.verTrabajadores();
        System.out.println(empleados);
    }
}

