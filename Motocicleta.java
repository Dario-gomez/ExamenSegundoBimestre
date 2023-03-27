
package examen;

class Motocicleta extends Vehiculo {
    private boolean tieneCasco;

    public Motocicleta(boolean tieneCasco, int numeroRuedas, int velocidadMaxima) {
        super(numeroRuedas, velocidadMaxima);
        this.tieneCasco = tieneCasco;
    }

    @Override
    public void acelerar() {
        System.out.println("La motocicleta está acelerando a una velocidad de " + velocidadMaxima + " km/h.");
    }
}
    

