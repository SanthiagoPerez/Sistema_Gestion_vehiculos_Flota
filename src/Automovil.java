class Automovil extends Vehiculo{
    int numPasajeros;

    public Automovil(String placa, String marca, double kilometraje, int numPasajeros){
        super(placa, marca, kilometraje);
        this.numPasajeros = numPasajeros;
    }

    public int getNumPasajeros() {
        return numPasajeros;
    }

    public void setNumPasajeros(int numPasajeros) {
        this.numPasajeros = numPasajeros;
    }

    @Override
    public double calcularCostoMantenimiento(){
        return (getKilometraje() * 0.08) + (numPasajeros * 10);
    }

    public void mostrarInformacion(){
        System.out.printf("""
                  %nMostrar Información\s
                --------------------------
                \tPlaca: %s
                \tKilometraje: %s
                \tNumero Pasajeros: %d%n
                """, getPlaca(), getKilometraje(), numPasajeros);

        /*
          super.mostrarInformacion(); // imprime placa y kilometraje, ya heredado
          System.out.println("Número Pasajeros: " + numPasajeros);
        */
    }

    //Acá se van a realizar las excepciones y se llamaran en el constructor
}
