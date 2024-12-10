public class Main {
    import javax.swing.JOptionPane;
import java.util.Scanner;
    public class Main {
        public static void main(String[] args) {

        /*Vea tiene que hacer una aplicación para una tienda,
        tiene que crear el menú con las opciones
        Opción 1: agregar producto
    Opción 2: eliminar producto
    Opción 3: buscar producto
    Opción 4: mostrar los productos disponibles de la tienda
        */
        /int limite = Integer.parseInt(JOptionPane.showInputDialog("introducre un nuemro cuantos productos vas a agregar "));///no se va a usar
            Scanner entrada = new Scanner(System.in);
            String lista[] = new String[5];//el limete de datos es 10 java no deja meter un dato so¿in especificar el valor antes
            String sal = "";
            String opcion, buscar, datos;
            String productos = "", productoEliminar;//para mostrar los productos disponibles


            while (true){
                opcion = JOptionPane.showInputDialog(null, "opcion 1: agregar producto"+
                        "\n opcion 2: eliminar producto " +
                        "\n  Opción 3: buscar producto"+
                        "\n Opción 4: mostrar los productos disponibles de la tienda "
                        + " opcion 5: salir ");
                if (opcion == null || opcion.equals("5")) {  // Verificar si no se ha introducido nada
                    JOptionPane.showMessageDialog(null, "Has salido del programa.");
                    break;
                }
                if (opcion.equals("1")) {
                    for (int i = 0; i < lista.length; i++) {//lista.length = 10 tamaño del vector
                        datos = JOptionPane.showInputDialog("escribe el articulo " + (i + 1) + " :");
                        lista[i] = datos;//guardar los datos que meto en el array
                        System.out.println("el producto a sido ingresado correctamente");

                    }
                    // break;//TENGO QUE PONER ALGO PARA DESPUES QUE SE EJECUTE UNA OPCION DIFAMOS LA 1 ME VUELVA A PEDIR MAS OPCIONES por eso no me ejecutaba mas vecesa
                } else if (opcion.equals("2")) {
                    System.out.println("elgiste la opcion 2 ");
                    productoEliminar = JOptionPane.showInputDialog("escribe el producto que quieres eliminar");
                    boolean encontrado = false;//se llama una variable booleano y se inicliza en falso porque no sabemos si se encuentra en el array
                    for(int i = 0; i < lista.length; i++){
                        if(lista[i] != null && lista[i].equalsIgnoreCase(productoEliminar)){//si la lista no esta basia && si el producto existe en la lista y s
                            lista[i] = null;//elimino el producto del array con null
                            encontrado = true;//cambia el valor a true porque el valor si exite en la lista
                            JOptionPane.showMessageDialog(null,"el articulo si existe y fue eliminado ");
                            break;//sal del for
                        }
                    }
                    if (!encontrado){//si el producto no existe
                        JOptionPane.showMessageDialog(null,"el producto no esta en el array");
                    }
                    //break;
                } else if (opcion.equals("3")) {
                    buscar = JOptionPane.showInputDialog("cual es el elemento que vas a buscar ");
                    boolean busqueda = false;//llamamos una bandera en false por si npo encuentra nada
                    for(int i = 0; i < lista.length; i++){//lista.length para que busqye todos  los elemantos
                        if (lista[i] != null && lista[i].equals(buscar)) {// lista null si se pone algo sin ningun valor
                            JOptionPane.showMessageDialog(null,"el elemanto "+buscar+" si existe en el array");
                            busqueda = true;
                            break;
                        }//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
                    }//
                    if (!busqueda){//si el elemento buscado no existe
                        JOptionPane.showMessageDialog(null,"el articulo no existe ");
                    }

                    //break;
                } else if (opcion.equals("4")) {
                    System.out.println("elgiste la opcion 4 ");
                    for(int i = 0; i < lista.length; i++){
                        productos += lista[i];//creo una variable llamada productos para guardar todos los productos ingresados en el array para posteriormetne llamarlos
                    }
                    JOptionPane.showMessageDialog(null, "los elementos introducistos en el array fueron \n  " + productos);

                    //break;
                }else {
                    JOptionPane.showMessageDialog(null, "Opción no válida. Intenta de nuevo.");
                }



            }
        }
    }
}
