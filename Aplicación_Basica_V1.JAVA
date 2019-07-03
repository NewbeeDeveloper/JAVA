/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicación_basica_v1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author eduardoecheverria
 */
public class Aplicación_Basica_V1 {

    /**
     * @param args the command line arguments
     */
    /*Este es el método principal de JAVA, el cual se ejecutará al iniciar la aplicación
    Observaciones:
    1.- Es estático porque no necesita ser instanciada para utilizarse
    2.- El parámetro void indica que no regresa nada el método
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        /*Tipos de dato objeto 
        Observaciones:
        1.- Se deriban de una clase
        2.- <clase> <nombre del objeto> = new <clase>();
        3.- String es un objeto por default 
         */
        saludo bienvenida = new saludo();

        /* Tipo de datos primitivos
            -byte
            -short
            -int
            -long
            -float
            -double
            -boolean
            -char  
         */
        //Declaración
        int a, b, c;      // Declaración
        byte B = 22;       // Asignacion
        double pi = 3.14159;

        /* Alcance local y global
        Observaciones:
        1.- Alcance de B es global ya que está declarado en la clase principal
        2.- Al momento de hacer la instancia imprimiremos el valor B que se encuentra
            dentro de la clas
         */
        //Imprimimos division al saludo principal, "\n" es un salto de línea
        System.out.println("\n#############ALCANCE DE VARIABLES##################");

        //Valor local en el constructor del método alcance
        //Instancia o variable de tipo objeto, imprimirá el valor local de B 10
        alcance obj_alcance = new alcance();

        //Imprimimos ahora el valor global de B 22
        System.out.println("Valor global de B: " + B);

        /* Modificadores de acceso
        Observaciones:
        1.- Podemos utilizar la variable x de modificadores, pero no la variable i 
         */
        System.out.println("\n#############MODOFICADORES##################");

        //Imprimimos la variable i, desde el método constructor de la clase modificadores
        modificadores obj_modificador = new modificadores();

        //Imprimimos la variable x, la cual es publica, desde el método main
        System.out.println("Esta es la variable publica: " + obj_modificador.x);

        /* Operadores Aritméticos
        Observaciones:
        1.- Haremos una clase con  un método para los principales operadores, enviando 2 números
            como parámetros para ser computados
         */
        System.out.println("\n#############OPERADORES##################");
        operadoresAritmeticos obj_ar = new operadoresAritmeticos();

        obj_ar.suma(7, 3.3);
        obj_ar.resta(7, 3.3);
        obj_ar.multiplicacion(7, 3.3);
        obj_ar.division(7, 3.3);

        /* CONDICIONAL IF y SWITCH
        Observaciones:
        1.- IF Compara valores y en base a eso toma desición
        A continuación muestro la lista de operadores de relación
        - == Igual
        - !- No igual
        - >  Mayor que
        - <  Menor que 
        - >= Mayor igual
        - <= Menor igual
        
        A continuación muestro la lista de operadores lógicos más comunes
        
        - &&  AND Este operador compara si dos condiciones se cumplen
        - ||  OR  Este operador compara si una u otra operación se cumple
        - !   NOT Aplica reversa a la lógica

        
        2.- Switch revisa el valor de una variable y en base a eso ejecuta un acción
         */
        System.out.println("\n#############CONDICIONAL IF Y SWITCH##################");

        //Utilizamos una variable de las declaradas previamente
        a = 10;

        /*La condicion dentro de parentesis interna es Si a es menor a 5 y es mayor a 15, pero
          el operador ! la reversa o la vuelve contraria */
        if (!(a < 5 && a > 15)) {
            System.out.println("Si a NO es menor a 5 y NO es mayor a 15 ");
        }

        //El programa analisa el caso correcto y ejecuta la impresión en pantalla correspondiente
        switch (a) {
            case 5:
                System.out.println("El valor de a es 5");
                break;
            case 10:
                System.out.println("El valor de a es 10");
                break;
            case 15:
                System.out.println("El valor de a es 15");
                break;
            default:
                System.out.println("Otro valor para a");
        }

        /* ARREGLOS 
         Son estructuras de datos que nos permite almacenar una ristra de datos de un mismo tipo.
        Observaciones:
        <tipo de dato>[] <nombre del arreglo> = <elementos>;
        1.- Definiremos una estructura de datos sencilla paso a paso 
        2.- En el siguiente punto "CICLOS" imprimiremos los datos uno a uno  en consola
         */
        System.out.println("\n#############ARREGLOS##################");

        // Definimos el arreglo 
        int[] arreglo = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        //Utilizamos la clase Array y el método toString para poder ver el arreglo
        System.out.println("El arreglo completo: " + Arrays.toString(arreglo));

        /* CICLOS 
        Los ciclos nos permiten repetir un conjunto de instrucciones, tanto como lo necesitemos.
        
        Los principales tipos de ciclo son
        
        CICLO WHILE     - Ejecuta un ciclo hasta que se cumpla una condición
        CICLO FOR       - Ejecuta un ciclo hasta que se cumpla una condición, adicioal realiza una acción
        CICLO DO WHILE  - Ejecuta un ciclo hasta que se cumpla una condición, asegurando mínimo la ejecucion 
                          de las instrucciones una vez
        
         */
        System.out.println("\n#############CICLOS##################");

