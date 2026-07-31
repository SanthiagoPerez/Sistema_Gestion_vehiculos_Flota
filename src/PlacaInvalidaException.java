public class PlacaInvalidaException extends RuntimeException{
    public PlacaInvalidaException(String mensaje){ //mensaje es el parametro que le llega al throw
        super(mensaje);
    }
}
