import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        runLinkedList();
        runQueue();
        runStack();
    }

    private static void runStack() {
        Ejercicio1 invertController = new Ejercicio1();

        System.out.println("////////PILA///////");

        Stack<String> pila = new Stack<>();
        pila.push("A");
        pila.push("B");
        pila.push("C");

        String elemento = pila.pop();
        System.out.println(pila.size());
        System.out.println(elemento);

        Deque<String> pila2 = new ArrayDeque<>();
        Deque<String> pila3 = new ArrayDeque<>();
        Deque<String> pila4 = new ArrayDeque<>();        

        System.out.println("PALABRA A INVERTIR : COMPUTACION");
        String n = invertController.invertString("COMPUTACION");
        System.out.println(n);

    }

    private static void runQueue() {
        System.out.println("Lista de la forma Cola/////////////////////");
        Queue<String> cola = new ArrayDeque<>();
        cola.offer("Jose");
        cola.offer("Andres");
        cola.offer("Ana");
        System.out.println("¿Esta vacio?: "+ cola.isEmpty());
        System.out.println("Tamanio: " + cola.size());
        System.out.println("¿cual es el peek?: "+ cola.peek());
        System.out.println("¿Cual es el primero en atenderse?: " + cola.poll());  //saca el objeto o primitivo y se sale del arreglo, por lo cual podemos guardarlo auxiliarmente en otra variable
        System.out.println(cola.size());

        // ofer ----> agrega al final
        //peek -----> devuelve el primero sin eliminar
        //poll -----> devuelve el primero y lo elimina

        while (!cola.isEmpty()) {
            String cliente = cola.poll();
            System.out.println("Atendi al Cliente: " + cliente);
        }
        
    }

    private static void runLinkedList() {
        System.out.println("Lista Enlazada / linkedlist");
        LinkedList<String> nombres = new LinkedList();
        System.out.println("¿Esta vacio?: " + (nombres.isEmpty()));
        System.out.println("Tamanio: "+ nombres.size());

        nombres.add("Juan");
        nombres.add("Pedro");
        nombres.add("Maria");
        nombres.add("Diego");

        System.out.println("¿Esta vacio?: " + (nombres.isEmpty()));
        System.out.println("Tamanio: "+ nombres.size());

    }
}
