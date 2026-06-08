import java.util.ArrayDeque;
import java.util.Deque;

public class Ejercicio1 {

    //Devuelve cadena de texto invertida
    //Texto : COMPUTACION
    //invertido: NOICATUPMOC
    public String invertString(String texto){
        Deque<Character> pila = new ArrayDeque<>();
        String invert = "";
        for(char letra : texto.toCharArray()){
            pila.push(letra);
        }
        while (!pila.isEmpty()) {
            invert += pila.pop();
        }

        return invert;
    }
}
