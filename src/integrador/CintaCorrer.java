package integrador;

public class CintaCorrer extends EquipoEjercicio {
    private double velocidad;

    public CintaCorrer(String nombre, double precio, int stock, double velocidad) {
        super(nombre, precio, stock);
        this.velocidad = velocidad;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("***Cinta de Correr***\nNombre: " + getNombre() + "\nPrecio: $" + getPrecio() + "\nStock: " + getStock() + "\nVelocidad: " + velocidad + "km por hora");
    }
}
