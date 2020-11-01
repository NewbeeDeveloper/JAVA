public class RecursiveFor {
	
	public static void iterate(int[] array, int pos) {
		
		int size = array.length;
		
		if(size == pos) {		
			return;
		}
		
		for(int i = pos; size > i; i++) {
			System.out.print(array[i]);
		}
		
		System.out.print("\n");
		
		iterate(array, pos + 1);
	
	}
	
	public static void main(String[] args) {
		
		int[] elements = new int[5];
		
		elements[0] = 10;
		elements[1] = 20;
		elements[2] = 30;
		elements[3] = 40;
		elements[4] = 50;
		
		iterate(elements,0);
				
	}

}
