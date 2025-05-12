package metodos;

public class ExemploMetodo10 {


	public static void main(String[]args) {
		
		float salario=1900;
		float salariofinal = 0;
		
		
		if (salario < 2000) {
			
			float reajuste = salario * 10/100;
			salariofinal = salario + reajuste;
			
			System.out.println(salariofinal);		
		}else {
			
			System.out.println(salariofinal);
		}
		
	}
	
	
	
}
	