//2. Take two numbers (int and double) and perform: 
//○ Addition 
//○ Division 
//○ Type casting result to int

class TwoNumbers{

public static void main(String args[]){

	int a = 6;
	double d = 2;
	
	double AddResult = a + d;
	
	double DivResult = a / d;

	int b = (int) AddResult;
	int c = (int) DivResult;

	System.out.println("Addition Casted Result: " + b);
	System.out.println("Division Casted Result: " + c); 

	}

}