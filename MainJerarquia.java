public class MainJerarquia {
    public static void main(String[] args) {
        Auto miAuto = new Auto("Toyota", "Corolla", "Gasolina");
        Deportivo miDeportivo = new Deportivo("Ferrari", "F8", "Gasolina", 330);
        Electrico miElectrico = new Electrico("Tesla", "Model 3", 75);
        Motocicleta miMoto = new Motocicleta("Yamaha", "FZ", "Gasolina");
        Scooter miScooter = new Scooter("Honda", "PCX", "Gasolina");
        Camioneta miCamioneta = new Camioneta("Ford", "Ranger", 1200);
        Pickup miPickup = new Pickup("Chevrolet", "Silverado", 1500);
        
        Vehiculo[] vehiculos = {miAuto, miDeportivo, miElectrico, miMoto, miScooter, miCamioneta, miPickup};
        
        for (Vehiculo v : vehiculos) {
            v.encender();
            System.out.println(v);
            System.out.println("-------------------");
        }
    }
}

// Superclase
class Vehiculo {
    String marca;
    String modelo;

    Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    void encender() {
        System.out.println("El vehículo está encendido.");
    }

    @Override
    public String toString() {
        return "Marca: " + marca + ", Modelo: " + modelo;
    }
}

// Subclase Auto
class Auto extends Vehiculo {
    String tipoDeCombustible;

    Auto(String marca, String modelo, String tipoDeCombustible) {
        super(marca, modelo);
        this.tipoDeCombustible = tipoDeCombustible;
    }

    @Override
    void encender() {
        System.out.println("El auto está encendido.");
    }

    @Override
    public String toString() {
        return super.toString() + ", Combustible: " + tipoDeCombustible;
    }
}

// Subclase Deportivo (hereda de Auto)
class Deportivo extends Auto {
    int velocidadMaxima;

    Deportivo(String marca, String modelo, String tipoDeCombustible, int velocidadMaxima) {
        super(marca, modelo, tipoDeCombustible);
        this.velocidadMaxima = velocidadMaxima;
    }

    @Override
    void encender() {
        System.out.println("El deportivo está encendido.");
    }

    @Override
    public String toString() {
        return super.toString() + ", Velocidad máxima: " + velocidadMaxima + " km/h";
    }
}

// Subclase Electrico (hereda de Auto)
class Electrico extends Auto {
    int capacidadBateria; // en kWh

    Electrico(String marca, String modelo, int capacidadBateria) {
        super(marca, modelo, "Eléctrico");
        this.capacidadBateria = capacidadBateria;
    }

    @Override
    void encender() {
        System.out.println("El auto eléctrico está encendido.");
    }

    @Override
    public String toString() {
        return super.toString() + ", Capacidad batería: " + capacidadBateria + " kWh";
    }
}

// Subclase Motocicleta
class Motocicleta extends Vehiculo {
    String tipoDeCombustible;

    Motocicleta(String marca, String modelo, String tipoDeCombustible) {
        super(marca, modelo);
        this.tipoDeCombustible = tipoDeCombustible;
    }

    @Override
    void encender() {
        System.out.println("La motocicleta está encendida.");
    }

    @Override
    public String toString() {
        return super.toString() + ", Combustible: " + tipoDeCombustible;
    }
}

// Subclase Scooter (hereda de Motocicleta)
class Scooter extends Motocicleta {
    Scooter(String marca, String modelo, String tipoDeCombustible) {
        super(marca, modelo, tipoDeCombustible);
    }

    @Override
    void encender() {
        System.out.println("El scooter está encendido.");
    }
}

// Subclase Camioneta
class Camioneta extends Vehiculo {
    double cargaMaxima;

    Camioneta(String marca, String modelo, double cargaMaxima) {
        super(marca, modelo);
        this.cargaMaxima = cargaMaxima;
    }

    @Override
    void encender() {
        System.out.println("La camioneta está encendida.");
    }

    @Override
    public String toString() {
        return super.toString() + ", Carga máxima: " + cargaMaxima + " kg";
    }
}

// Subclase Pickup (hereda de Camioneta)
class Pickup extends Camioneta {
    Pickup(String marca, String modelo, double cargaMaxima) {
        super(marca, modelo, cargaMaxima);
    }

    @Override
    void encender() {
        System.out.println("La pickup está encendida.");
    }
}
