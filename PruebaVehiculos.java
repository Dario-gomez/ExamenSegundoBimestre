
package examen;
public class PruebaVehiculos {
    public static void main(String[] args) {
        Vehiculo[] vehiculos = new Vehiculo[2];
        vehiculos[0] = new Automovil(4, 200, 4);
        vehiculos[1] = new Motocicleta(true, 2, 150);

        for (Vehiculo vehiculo : vehiculos) {
            vehiculo.acelerar();
        }
    }
}