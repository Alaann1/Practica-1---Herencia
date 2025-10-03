public class Main {
    public static void main(String[] args) {
        Auto miAuto = new Auto();
        miAuto.marca = "Toyota";
        miAuto.modelo = "Corolla";
        miAuto.tipoDeCombustible = "Gasolina";

        Motocicleta miMoto = new Motocicleta();
        miMoto.marca = "Yamaha";
        miMoto.modelo = "FZ";
        miMoto.tipoDeCombustible = "Gasolina";

        Camioneta miCamioneta = new Camioneta();
        miCamioneta.marca = "Ford";
        miCamioneta.modelo = "Ranger";
        miCamioneta.cargaMaxima = 1200;

        iniciarVehiculo(miAuto);
        iniciarVehiculo(miMoto);
        iniciarVehiculo(miCamioneta);

        miCamioneta.mostrarCarga();
    }

    // Método polimórfico
    public static void iniciarVehiculo(Vehiculo vehiculo) {
        vehiculo.encender(); // Ejecuta el método sobrescrito en la subclase correspondiente
    }
}

// Superclase
class Vehiculo {
    String marca;
    String modelo;

    void encender() {
        System.out.println("El vehículo está encendido.");
    }
}

// Subclase Auto
class Auto extends Vehiculo {
    String tipoDeCombustible;

    @Override
    void encender() {
        System.out.println("El auto está encendido.");
    }
}

// Subclase Motocicleta
class Motocicleta extends Vehiculo {
    String tipoDeCombustible;

    @Override
    void encender() {
        System.out.println("La motocicleta está encendida.");
    }
}

// Subclase Camioneta
class Camioneta extends Vehiculo {
    double cargaMaxima;  // en kilogramos

    @Override
    void encender() {
        System.out.println("La camioneta está encendida.");
    }

    void mostrarCarga() {
        System.out.println("Carga máxima: " + cargaMaxima + " kg");
    }
}
