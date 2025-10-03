import java.util.List;
import java.util.ArrayList;

// Superclase Empleado
class Empleado {
    protected String nombre;
    protected int id;
    protected double salarioBase;

    public Empleado(String nombre, int id, double salarioBase) {
        this.nombre = nombre;
        this.id = id;
        this.salarioBase = salarioBase;
    }

    // Método calculo salario con implementación base (puede ser simple)
    public double calcularSalario() {
        return salarioBase;
    }

    public void mostrarInformacion() {
        System.out.println("ID: " + id + ", Nombre: " + nombre + ", Salario Base: $" + salarioBase);
    }
}

// Subclase Gerente
class Gerente extends Empleado {
    private double bonoAnual;

    public Gerente(String nombre, int id, double salarioBase, double bonoAnual) {
        super(nombre, id, salarioBase);
        this.bonoAnual = bonoAnual;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + bonoAnual;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Bono Anual: $" + bonoAnual);
    }
}

// Subclase Desarrollador
class Desarrollador extends Empleado {
    private int proyectosAsignados;

    public Desarrollador(String nombre, int id, double salarioBase, int proyectosAsignados) {
        super(nombre, id, salarioBase);
        this.proyectosAsignados = proyectosAsignados;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + (500 * proyectosAsignados);
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Proyectos Asignados: " + proyectosAsignados);
    }
}

// Subclase Administrativo
class Administrativo extends Empleado {
    private int horasExtra;

    public Administrativo(String nombre, int id, double salarioBase, int horasExtra) {
        super(nombre, id, salarioBase);
        this.horasExtra = horasExtra;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + (20 * horasExtra);
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Horas Extra: " + horasExtra);
    }
}

// Clase para gestión de personal y generación de informes
class GestionPersonal {
    public static void generarInforme(List<Empleado> empleados) {
        System.out.println("----- Informe de Empleados -----");
        for (Empleado e : empleados) {
            e.mostrarInformacion();
            System.out.println("Salario calculado: $" + e.calcularSalario());
            System.out.println("----------------------------");
        }
    }
}

// Clase Main para probar
public class MainEmpleados {
    public static void main(String[] args) {
        List<Empleado> empleados = new ArrayList<>();

        empleados.add(new Gerente("Ana", 101, 5000, 1200));
        empleados.add(new Desarrollador("Luis", 102, 3500, 3));
        empleados.add(new Administrativo("Maria", 103, 3000, 10));

        GestionPersonal.generarInforme(empleados);
    }
}
