/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

/**
 *
 * @author eduardoecheverria
 */
class Node {

    // Variable donde se guardará el valor del nodo
    int num;

    //Referencia al nodo que sigue
    Node next;

    //Constructor que asigna valor y referencia
    Node(int d) {
        num = d;
        next = null;
    }

}

public class LinkedList {

    /**
     * @param args the command line arguments
     */
    Node root;
    
    //Método que se encarga de insertar elementos en la lista
    public void push(int newNum) {       
        
        //Creamos una nodo con el valor de enrada
        Node eNode = new Node(newNum);
        
        //Asignamos el nodo raiz al atributo node, el cual tiene la referencia 
        eNode.next = root;
        
        //Ahora el nodo raiz contiene el nuevo valor
        root = eNode;

    }
    
    //Método de búsqueda
    public boolean search(Node root, int x){
    
        //Asignamos el nodo raiz a un nodo local
        Node cNode = root;
        
        //Iteramos sobre cNode para buscar el valor que se necesita
        while(cNode != null){
            
            //Si el valor de cNode es igual retornamos de la función con valor true
            if(cNode.num == x)
                return true;
            else 
               //De lo contrario asignamos la referencia del siguiente nodo como nodo principal
               cNode = cNode.next;       
        }
        //En caso de no encontrar ningún valor regresamos false
        return false;
    
    }
    
      
    //Método manejador o principal
    public static void main(String[] args) {
        // TODO code application logic here
        
        LinkedList list = new LinkedList();
        
        list.push(10);        
        list.push(20);
        list.push(30);
        list.push(40);
        list.push(50);
        
        if(list.search(list.root, 10))
            System.out.println("Valor Encontrado");
        else 
            System.out.println("Valor No Encontrado ");

    }

}