        //Ciclo While, utilizaremos la variable de control c
        c = 0;

        System.out.println("----CICLO WHIL----E");
        while (c < 10) {
            System.out.println("c = " + c);
            //el operador ++ incrementa en uno el valor de la variable.
            c++;
        }

        //Ciclo FOR, iteraremos sobre los elemento del arreglo previo
        System.out.println("----CICLO FOR----");

        /* Componentes del FOR
        1.- Declaración de variable j con valor 0
        2.- Comparación de j contra el tamaño del arreglo previo
        3.- Incremento de j en uno al final del ciclo    
         */
        for (int j = 0; j < arreglo.length; j++) {
            System.out.println("Valores dentro del arreglo: " + arreglo[j]);
        }

        //Ciclo Do While, 
        System.out.println("----CICLO Do While----");
        //Este ciclo solo ejecutara una vez la porción del código dado que x ya vale 10
        do {
            System.out.println("Ejecución única");
        } while (c < 10);

        /* LECTURA Y ESCRITURA DE ARCHIVOS */
        System.out.println("\n#############LECTURA DE ARCHIVO##################");

        /*
            1.-Importamos la libreo .io, la cual contiene la clase FileINputStream para lectura de archivos
            2.- Declaramos la variable in, con el tipo de la clase que importamos
         */
        FileInputStream in = null;

        //Limpiamos la variable c
        c = 0;

        //Declaramos una variable de tipo string, para almacenar texto.
        String cadena = "";

        /*
          Utilizamos el bloque try, el cual nos permitirá manejar errores sin perder la ejecución
          del programa.
         */
        try {
            //Realizamos la instancia o el objeto de la variable "mandando la ruta del archivo"
            in = new FileInputStream("/Users/eduardoecheverria/Desktop/Hola Mundo.txt");
            //Armamos el texto leyendo cada caracter del archivo
            while ((c = in.read()) != -1) {
                cadena = cadena + (char) c;
            }
        //Obtenemos la excepcion para manejo de entradas y salidas
        } catch (IOException ex) {
            Logger.getLogger(FileReader.class.getName()).log(Level.SEVERE, null, ex);
        }

        //Imprimimos los valores del archivo
        System.out.println(cadena);

        System.out.println("\n#############ESCRITURA DE ARCHIVO##################");

        //Declaramos la variable out, importando la clase para escritura de archivo
        FileOutputStream out = null;

        try {
            
            //Leemos nuevamente el archivo
            in = new FileInputStream("/Users/eduardoecheverria/Desktop/Hola Mundo.txt");
            //Asignamos la ruta donde escribiremos
            out = new FileOutputStream("/Users/eduardoecheverria/Desktop/arreglo.txt");

            //Leemos nuevamente el archivo
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        //Obtenemos la excepcion para manejo de archivos
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Aplicación_Basica_V1.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }

    }

}

/* Esto es una clase, de la cual se deriban objetos que obtienen sus atributos(variables) y 
métodos(operaciones)
 */
class saludo {

    //Método constructor, se ejecuta automáticamente al crearce el objeto
    saludo() {
        //Comando para imprimir mensajes en la consola
        System.out.println("Bienvenido a esta aplicación para entender las bases de JAVA");
    }

}

//Esta clase demuestra el alcance local de una variable
class alcance {

    int B = 10;

    alcance() {
        //Es signo "+" sirve para pegar o concatenar 2 variables o 2 cadenas
        System.out.println("Valor local B: " + B);
    }

}

//Modificadores, es la visibilidad que tienen los elementos de una clase
class modificadores {

    //Esta variable sólo podra ser utilizada dentro de la clase
    private int i = 1;

    //Esta variable podrá ser utilizada fuera de la clase
    public int x = 0;

    modificadores() {
        System.out.println("Esta es la variable privada: " + i);
    }

}

class operadoresAritmeticos {

    public void suma(double x, double y) {

        // Declaramos variable tipo double
        double resultado;

        //Utilizamos el operador de suma
        resultado = x + y;

        //Imprimimos el resultado
        System.out.println("Suma: " + resultado);

    }

    public void resta(double x, double y) {

        // Declaramos variable tipo double
        double resultado;

        //Utilizamos el operador de resta
        resultado = x - y;

        //Imprimimos el resultado
        System.out.println("Resta: " + resultado);

    }

    public void multiplicacion(double x, double y) {

        // Declaramos variable tipo double
        double resultado;

        //Utilizamos el operador de multiplicación
        resultado = x * y;

        //Imprimimos el resultado
        System.out.println("Multiplicación: " + resultado);

    }

    public void division(double x, double y) {

        // Declaramos variable tipo double
        double resultado;

        //Utilizamos el operador de division
        resultado = x / y;

        //Imprimimos el resultado
        System.out.println("División: " + resultado);

    }

}
