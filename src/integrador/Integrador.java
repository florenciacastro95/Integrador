package integrador;

import java.util.InputMismatchException;

public class Integrador {

    public static void main(String[] args) {
     
        Gimnasio gimnasio = new Gimnasio();

        try {
           
            EquipoEjercicio e1 = gimnasio.pedirDatos();
            EquipoEjercicio e2 = gimnasio.pedirDatos();
            EquipoEjercicio e3 = gimnasio.pedirDatos();
            EquipoEjercicio e4 = gimnasio.pedirDatos();
            EquipoEjercicio e5 = gimnasio.pedirDatos();
            EquipoEjercicio e6 = gimnasio.pedirDatos();

            gimnasio.agregarEquipo(e1);
            gimnasio.agregarEquipo(e2);
            gimnasio.agregarEquipo(e3);
            gimnasio.agregarEquipo(e4);
            gimnasio.agregarEquipo(e5);
            gimnasio.agregarEquipo(e6);
            
            System.out.println("INVENTARIO");
            gimnasio.mostrarInventario();
            System.out.println("");
            System.out.println("ORDENANDO EL INVENTARIO");
            gimnasio.ordenar();
            System.out.println("");
            System.out.println("INVENTARIO");
            gimnasio.mostrarInventario();
            System.out.println("");
            System.out.println("MOSTRANDO BICIS UWU");
            gimnasio.mostrarBicis();

        } catch (InputMismatchException exc) {
            System.err.println("ERROR DE TIPO DE DATOS " + exc.getMessage());
            exc.printStackTrace();
        } catch (NullPointerException exc2) {
            System.out.println("ERROR POR NULL POINTER " +exc2.getMessage());
             exc2.printStackTrace();
        }catch(Exception exc3){
            System.out.println("ERROR GENERAL");
             exc3.printStackTrace();
        }finally{
            System.out.println("Bloque finally. Fin del programa.");
        }
    }
        
    }
    

