package metodos;

public class Cafe{

	public static String dadosCafe(int idCafe, String nomeCafe, String marcaCafe, String modeloCafe) {
		
		return  "\n " +idCafe + "\n "+nomeCafe+ "\n "+marcaCafe+ "\n "+modeloCafe;
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("Dados do Café: "+ dadosCafe(1 ,"Pelé","Café Pelé","Torrado e Moído"));
		

	}

}
