public abstract class Vehiculo {
    private String placa, marca;
    private double kilometraje;

    protected Vehiculo(String placa, String marca, double kilometraje){
        this.placa = placa;
        this.marca = marca;
        this.kilometraje = kilometraje;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlata(String plata) {
        this.placa = plata;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
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

    //Acá se van a realizar las excepciones y se llamaran en el constructor
}
