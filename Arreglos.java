public class Arreglos {
	
	private static int[] numeros;
		
	public static void main(String[] args) {
		
		
		numeros = new int[5];
		
		numeros[0] = 1;
		numeros[1] = 2;
		numeros[2] = 3;
		numeros[3] = 4;
		numeros[4] = 5;
		
		for( int x = 0; x < numeros.length; x++){
			
			System.out.println(numeros[x]);
			
		}
	
	}

}
