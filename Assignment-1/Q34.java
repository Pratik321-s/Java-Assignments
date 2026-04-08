//34. Print all prime numbers between 1 to 100.

class Q34
{
	public static void main(String []args){

		System.out.println("Prime numbers between 1 and 100: ");

        	for (int i = 2; i <= 100; i++) {
            		boolean isPrime = true;

            		for (int j = 2; j < i; j++) {
                		if (i % j == 0) {
                    		isPrime = false; 	
                    		break;
                		}
			
           	 }

            	if (isPrime) {
                	System.out.print(i + " ");
            	}

	}

}