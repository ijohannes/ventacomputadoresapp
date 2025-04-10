package mundopc;

import mundopc.modelo.Computadora;
import mundopc.modelo.Monitor;
import mundopc.modelo.Raton;
import mundopc.modelo.Teclado;
import mundopc.servicio.Orden;

public class VentaComputadorasApp {
    public static void main(String[] args) {

        // Crear objetos
        Monitor monitorLenovo = new Monitor("HDMI", 24);
        //System.out.println(monitorLenovo);

        Raton ratonLenovo = new Raton("Usb", "Lenovo");
        //System.out.println(ratonLenovo);

        Teclado tecladoLenovo = new Teclado("Bluetooth", "Lenovo");
       //System.out.println(tecladoLenovo);

        Computadora computadoraLenovo = new Computadora("Computadora Lenovo", monitorLenovo, tecladoLenovo, ratonLenovo);
        //System.out.println(computadoraLenovo);

        // Objeto computadora 2
        Monitor monitorMac = new Monitor("VGA", 32);
        //System.out.println(monitorMac);

        Raton ratonMac = new Raton("Usb", "Mac");
        //System.out.println(ratonMac);

        Teclado tecladoMac = new Teclado("USB", "Mac");
        //System.out.println(tecladoMac);

        Computadora computadoraMac = new Computadora("Computadora Mac", monitorMac, tecladoMac, ratonMac);
        //System.out.println(computadoraMAc);

        // Objeto computadora 3
        Monitor monitorDell = new Monitor("VGA", 27);
        //System.out.println(monitorDell);

        Raton ratonDell = new Raton("Usb", "Dell");
        //System.out.println(ratonDell);

        Teclado tecladoDell = new Teclado("USB", "Dell");
        //System.out.println(tecladoDell);

        Computadora computadoraDell = new Computadora("Computadora Dell", monitorDell, tecladoDell, ratonDell);
        //System.out.println(computadoraDell);

        // Creamos una orden
        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadoraLenovo);
        orden1.agregarComputadora(computadoraMac);
        orden1.agregarComputadora(computadoraDell);
        orden1.mostrarOrden();

    }
}