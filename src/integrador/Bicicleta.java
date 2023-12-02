package integrador;

public class Bicicleta extends EquipoEjercicio implements Oferta{
     private String tipoBicicleta;

    public Bicicleta(String nombre, double precio, int stock, String tipoBicicleta) {
        super(nombre, precio, stock);
        this.tipoBicicleta = tipoBicicleta;
    }

    public String getTipoBicicleta() {
        return tipoBicicleta;
    }

    public void setTipoBicicleta(String tipoBicicleta) {
        this.tipoBicicleta = tipoBicicleta;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("***Bicicleta***\nNombre: " + getNombre() + "\nPrecio: $" + getPrecio() + "\nStock: " + getStock() + "\nTipo: " + tipoBicicleta);
    }

    @Override
    public void calcularDescuento(int p) {
        setPrecio(getPrecio()- ((p/100.0) * getPrecio()));
    }
}
