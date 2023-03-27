
package examen;


class Automovil extends  Vehiculo  {
    private int cantidadPuertas;

    public Automovil(int cantidadPuertas, int numeroRuedas, int velocidadMaxima) {
        super(numeroRuedas, velocidadMaxima);
        this.cantidadPuertas = cantidadPuertas;
    }

    @Override
    public void acelerar() {
        System.out.println("El automóvil está acelerando a una velocidad de " + velocidadMaxima + " km/h.");
    }
}

    

