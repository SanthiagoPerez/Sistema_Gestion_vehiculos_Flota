class Camion extends Vehiculo{
    private double capacidadCarga;

    public Camion(String placa, String marca, double kilometraje, double capacidadCarga){
        super(placa, marca, kilometraje);
        this.capacidadCarga = capacidadCarga;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public double calcularCostoMantenimiento(){
        return (getKilometraje() * 0.15) + (capacidadCarga * 50);
    }

    public void mostrarInformacion(){
        System.out.printf("""
                  %nMostrar Información\s
                --------------------------
                \tPlaca: %s
                \tKilometraje: %s
                \tCapacidad Carga: %.2f%n
                """, getPlaca(), getKilometraje(), capacidadCarga);
    }

    //Acá se van a realizar las excepciones y se llamaran en el constructor
}
