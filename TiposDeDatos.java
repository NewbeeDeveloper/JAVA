
public class TipoDeDatos {
	
	//Declaramos un atributo
	public static String cadena = "Soy un atributo";
	
	public static void main(String[] args) {
		
		
		char    x = 'a';
		int     i = 2;
	    byte    b = 9;
	    float   f = 34.25f;
	    double  d = 3.5;
	    boolean n = true;
		
	    //Creamos un objeto instanciando la clase TipoDeDatos
	    TipoDeDatos objeto = new TipoDeDatos();
	    
	    //Nuestro objeto utiliza la operación imprimirEnConsola de la clase TipoDeDatos
	    objeto.imprimirEnConsola();	
	    
	}
	
	/*Método, operación de la clase TipoDeDatos*/
	public void imprimirEnConsola() {
		/*El método imprime en consola el atributo de la clase*/
		System.out.println(cadena);
	}
	

}
