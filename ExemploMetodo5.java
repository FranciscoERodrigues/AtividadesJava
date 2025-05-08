package metodos;

public class ExemploMetodo5 {
	
	public static void geladeira(String marca,String modelo, String tipo, String porta, String cor, String material, float valor ){
		
		System.out.println("marca: " + marca);
		System.out.println("modelo: " + modelo);
		System.out.println("Tipo de Degelo: "+ tipo);
		System.out.println("porta: " + porta);
		System.out.println("cor: " + cor);
		System.out.println("material: " + material);
		System.out.println("Preço: " + valor + "R$");
		
	}

	public static void main(String[] args) {
		
		geladeira("LG", "GN-B452PFF", "Frost Free", "Duplex"," Inox Look", "Inox", 5.999f);
		
	

	}

}
