/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberlistsum;

/**
 *
 * @author eduardoecheverria
 */
//Crear la clase de nodo
class ListNode {

    //Valor del nodo
    int val;

    //Referencia al nodo siguiente
    ListNode next;

    //Constructor vacío 
    ListNode() {
    }

    //Constructor que asigna el valor
    ListNode(int x) {
        val = x;
    }

}

public class NumberListSum {

    /**
     * @param args the command line arguments
     */
    static ListNode root;

    //Método para insertar elementos a la lista
    public static void push(int num) {

        //Creamos un objeto nuevo del tipo de nodo
        ListNode eNode = new ListNode(num);

        //Asignamos el nodo root al elemento siguiente 
        eNode.next = root;

        //Asignamos el nodo a la raiz para tener la secuencia de nodos
        root = eNode;
    }

    //Crear el método de suma
    public static ListNode suma(ListNode l1, ListNode l2) {

        /*Primero hay que recorrer las listas para ir sumando sus elementos,
          utilizaré un while y un do while.
         */
        //Indices
        int i = 0;
        int j = 0;

        //Sumatoria
        int sum = 0;
        int dsum = 0;
        int count = 0;

        String digits = "";
        String dec = "";

        //Nodo de retorno
        ListNode result = null;

        //Mientras tenga elementos en la lista 1
        while (l1 != null) {

            //Crearé un nodo auxiliar
            ListNode aux = new ListNode();

            //Como tengo que sumar forzosamente los primeros elementos, haré uso de un ciclo do-while.
            do {

                /*Priemro haré la suma de valores de ambas listas y 
                  la cuenta pendiente de la suma */
                sum = l1.val + l2.val + count;

                //Debo limpiar la cuenta para la siguiente suma
                count = 0;

                //Si la suma es mayor de 10, deberá crear una cuenta para agregar a la siguiente suma               
                if (sum >= 10 && l1.next != null) {

                    //Necesito saber la longitud del resultado 
                    digits = String.valueOf(sum);

                    //Longitud per se
                    dsum = digits.length();

                    // Voy a iterar sobre cada dígito para asignar el resultado del dígito final y obtener la cuenta
                    for (int k = 1; k <= digits.length(); k++) {

                        /*Debido a que el array empieza en cero y la cantidad de digitos en uno 
                          empezaré inicializando k = 1 */
                        //Si k ha llegado al digito final,obtenemos la cuenta y asignamos valor
                        if (k == dsum) {
                            //El valor será igual al último digito
                            aux.val = Character.getNumericValue(digits.charAt(digits.length() - 1)); //Se resta uno por el indice

                            //Asignamos la cuenta
                            count = Integer.parseInt(dec);

                            //Si estamos antes del último dígito hacemos la cuenta o concatenación de las decimas.
                        } else if (k <= dsum - 1) {
                            dec = dec + digits.charAt(k - 1);   //Restamos uno por la posición del array               
                        }
                    }

                    //Priemro asignare el nodo de este escenario.
                    if (result != null) {
                        aux.next = result; //Asigno la referencia
                    }

                    //Asigno nodo auxiliar al principal
                    result = aux;

                } else {

                    //Necesito saber la cantidad de dígitos, como arriba
                    digits = String.valueOf(sum);
                    dsum = digits.length();

                    if (dsum > 1) {

                        for (int k = digits.length() - 1; k >= 0; k--) { //Como estamos trabajando con listas necesito ir de atras para adelante

                            aux = new ListNode();
                            aux.val = Character.getNumericValue(digits.charAt(k));
                            aux.next = result;
                            result = aux;
                        }
                    } else {
                        aux.val = sum;
                        aux.next = result;
                        result = aux;

                    }

                }

                //Cambio de elemento de la lista 2
                l2 = l2.next;

                //Incremento del segun indice - Lista 2   
                j++;

                //Limpio los decimales y la suma
                sum = 0;
                dec = "";

                //Necesito indices para comparar en que iteración están
            } while (i == j); // Mientras esten en la misma posición

            //paso página y asigno el siguiente elemento de la lista uno
            l1 = l1.next;

            //Incremento del primer índice - Lista 1  
            i++;
        }

        return result;

    }

    public static void main(String[] args) {
        // TODO code application logic here

        //Creamos las 2 listas que contendran los números que se deberán sumar
        ListNode l1 = new ListNode();
        ListNode l2 = new ListNode();

        //Iniciamos la creación de la primera lista
        NumberListSum.push(7);
        NumberListSum.push(4);
        NumberListSum.push(6);

        //Asignamos el nodo root a la primer lista
        l1 = root;

        //Reinisializamos el nodo root
        root = new ListNode();

        //Asignamos valores a la segunda lista
        NumberListSum.push(2);
        NumberListSum.push(2);
        NumberListSum.push(2);

        //Relacionamos el nodo raiz con la lista
        l2 = root;

        //Reiniciamos el nodo
        root = new ListNode();

        //Hacer la suma de los elementos
        NumberListSum.suma(l1, l2);

    }
}
