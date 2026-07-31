import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    private ArrayList<Vehiculo> vehiculos = new ArrayList<>();
    private Scanner consola = new Scanner(System.in);

    public void mostrarMenu() {
        int opcion;
        do {
            System.out.println("----------------------------------");
            System.out.println("1. Registrar un camión");
            System.out.println("2. Registrar un automóvil");
            System.out.println("3. Mostrar todos los vehículos con su costo de mantenimiento");
            System.out.println("4. Mostrar el costo total de mantenimiento de toda la flota");
            System.out.println("5. Buscar un vehículo por placa");
            System.out.println("6. Salir");
            System.out.println("----------------------------------");

            opcion = Integer.parseInt(consola.nextLine());

            switch (opcion) {
                case 1 -> registrarCamion();
                case 2 -> registrarAutomovil();
                case 3 -> vehiculosCostoMantenimiento();
                case 4 -> mantenimientoTotalFlota();
                case 5 -> buscarVehiculoPorPlaca();
                case 6 -> System.out.println("¡Hasta luego!");
                default -> System.out.println("Opción inválida");
            }

        } while (opcion != 6);
    }

    void registrarCamion() {
        System.out.print("Ingrese el Número de Placa: ");
        String placa = consola.nextLine();
        System.out.print("Ingrese la marca: ");
        String marca = consola.nextLine();
        System.out.print("Ingrese el Kilometraje: ");
        double kilometraje = consola.nextDouble();
        System.out.print("Ingrese la capacidad de carga: ");
        double capacidadCarga = consola.nextDouble();
        consola.nextLine();
        vehiculos.add(new Camion(placa, marca, kilometraje, capacidadCarga));
        System.out.println("Camión registrado con exito");
    }

    void registrarAutomovil() {
        System.out.print("Ingresar el Número de placa: ");
        String placa = consola.nextLine();
        System.out.print("Ingrese la marca: ");
        String marca = consola.nextLine();
        System.out.print("Ingrese el Kilometraje: ");
        double kilometraje = consola.nextDouble();
        System.out.print("Ingrese el número de pasajeros: ");
        int numPasajeros = consola.nextInt();
        consola.nextLine();
        vehiculos.add(new Automovil(placa, marca, kilometraje, numPasajeros));
        System.out.println("Vehiculo Registrado con exito");
    }

    void vehiculosCostoMantenimiento() {
        for (Vehiculo e : vehiculos) {
            e.mostrarInformacion();
            System.out.println("Costo Mantenimiento: " + e.calcularCostoMantenimiento());
        }
    }

    void mantenimientoTotalFlota() {
        if (vehiculos.isEmpty()) {
            System.out.println("No hay vehiculos registrados");
            return;
        }
        double mantenimientoFlota = 0;
        for (Vehiculo mantenimiento : vehiculos) {
            mantenimientoFlota += mantenimiento.calcularCostoMantenimiento();
        }
        System.out.println("Mantenimiento flota: " + mantenimientoFlota);
    }

    Vehiculo buscarPorPlaca(String placa) {
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getPlaca().equals(placa)) {
                return vehiculo;
            }
        }
        return null;
    }

    void buscarVehiculoPorPlaca() {
        System.out.println("Ingrese la placa a buscar:");
        String placaBuscada = consola.nextLine();

        Vehiculo encontrado = buscarPorPlaca(placaBuscada);

        if (encontrado == null) {
            System.out.println("No se encontró ningún vehículo con esa placa.");
        } else {
            encontrado.mostrarInformacion();
            System.out.println("Costo de mantenimiento: " + encontrado.calcularCostoMantenimiento());
        }
    }
}
