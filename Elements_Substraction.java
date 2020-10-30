
public class Elements_Substraction {

    public static int evaluate(int[] elements) {
        
    	//
		int higher = 0;
		int less   = 0;
		int index  = 0;      
        
		for(int i = 0 ; elements.length > i ; i++) {
			
			if( elements[i] > higher ) {				
				higher = elements[i];			
			}
			
			if(index == 0 ) {			
				less = elements[i];
				index = 1;
			}else if(index > 0 && less > elements[i] ) {			
				less = elements[i];
			}			
			
		}
		return higher - less;
        
    }
	
	public static void main(String[] args) {
		
		System.out.println("Exercise - Subtraction of the major and minor element\n");
		
		int[] elements = new int[5];
		
		elements[0] = 10;
		elements[1] = 20;
		elements[2] = 30;
		elements[3] = 40;
		elements[4] = 50;
		
		System.out.println("Result: " + evaluate(elements));

	}

}
