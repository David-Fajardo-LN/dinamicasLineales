import java.util.ArrayDeque;
import java.util.Deque;

public class Ejercicio2 {
    public boolean esPalindromo(String texto) {

        Deque<Character> pila = new ArrayDeque<>();
        String invert = "";
        for(char letra : texto.toCharArray()){
            pila.push(letra);
        }
        while (!pila.isEmpty()) {
            invert += pila.pop();
        }

        return texto.equalsIgnoreCase(invert);

        //String invertido = new Ejercicio1().invertString(texto);
        //return texto.equals(invertido);    MAS SENCILLO USANDO EL METODO YA CREADO
    } 
}
