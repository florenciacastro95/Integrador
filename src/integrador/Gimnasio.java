package integrador;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Gimnasio {

    private ArrayList<EquipoEjercicio> inventario;

    public Gimnasio() {
        this.inventario = new ArrayList<>();
    }

    public EquipoEjercicio pedirDatos() throws InputMismatchException, NullPointerException {
        Scanner leer = new Scanner(System.in);
        System.out.println("Elija el tipo de equipo que desea ingresar: ");
        System.out.println("1-Bicicleta");
        System.out.println("2-Pesas");
        System.out.println("3-Cinta para correr");
        int tipo=leer.nextInt();
        leer.nextLine();
        System.out.println("Por favor, ingrese el nombre del equipo:");
        String nombre = leer.nextLine();
        System.out.println("Ahora ingrese el precio del equipo:");
        double precio = leer.nextDouble();
        System.out.println(" ingrese la cantidad de stock del equipo:");
        int stock = leer.nextInt();

        switch (tipo) {
            case 1:
                leer.nextLine();
                System.out.println("Por ultimo, ingrese el tipo de bicicleta:");
                String tipoB = leer.nextLine();
                return new Bicicleta(nombre, precio, stock, tipoB);

            case 2:
                System.out.println("Por ultimo, ingrese el peso:");
                double peso = leer.nextDouble();
                return new Pesas(nombre, precio, stock, peso);

            case 3:
                System.out.println("Por ultimo, ingrese la velocidad:");
                double velocidad = leer.nextDouble();
                return new CintaCorrer(nombre, precio, stock, velocidad);

            default:
                System.out.println("Se esperaba 1, 2 o 3. Fin del método.");
                return null;
        }

    }

    public void agregarEquipo(EquipoEjercicio equipo) {
        inventario.add(equipo);
    }

    public void mostrarInventario() {
        for (EquipoEjercicio equipo : inventario) {
            equipo.mostrarInformacion();
        }
    }



    public void ordenar() {
        Comparator<EquipoEjercicio> compa = new Comparator<EquipoEjercicio>() {
            @Override
            public int compare(EquipoEjercicio e1, EquipoEjercicio e2) {
                if (e1.getNombre().compareTo(e2.getNombre()) == 0) {
                    return (int)(e1.getPrecio()-e2.getPrecio());
                }else{
                return e1.getNombre().compareTo(e2.getNombre());}
            }
        };
        
        Collections.sort(inventario, compa);
    }
        
    public void mostrarBicis() {
        for (EquipoEjercicio eq : inventario) {
            if (eq instanceof Bicicleta) {
                ((Bicicleta)eq).calcularDescuento(15);
                eq.mostrarInformacion();
            }
        }
    }
    
}
