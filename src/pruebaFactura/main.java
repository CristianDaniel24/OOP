package pruebaFactura;
import java.lang.reflect.Method;
public class main {
    public static void main(String[] args) {
                try {
                    Factura instancia = new Factura();

                    Method metodo = Factura.class.getDeclaredMethod("metodoPrivado");
                    metodo.setAccessible(true);  // Hacer que el método sea accesible
                    metodo.invoke(instancia);    // Se invoca al metodo en la instancia Factura
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }