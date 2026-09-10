import java.util.Scanner;
import java.util.Stack;

public class Menu {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Stack<Obj> pila = new Stack<>();
        Metodos m = new Metodos();

        boolean continuar = true;

        while (continuar) {

            System.out.println("==================================");
            System.out.println(" BIENVENIDOS AL CONCESIONARIO ");
            System.out.println("==================================");
            System.out.println("Que desea realizar");
            System.out.println("1) Llenar Pila");
            System.out.println("2) Mostrar Pila");
            System.out.println("3) Eliminar tope Pila");
            System.out.println("4) Eliminar registro Pila");
            System.out.println("5) Salir");

            int opt = m.ValidarEentero(sc);

            switch (opt) {

                case 1:
                    pila = m.LLenarPila(pila, sc, m);
                    break;

                case 2:
                    m.MostrarPilaObjetual(pila);
                    break;

                case 3:
                    pila = m.EliminarTope(pila);
                    break;

                case 4:
                    pila = m.EliminarRegitro(pila, sc, m);
                    break;

                case 5:
                    System.out.println("Hasta luego");
                    continuar = false;
                    break;

                default:
                    System.out.println("Esta opcion no existe");
                    break;
            }
        }
    }
}