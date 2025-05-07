package metodos;


public class ExemploMetodo6 {
	
	public static void VerificarIdade(int idade){
		
		
		if(idade < 18) {
			
			System.out.println(" Acesso recusado ");
		}else {
			
			System.out.println( "Acesso Liberado");
			
		}
		
	}

	public static void main(String[] args) {
 
			VerificarIdade(18);

	}

}
