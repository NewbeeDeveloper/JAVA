
class NoCondicional{}

public class Condicional {
	
	
	public static void main(String[] args) {
	
	
		int x = 15;
		
		String resultado = "" ;
			
		
		if( x > 5 ){
			
			
			if(x > 10){
				System.out.println("Equis es mayor a diez");
			}else {
				System.out.println("Equis es mayor a cinco");
			}
					
			
		}else if( x == 5){
			System.out.println("Equis es igual a cinco");
		}else {
			System.out.println("Equis es NO mayor a cinco");
		}
		
		
		
		resultado = (x > 20)?"Es mayor a veinte":"NO es mayor a 20";
		
		System.out.println(resultado);
		

	}

}
