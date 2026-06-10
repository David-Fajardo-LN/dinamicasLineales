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
        Ejercicio1 controller1 = new Ejercicio1();
        System.err.println("///////////// Ejercicio 1 //////////////");
        System.err.println("Palabra : COMPUTACION");
        System.err.println("Invertido: "+ controller1.invertString("COMPUTACION"));

        System.out.println();
        System.out.println("//////////////////////////////////////////////////////////////////////////////");
        System.out.println("Ejercicio 2: Palindromo");
        System.out.println("Palabra 1: Radar -deve retornar true"+"\nPalabra2: Computacion -deve retornar false");
        Ejercicio2 palindromoController = new Ejercicio2();
        System.out.println("Radar es palindromo? " + palindromoController.esPalindromo("Radar"));
        System.out.println("Computacion es palindromo? " + palindromoController.esPalindromo("Computacion"));
        System.out.println("//////////////////////////////////////////////////////////////////////////////");
        System.out.println();
    }
    private static void runStack() {
        System.out.println("///////////////////////////// Pila / Stack /////////////////////////////");
        Stack<String> pila = new Stack<>();
        pila.push("A");
        pila.push("B");
        pila.push("C");
        String elemento = pila.pop();
        System.out.println(pila.size());
        System.out.println(elemento);
        Deque<String> pila2 = new ArrayDeque<>();
        Deque<String> pila3 = new ArrayDeque<>();
        pila2.push("A");
        pila3.push("A"); 
        pila.pop();
        pila.pop();
    }
    private static void runQueue() {
        System.out.println("///////////////////////////// Cola / Queue /////////////////////////////");
        Queue<String> cola = new ArrayDeque<>();
        cola.offer("Jose");
        cola.offer("Andres");
        cola.offer("Ana");
        System.out.println("¿Esta vacio?: "+ cola.isEmpty());
        System.out.println("Tamanio: " + cola.size());
        System.out.println("¿cual es el peek?: "+ cola.peek());
        System.out.println("Tamanio: " + cola.size());
        System.out.println("¿Cual es el primero en atenderse?: " + cola.poll());
        System.out.println("Tamanio actual despues de poll: " + cola.size());  //saca el objeto o primitivo y se sale del arreglo, por lo cual podemos guardarlo auxiliarmente en otra variable

        //oFfer ----> agrega al final
        //peek -----> devuelve el primero sin eliminar
        //poll -----> devuelve el primero y lo elimina
        while (!cola.isEmpty()) {
            String cliente = cola.poll();
            System.out.println("Atendi al Cliente: " + cliente);
        }
    }
    private static void runLinkedList() {
        System.out.println("///////////////////////////// Lista doble enlazada / LinkedList /////////////////////////////");
        LinkedList<String> nombres = new LinkedList<>();
        System.out.println("¿Esta vacio?: " + (nombres.isEmpty()));
        System.out.println("Tamanio: "+ nombres.size());
        nombres.add("Juan");
        nombres.add("Pedro");
        nombres.add("Maria");
        nombres.add("Diego");

        System.out.println("Se agregadron datos, comprobacion dos: ");

        System.out.println("¿Esta vacio?: " + (nombres.isEmpty()));
        System.out.println("Tamanio: "+ nombres.size());

        System.out.println("Primer elemento: " + nombres.getFirst());
        System.out.println("Ultimo elemento: " + nombres.getLast());
        System.out.println("Tercer elemento: " + nombres.get(2));

        System.out.println("Comando peek: " + nombres.peek());
        System.out.println("Comando pop: " + nombres.pop());
        System.out.println("Tamanio: "+ nombres.size());


    }
}
