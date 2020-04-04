import java.util.Random;

public class Matrices {
	
	
	private static int[][] matriz;
	
	
	public static void main(String[] args) {
		
		Random r = new Random();

		matriz = new int[3][5];
		
		matriz[0][0] = 1;
		
		for(int y = 0; y < matriz.length ; y++){
			
			for(int x = 0; x < matriz[0].length ; x++){
				
				matriz[y][x] = r.nextInt(10);
				System.out.print(matriz[y][x]);
			}
			
			System.out.print("\n--------\n");
		}
		
		
	}

}
