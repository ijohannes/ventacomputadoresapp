package mundopc;

import mundopc.modelo.Monitor;
import mundopc.modelo.Raton;
import mundopc.modelo.Teclado;

public class Main {
    public static void main(String[] args) {

        // Crear objetos
        Raton ratonLenovo = new Raton("Usb", "Lenovo");
        System.out.println(ratonLenovo);

        Teclado tecladoLenovo = new Teclado("Bluetooth", "Lenovo");
        System.out.println(tecladoLenovo);

        Monitor monitorLenovo = new Monitor("HDMI", 24);
        System.out.println(monitorLenovo);


    }
}