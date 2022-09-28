/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicapilasnombres;
import java.util.Stack;
/**
 *
 * @author julis
 */
public class PracticaPilasNombres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Practicas de pila con la libreria pero con nombres
        Stack pila = new Stack();
        pila.push("antonio");
        pila.push("pedro");
        pila.push("jose");
        pila.push("maria");
        pila.push("carlos");
        pila.push("guadalupe");
        pila.pop();
        System.out.println("El ultimo en la pila es: " + pila.peek());
        pila.push("juan");
        pila.pop();
        pila.pop();
        System.out.println("El ultimo en la pila es: " + pila.peek());
        while(pila.empty() == false)
        {
            System.out.println(pila.pop());
        }
         //Practicas de pila sin la libreria pero con nombres
    }
    
}
