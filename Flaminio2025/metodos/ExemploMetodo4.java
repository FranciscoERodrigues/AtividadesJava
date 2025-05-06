package metodos;

public class ExemploMetodo4 {
	
	public static void computador(String marca,String processador,String memoria, String armazenamento, String operacional, String placa){
		
		System.out.println("Marca:"+ marca);
		System.out.println("Processador :"+ processador);
		System.out.println("Memória RAM:" + memoria);
		System.out.println("Armazenamento:" + armazenamento);
		System.out.println("Sistema Operacional:" + operacional);
		System.out.println("Placa de vídeo:" + placa);
		
		
		
	
	}
	
	public static void main(String[] args) {
		
		computador("HP","Intel Core i3 ou AMD Ryzen 3", "4 GB", "128 GB SSD ou HD de 500 GB", "Windows 10, 11 ou Linux, Integrada (Intel UHD", "Radeon Vega");
			

	}

}
