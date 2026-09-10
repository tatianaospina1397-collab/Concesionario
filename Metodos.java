/**
 * Metodos
 */
import java.util.Scanner;
import java.util.Stack;

public class Metodos {

    public Stack<Obj> LLenarPila(Stack<Obj> pila, Scanner sc, Metodos m) {
        boolean continuar = true;

        while (continuar) {
            Obj o = new Obj();

            System.out.println("Ingrese la placa del carro:");
            o.setPlaca(sc.next());

            System.out.println("Ingrese la marca del carro:");
            o.setMarca(sc.next());

            System.out.println("Ingrese el modelo del carro:");
            o.setModelo(m.ValidarEentero(sc));

            System.out.println("Ingrese el precio del carro:");
            o.setPrecio(sc.nextDouble());

            pila.push(o);

            System.out.println("Desea continuar ingresando registros 1) si, 2) no");
            int opt = m.ValidarEentero(sc);

            if (opt == 2) {
                continuar = false;
            }
        }

        return pila;
    }

    public void MostrarPila(Stack<Obj> pila) {
        System.out.println(pila);
    }

    public void MostrarPilaObjetual(Stack<Obj> pila) {
        for (Obj o : pila) {
            System.out.println("Placa: " + o.getPlaca());
            System.out.println("Marca: " + o.getMarca());
            System.out.println("Modelo: " + o.getModelo());
            System.out.println("Precio: " + o.getPrecio());
            System.out.println("----------------------");
        }
    }

    public Stack<Obj> EliminarTope(Stack<Obj> pila) {
        if (!pila.isEmpty()) {
            pila.pop();
            System.out.println("Carro del tope eliminado");
        } else {
            System.out.println("La pila esta vacia");
        }

        return pila;
    }

    public Stack<Obj> EliminarRegitro(Stack<Obj> pila, Scanner sc, Metodos m) {
        System.out.println("Ingrese la placa del carro a eliminar");
        String placa = sc.next();

        Stack<Obj> pilaaux = new Stack<>();

        while (!pila.isEmpty()) {
            Obj o = pila.pop();

            if (o.getPlaca().equalsIgnoreCase(placa)) {
                System.out.println("Carro eliminado");
            } else {
                pilaaux.push(o);
            }
        }

        while (!pilaaux.isEmpty()) {
            pila.push(pilaaux.pop());
        }

        return pila;
    }

    public int ValidarEentero(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.println(
                    "Por favor tenga en cuenta que se le esta pidiendo un dato numerico");
            sc.next();
        }

        return sc.nextInt();
    }
}

