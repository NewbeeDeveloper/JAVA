
public class EstructurasRepetitivas {
	
	public static void main(String[] args) {
		
		// Estructura For Simple
		System.out.println("######### FOR");
		for(int j = 0; j < 10; j++){
			
			System.out.print(j);
			
		}
		
		System.out.println("\n");
		
		// Estructura For Anidada
		System.out.println("######### FOR ANIDADO");
		
		for(int x = 0; x < 10; x++){
			
			System.out.println(x + " - Ciclo Base");
			
			for(int y = 0; y < 10; y++){
				
				System.out.print(y);
				
			}
			
			System.out.print("\n");
			
		}
		
		System.out.print("\n");
		
		//Estructura While
		System.out.println("########## WHILE");
		
		int k = 0;
		
		while( k < 10 ) {
			
			System.out.println(k);
			
			k++;
			
		}
		
		System.out.print("\n");	
		
		// Estructura Do While
		System.out.println("######### DO WHILE");
		
		int a = 5;
		
		do {
			
			System.out.print(a);
			
			a++;
			
		}while( a < 10 );
			
		
		
	}

}
