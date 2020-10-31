import java.util.Random;

public class ElementsSum {

    public static void combine(int ... elements) {
    	
    	// Sum integer and position identifier   	
    	int sum = 0;
    	int pos = 0;
    	
    	// Go through all the numbers
    	for(int i = 0; elements.length > i ; i ++) {
    		
    		pos = i;
    		  	
    		// Make the addition of the position with all the set of numbers   		
    		for(int j = 0; elements.length > j; j ++ ) {
    			
    			if(j != pos) {
        			
    				//Addition
    				sum =  elements[i] + elements[j];
    				
    				//Print Result
     				System.out.println(String.valueOf(elements[i]) + " + " + String.valueOf(elements[j]) + " = " + sum );

        		}else {
        			continue;
        		}				
    		}	
    	}
    }
	
	public static void main(String[] args) {
		
		System.out.println("Exercise - Get all the possible combination for a set of numbers \n");
		
		// Set of numbers	
		int num1;
		int num2;
		int num3;
		int num4;
		
		num1 = new Random().nextInt(10);
		num2 = new Random().nextInt(10);
		num3 = new Random().nextInt(10);
		num4 = new Random().nextInt(10);
		
		//Print the random numbers generated		
		System.out.println("Numbers: " + num1 + num2 + num3 + num4 + "\n");
		
		//Call the combine method, which will make the addition among all the possibilities		
        combine(num1, num2, num3, num4 );
	}

}
