
public class RecursiveClass {
	
	
	public static void iterate(int[] array, int pos) {
		
		int size = array.length;
		
		if(size == pos) {		
			return;
		}
		
		System.out.println(array[pos]);
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
