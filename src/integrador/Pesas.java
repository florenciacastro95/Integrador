
package integrador;


public class Pesas extends EquipoEjercicio {
        private double peso;

    public Pesas(String nombre, double precio, int stock, double peso) {
        super(nombre, precio, stock);
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("***Pesa***\nNombre: " + getNombre() + "\nPrecio: $" + getPrecio() + "\nStock: " + getStock() + "\nPeso: " + peso + "kg.");
    }
}
