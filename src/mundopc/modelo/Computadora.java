package mundopc.modelo;

public class Computadora {

    private int idComputadora;
    private String nombre;
    //Relacionamos las clases creadas anteriormente
    private Monitor monitor;
    private Teclado teclado;
    private Raton raton;
    private static int contadorComputadoras;

    //Constructor privado
    private Computadora(){
        idComputadora = ++contadorComputadoras;
    }

    //Constructor publico
    public Computadora(String nombre, Monitor monitor, Teclado teclado, Raton raton){
        this(); //Llamamos el constructor privado
        this.nombre = nombre;
        this.monitor = monitor;
        this.teclado = teclado;
        this.raton = raton;
    }

    @Override
    public String toString() {
        return "Computadora{\n" +
                "idComputadora=" + idComputadora +
                ", nombre='" + nombre + '\'' +
                ",\n monitor=" + monitor +
                ",\n teclado=" + teclado +
                ",\n raton=" + raton +
                '}';
    }
}
