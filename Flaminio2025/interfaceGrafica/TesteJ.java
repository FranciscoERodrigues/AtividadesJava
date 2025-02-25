package interfaceGrafica;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TesteJ {

	
	// Declaração de um métod de uma ação

		public static void main(String[] args) {
			//Criação do objeto para inserir uma interface gráfica
			
			JFrame quadro = new JFrame();

			//Criação de um botão que possua interface gráfica
			JButton botao = new JButton("Clique Aqui");
			// x axis, y axis, width, height
			botao.setBounds(130, 100, 100, 40);
			//Adicionando um botão ao Frame
			quadro.add(botao);
			// 400 width and 500 height
			quadro.setSize(400, 500);
			// Sem utilizar o gerenciamento de Layout
			quadro.setLayout(null);
			// Torna o quadro visivel
			quadro.setVisible(true);
}
		
}
