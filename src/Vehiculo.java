public abstract class Vehiculo {
    private String placa, marca;
    private double kilometraje;

    protected Vehiculo(String placa, String marca, double kilometraje){
        if(placa == null || placa.isBlank()){
            throw new PlacaInvalidaException("La placa no puede estar vacia");
        }
        setKilometraje(kilometraje);
        this.placa = placa;
        this.marca = marca;
        //this.kilometraje = kilometraje;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if(getKilometraje() < 0){
            throw new KilometrajeInvalidoException("El kilometraje no puede ser negativo");
        }
        this.marca = marca;
    }

    public double getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }

    void mostrarInformacion(){
        System.out.println("-----------------");
        System.out.println("Placa: " + placa);
        System.out.println("Kilometrale: " + kilometraje);
    }

    public abstract double calcularCostoMantenimiento();

}
