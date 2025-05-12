package metodos;

public class ExemploMetodo9 {

	
	static int plusMetodosInt(int x, int y ) {
	    return x + y;	
	  }
	
	static double plusMetodosDouble(double x, double y) {
		return x + y;
		
	}
	
	
	public static void main(String[]args) {
		int numero01 = plusMetodosInt(8,5);
		double numero02 = plusMetodosDouble(4.3, 6.26);
		 System.out.println("int: " + numero01);
		    System.out.println("double: " + numero02);
	}
	
}